package lk.iit.retail;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import lk.iit.EtcdClient;

import java.io.IOException;

public class RetailServer {
    private int serverPort;

    public RetailServer(String host, int port) {
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

    public static void main(String[] args) throws IOException, InterruptedException {
//        int serverPort = Integer.parseInt(args[0]);
        int serverPort = 5000;
//        String serviceName = args[1];
        String serviceName = "node1";

        RetailServer server = new RetailServer("localhost", serverPort);
        registerService(serviceName, serverPort);
        server.startServer();
    }

    private static void registerService(String serverName, int serverPort) {
        EtcdClient client = new EtcdClient();
        client.setEtcdUrl("http://127.0.0.1:2379");
        client.putEtcdKVClient(serverName, "127.0.0.1:"+serverPort);
    }
}
