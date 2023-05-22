package lk.iit.retail;

import io.grpc.stub.StreamObserver;
import lk.iit.retail.grpc.generated.CheckoutCartServiceGrpc;
import lk.iit.retail.grpc.generated.CheckoutRequest;
import lk.iit.retail.grpc.generated.CheckoutResponse;
import lk.iit.retail.model.Catalogue;
import lk.iit.retail.model.Checkout;
import lk.iit.retail.model.ShoppingCart;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class CheckoutCartServiceImpl extends CheckoutCartServiceGrpc.CheckoutCartServiceImplBase {

    @Override
    public void checkoutCart(CheckoutRequest request, StreamObserver<CheckoutResponse> responseObserver) {
        AddShoppingCartServiceImpl addShoppingCartService = new AddShoppingCartServiceImpl();
        UpdateCatalogueServiceImpl updateCatalogueService = new UpdateCatalogueServiceImpl();
        boolean isCheckout = false;
        ShoppingCart shoppingCart = addShoppingCartService.getShoppingCartByShopperId(request.getShopperId());
        if (shoppingCart != null) {
            List<Catalogue> checkoutCatalogueList = new ArrayList<>();
            Checkout checkout = new Checkout();
            checkout.setCheckoutId(new Random().nextInt());
            for (Catalogue catalogue : shoppingCart.getCatalogueList()) {
                Optional<Catalogue> catalogueOptional = updateCatalogueService.getCatalogueById(catalogue.getId());
                if (catalogueOptional.isPresent()) {
                    Catalogue stockCatalogue = catalogueOptional.get();
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
                }
            }
        } else {
            System.out.println(Thread.currentThread().getName() + " - Catalogue can't check out");
        }
        CheckoutResponse checkoutResponse = CheckoutResponse.newBuilder().setIsCheckout(isCheckout).build();
        responseObserver.onNext(checkoutResponse);
        responseObserver.onCompleted();
    }
}
