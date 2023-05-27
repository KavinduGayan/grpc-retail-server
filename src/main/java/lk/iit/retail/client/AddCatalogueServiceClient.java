package lk.iit.retail.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lk.iit.retail.grpc.generated.AddShoppingCartRequest;
import lk.iit.retail.grpc.generated.AddShoppingCartResponse;
import lk.iit.retail.grpc.generated.AddShoppingCartServiceGrpc;

public class AddCatalogueServiceClient {
    private ManagedChannel channel = null;
    AddShoppingCartServiceGrpc.AddShoppingCartServiceBlockingStub clientStub = null;

    String host = null;
    int port = -1;

    public AddCatalogueServiceClient(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void initializeConnection () {
        System.out.println("Initializing Connecting to server at " + host + ":" +
                port);
        channel = ManagedChannelBuilder.forAddress("localhost", port)
                .usePlaintext()
                .build();
        clientStub = AddShoppingCartServiceGrpc.newBlockingStub(channel);
    }

    public void closeConnection() {
        channel.shutdown();
    }

    public void processUserRequests() {
        AddShoppingCartRequest addShoppingCartRequest = AddShoppingCartRequest.newBuilder().build();
        AddShoppingCartResponse addShoppingCartResponse = clientStub.addShoppingCart(addShoppingCartRequest);
        System.out.println("shopping cart add status ->" + addShoppingCartResponse.getIsUpdated());
    }
}
