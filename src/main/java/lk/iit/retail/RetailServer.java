package lk.iit.retail;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class RetailServer
{
    private int serverPort;
    public RetailServer(String host, int port){
        this.serverPort = port;
    }
    public void startServer() throws IOException, InterruptedException {
        Server server = ServerBuilder
                .forPort(serverPort)
                .addService(new UpdateCatalogueServiceImpl())
                .addService(new GetCatalogueServiceImpl())
                .addService(new AddShoppingCartServiceImpl())
                .addService(new CheckoutCartServiceImpl())
                .build();
        server.start();
        System.out.println("RetailServer Started and ready to accept requests on port " + serverPort);

        server.awaitTermination();
    }
    public static void main( String[] args ) throws IOException, InterruptedException {
        int serverPort = 5000;

        RetailServer server = new RetailServer("localhost", serverPort);
        server.startServer();
    }
}
