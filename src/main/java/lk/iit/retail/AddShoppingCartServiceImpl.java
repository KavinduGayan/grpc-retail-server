package lk.iit.retail;

import io.grpc.stub.StreamObserver;
import lk.iit.retail.grpc.generated.AddShoppingCartRequest;
import lk.iit.retail.grpc.generated.AddShoppingCartResponse;
import lk.iit.retail.grpc.generated.AddShoppingCartServiceGrpc;
import lk.iit.retail.model.Catalogue;
import lk.iit.retail.model.ShoppingCart;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AddShoppingCartServiceImpl extends AddShoppingCartServiceGrpc.AddShoppingCartServiceImplBase {

    private static List<ShoppingCart> shoppingCartList = new ArrayList<>();

    @Override
    public void addShoppingCart(AddShoppingCartRequest request, StreamObserver<AddShoppingCartResponse> responseObserver) {
        System.out.println("request receive");
        int catalogueId = request.getCatalogueId();
        int quantity = request.getQuantity();
        int shopperId = request.getShopperId();
        boolean isUpdate = false;

        UpdateCatalogueServiceImpl updateCatalogueService = new UpdateCatalogueServiceImpl();
        List<Catalogue> catalogueList = updateCatalogueService.getCatalogueList();
        boolean isSelectedCatalogue = catalogueList.stream().anyMatch(catalogue -> catalogue.getId()==catalogueId);
        if (isSelectedCatalogue) {
            Catalogue selectedCatalogue = catalogueList.get(catalogueId);
            System.out.println("selected :" + selectedCatalogue.getName() + " and quantity " + quantity);

            Catalogue catalogue = new Catalogue();
            catalogue.setId(selectedCatalogue.getId());
            catalogue.setName(selectedCatalogue.getName());
            catalogue.setQuantity(quantity);

            ShoppingCart shoppingCartByShopperId = getShoppingCartByShopperId(shopperId);
            if (shoppingCartByShopperId == null) {
                List<Catalogue> catalogues = new ArrayList<>();
                catalogues.add(catalogue);

                ShoppingCart shoppingCart = new ShoppingCart();
                shoppingCart.setCartId(new Random().nextInt(1000));
                shoppingCart.setShopperId(shopperId);
                shoppingCart.setCatalogueList(catalogues);
                shoppingCartList.add(shoppingCart);
            } else {
                shoppingCartList.remove(shoppingCartByShopperId);
                shoppingCartByShopperId.getCatalogueList().add(catalogue);
                shoppingCartList.add(shoppingCartByShopperId);
            }
            isUpdate = true;
        } else {
            System.out.println("catalogue is not available...");
        }
        AddShoppingCartResponse addShoppingCartResponse = AddShoppingCartResponse.newBuilder().setIsUpdated(isUpdate).build();
        responseObserver.onNext(addShoppingCartResponse);
        responseObserver.onCompleted();
    }

    public ShoppingCart getShoppingCartByShopperId(int shopperId) {
        for (ShoppingCart cart : shoppingCartList) {
            if (cart.getShopperId() == shopperId) {
                return cart;
            }
        }
        return null;
    }
}
