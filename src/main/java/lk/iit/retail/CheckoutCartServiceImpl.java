package lk.iit.retail;

import io.grpc.stub.StreamObserver;
import lk.iit.EtcdClient;
import lk.iit.retail.client.CheckoutServiceClient;
import lk.iit.retail.grpc.generated.CheckoutCartServiceGrpc;
import lk.iit.retail.grpc.generated.CheckoutRequest;
import lk.iit.retail.grpc.generated.CheckoutResponse;
import lk.iit.retail.model.Catalogue;
import lk.iit.retail.model.Checkout;
import lk.iit.retail.model.ShoppingCart;
import org.apache.zookeeper.KeeperException;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

public class CheckoutCartServiceImpl extends CheckoutCartServiceGrpc.CheckoutCartServiceImplBase {
    private static final SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
    public static final String ZOOKEEPER_URL = "127.0.0.1:2181";
    private List<String> nodes = Arrays.asList("node1", "node2");//TODO

    @Override
    public void checkoutCart(CheckoutRequest request, StreamObserver<CheckoutResponse> responseObserver) {
        boolean isCheckout = checkoutCart(request.getShopperId());
        if (isCheckout) {
            for (String node: nodes) {
                String endpoint = getEndPoint(node);
                CheckoutServiceClient checkoutServiceClient = new CheckoutServiceClient(endpoint.split(":")[0], Integer.parseInt(endpoint.split(":")[1]));
                checkoutServiceClient.initializeConnection();
                checkoutServiceClient.processUserRequests();
                checkoutServiceClient.closeConnection();
            }
        }
        CheckoutResponse checkoutResponse = CheckoutResponse.newBuilder().setIsCheckout(isCheckout).build();
        responseObserver.onNext(checkoutResponse);
        responseObserver.onCompleted();
    }

    public boolean checkoutCart(int shopperId) {
        AddShoppingCartServiceImpl addShoppingCartService = new AddShoppingCartServiceImpl();
        UpdateCatalogueServiceImpl updateCatalogueService = new UpdateCatalogueServiceImpl();
        boolean isCheckout = false;
        ShoppingCart shoppingCart = addShoppingCartService.getShoppingCartByShopperId(shopperId);
        if (shoppingCart != null) {
            List<Catalogue> checkoutCatalogueList = new ArrayList<>();
            Checkout checkout = new Checkout();
            checkout.setCheckoutId(new Random().nextInt());
            for (Catalogue catalogue : shoppingCart.getCatalogueList()) {
                Optional<Catalogue> catalogueOptional = updateCatalogueService.getCatalogueById(catalogue.getId());
                if (catalogueOptional.isPresent()) {
                    Catalogue stockCatalogue = catalogueOptional.get();
                    DistributedLock.setZooKeeperURL(ZOOKEEPER_URL);
                    DistributedLock lock = null;
                    try {
                        lock = new DistributedLock("checkout-cart");
                        lock.acquireLock();
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (KeeperException e) {
                        e.printStackTrace();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("distributed lock created for checkout operation " + getCurrentTimeStamp());
                    if (stockCatalogue.getQuantity() >= catalogue.getQuantity()) {
                        System.out.println(Thread.currentThread().getName() + " - Catalogue is checking out " + stockCatalogue.toString() + ", checkout quantity -> " + catalogue.getQuantity());
                        checkoutCatalogueList.add(catalogue);
                        // Update existing catalogue
                        stockCatalogue.setQuantity(stockCatalogue.getQuantity() - catalogue.getQuantity());
                        List<Catalogue> catalogueList = UpdateCatalogueServiceImpl.getCatalogueList();
                        catalogueList.remove(stockCatalogue.getId());
                        catalogueList.add(stockCatalogue.getId(), stockCatalogue);
                        isCheckout = true;
                    } else {
                        System.out.println(Thread.currentThread().getName() + " - Catalogue can't check out");
                    }
                    try {
                        lock.releaseLock();
                    } catch (KeeperException e) {
                        e.printStackTrace();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Releasing the lock for checkout operation " + getCurrentTimeStamp());
                }
            }
        } else {
            System.out.println(Thread.currentThread().getName() + " - Catalogue can't check out");
        }
        return isCheckout;
    }

    private static String getEndPoint(String serverName) {
        EtcdClient client = new EtcdClient();
        client.setEtcdUrl("http://localhost:2379");
        return client.getEtcdKVClient(serverName);
    }
    private static String getCurrentTimeStamp() {
        return timeFormat.format(new Date(System.currentTimeMillis()));
    }
}
