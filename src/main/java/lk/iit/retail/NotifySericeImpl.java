package lk.iit.retail;

import io.grpc.stub.StreamObserver;
import lk.iit.retail.grpc.generated.*;

import java.util.HashMap;
import java.util.Map;

public class NotifySericeImpl extends UpdateNotifyServiceGrpc.UpdateNotifyServiceImplBase {

    @Override
    public void updateNotifyService(NotifyRequest request, StreamObserver<NotifyResponse> responseObserver) {
        System.out.println("notify request received");
        Map<String, String> map = new HashMap<>();
        getRequestPayloadMap(request, map);
        boolean isSync = false;
        if (request.getNotifyType() == 1) { //update catalogue
            UpdateCatalogueServiceImpl updateCatalogueService = new UpdateCatalogueServiceImpl();
            isSync = updateCatalogueService.updateCatalogue(map.get("cataloguId"), Integer.parseInt(map.get("quantity")));
        } else if (request.getNotifyType() == 2) { //checkout cart
            CheckoutCartServiceImpl checkoutCartService = new CheckoutCartServiceImpl();
            isSync = checkoutCartService.checkoutCart(Integer.parseInt(map.get("shopperId")));
        } else { //add shopping cart
            AddShoppingCartServiceImpl addShoppingCartService = new AddShoppingCartServiceImpl();
            isSync = addShoppingCartService.addShoppingCart(Integer.parseInt(map.get("catalogueId")), Integer.parseInt(map.get("quantity")), Integer.parseInt(map.get("shopperId")));
        }
        NotifyResponse notifyResponse = NotifyResponse.newBuilder().setIsUpdate(isSync).build();
        responseObserver.onNext(notifyResponse);
        responseObserver.onCompleted();
    }

    private void getRequestPayloadMap(NotifyRequest request, Map<String, String> map) {
        String[] pairs = request.getNotifyPayload().split(",");
        for (String pair : pairs) {
            String[] keyValue = pair.split("=");
            if (keyValue.length == 2) {
                String key = keyValue[0];
                String value = keyValue[1];
                map.put(key, value);
            }
        }
    }
}
