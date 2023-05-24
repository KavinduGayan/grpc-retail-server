package lk.iit.retail;

import io.grpc.stub.StreamObserver;
import lk.iit.retail.grpc.generated.UpdateCatalogueRequest;
import lk.iit.retail.grpc.generated.UpdateCatalogueResponse;
import lk.iit.retail.grpc.generated.UpdateCatalogueServiceGrpc;
import lk.iit.retail.model.Catalogue;
import org.apache.zookeeper.KeeperException;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

public class UpdateCatalogueServiceImpl extends UpdateCatalogueServiceGrpc.UpdateCatalogueServiceImplBase {
    private static final SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
    private static List<Catalogue> catalogueList = new ArrayList<>();
    Random random = new Random();
    public static final String ZOOKEEPER_URL = "127.0.0.1:2181";

    public UpdateCatalogueServiceImpl() {
        addDummyValues();
    }

    @Override
    public void updateCatalogue(UpdateCatalogueRequest request, StreamObserver<UpdateCatalogueResponse> responseObserver) {
        String catalogueId = request.getCatalogueId();
        int addQuantity = request.getUpdateQuantity();
        boolean isUpdate = false;
        System.out.println("Request received.. catalogue id " + catalogueId);
        Optional<Catalogue> updateCatalogueOptional = getCatalogueById(Integer.parseInt(catalogueId));
        if (updateCatalogueOptional.isPresent()) {
            Catalogue updateCatalogue = updateCatalogueOptional.get();
            System.out.println(" update catalogue : " + updateCatalogue.toString());
            System.out.println("Add new quantity: " + addQuantity);
            DistributedLock.setZooKeeperURL(ZOOKEEPER_URL);
            DistributedLock lock = null;
            try {
                lock = new DistributedLock("update-catalogue");
                lock.acquireLock();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (KeeperException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("distributed lock created for update catalogue operation " + getCurrentTimeStamp());
            int newQuantity = updateCatalogue.getQuantity() + addQuantity;
            updateCatalogue.setQuantity(newQuantity);
            catalogueList.remove(updateCatalogue.getId());
            catalogueList.add(updateCatalogue.getId(), updateCatalogue);
            try {
                lock.releaseLock();
            } catch (KeeperException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Releasing the lock for update catalogue operation " + getCurrentTimeStamp());
            isUpdate = true;
        } else {
            System.out.println("update record is not available " + catalogueId);
        }
        UpdateCatalogueResponse updateCatalogueResponse = UpdateCatalogueResponse
                .newBuilder()
                .setIsUpdate(isUpdate)
                .build();
        responseObserver.onNext(updateCatalogueResponse);
        responseObserver.onCompleted();
    }

    public Optional<Catalogue> getCatalogueById(int id) {
        for (Catalogue catalogue : catalogueList) {
            if (catalogue.getId() == id) {
                return Optional.of(catalogue);
            }
        }
        return Optional.empty();
    }

    //Add dummy values
    private void addDummyValues() {
        Catalogue catalogue = null;
        for (int i = 0; i <= 10; i++) {
            catalogue = new Catalogue();
            catalogue.setId(i);
            catalogue.setName("catalogue " + i);
            catalogue.setQuantity(i * 5);
            catalogueList.add(catalogue);
        }
    }

    public static List<Catalogue> getCatalogueList() {
        return catalogueList;
    }

    private static String getCurrentTimeStamp() {
        return timeFormat.format(new Date(System.currentTimeMillis()));
    }
}
