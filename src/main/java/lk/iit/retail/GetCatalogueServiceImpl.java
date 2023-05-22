package lk.iit.retail;

import io.grpc.stub.StreamObserver;
import lk.iit.retail.grpc.generated.GetCatalogueRequest;
import lk.iit.retail.grpc.generated.GetCatalogueResponse;
import lk.iit.retail.grpc.generated.GetCatalogueServiceGrpc;
import lk.iit.retail.model.Catalogue;

import java.util.ArrayList;
import java.util.List;

public class GetCatalogueServiceImpl extends GetCatalogueServiceGrpc.GetCatalogueServiceImplBase {

    @Override
    public void getCatalogue(GetCatalogueRequest request, StreamObserver<GetCatalogueResponse> responseObserver) {
        System.out.println("request receive" +
                "");
        List<Catalogue> catalogueList = UpdateCatalogueServiceImpl.getCatalogueList();
        List<lk.iit.retail.grpc.generated.Catalogue> catalogues = new ArrayList<>();
        for (Catalogue catalogue: catalogueList) {
            catalogues.add(lk.iit.retail.grpc.generated.Catalogue.newBuilder().setId(catalogue.getId()).setName(catalogue.getName())
                    .setQuantity(catalogue.getQuantity()).build());
        }
        GetCatalogueResponse getCatalogueResponse = GetCatalogueResponse
                .newBuilder()
                .addAllCatalogues(catalogues)
                .build();
        responseObserver.onNext(getCatalogueResponse);
        responseObserver.onCompleted();
    }
}
