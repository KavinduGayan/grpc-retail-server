package lk.iit.retail.client;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Scanner;

public class UpdateCatalogueServiceClient {
    private ManagedChannel channel = null;
    lk.iit.retail.grpc.generated.UpdateCatalogueServiceGrpc.UpdateCatalogueServiceBlockingStub clientStub = null;
    String host = null;
    int port = -1;
    private boolean isUpdate = true;

    public UpdateCatalogueServiceClient(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void initializeConnection () {
        System.out.println("Initializing Connecting to server at " + host + ":" +
                port);
        channel = ManagedChannelBuilder.forAddress("localhost", port)
                .usePlaintext()
                .build();
        clientStub = lk.iit.retail.grpc.generated.UpdateCatalogueServiceGrpc.newBlockingStub(channel);
    }

    public void closeConnection() {
        channel.shutdown();
    }

    public void processUserRequests() throws InterruptedException {
        while (isUpdate) {
            Scanner userInput = new Scanner(System.in);
            System.out.println("\nEnter Catalogue ID to update the quantity :");
            String catalogueId = userInput.nextLine().trim();
            System.out.println("\nEnter quantity to update the quantity :");
            String quantity = userInput.nextLine().trim();
            System.out.println("Requesting server to update the catalogue " + catalogueId);
            lk.iit.retail.grpc.generated.UpdateCatalogueRequest request = lk.iit.retail.grpc.generated.UpdateCatalogueRequest
                    .newBuilder()
                    .setCatalogueId(catalogueId)
                    .setUpdateQuantity(Integer.parseInt(quantity))
                    .build();
            lk.iit.retail.grpc.generated.UpdateCatalogueResponse response = clientStub.updateCatalogue(request);
            System.out.println("Catalogue update status " + response.getIsUpdate());
            Thread.sleep(1000);
            System.out.println("Do you want update another catalogue yes/no?");
            String isUpdateResposnse = userInput.nextLine().trim();
            if ("no".equals(isUpdateResposnse)) {
                isUpdate = false;
            }
        }
    }
}
