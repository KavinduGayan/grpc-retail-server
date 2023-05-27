package lk.iit.retail.grpc.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: RetailService.proto")
public final class UpdateCatalogueServiceGrpc {

  private UpdateCatalogueServiceGrpc() {}

  public static final String SERVICE_NAME = "lk.iit.retail.grpc.generated.UpdateCatalogueService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<lk.iit.retail.grpc.generated.UpdateCatalogueRequest,
      lk.iit.retail.grpc.generated.UpdateCatalogueResponse> getUpdateCatalogueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateCatalogue",
      requestType = lk.iit.retail.grpc.generated.UpdateCatalogueRequest.class,
      responseType = lk.iit.retail.grpc.generated.UpdateCatalogueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<lk.iit.retail.grpc.generated.UpdateCatalogueRequest,
      lk.iit.retail.grpc.generated.UpdateCatalogueResponse> getUpdateCatalogueMethod() {
    io.grpc.MethodDescriptor<lk.iit.retail.grpc.generated.UpdateCatalogueRequest, lk.iit.retail.grpc.generated.UpdateCatalogueResponse> getUpdateCatalogueMethod;
    if ((getUpdateCatalogueMethod = UpdateCatalogueServiceGrpc.getUpdateCatalogueMethod) == null) {
      synchronized (UpdateCatalogueServiceGrpc.class) {
        if ((getUpdateCatalogueMethod = UpdateCatalogueServiceGrpc.getUpdateCatalogueMethod) == null) {
          UpdateCatalogueServiceGrpc.getUpdateCatalogueMethod = getUpdateCatalogueMethod =
              io.grpc.MethodDescriptor.<lk.iit.retail.grpc.generated.UpdateCatalogueRequest, lk.iit.retail.grpc.generated.UpdateCatalogueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateCatalogue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lk.iit.retail.grpc.generated.UpdateCatalogueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lk.iit.retail.grpc.generated.UpdateCatalogueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UpdateCatalogueServiceMethodDescriptorSupplier("updateCatalogue"))
              .build();
        }
      }
    }
    return getUpdateCatalogueMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UpdateCatalogueServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UpdateCatalogueServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UpdateCatalogueServiceStub>() {
        @java.lang.Override
        public UpdateCatalogueServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UpdateCatalogueServiceStub(channel, callOptions);
        }
      };
    return UpdateCatalogueServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UpdateCatalogueServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UpdateCatalogueServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UpdateCatalogueServiceBlockingStub>() {
        @java.lang.Override
        public UpdateCatalogueServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UpdateCatalogueServiceBlockingStub(channel, callOptions);
        }
      };
    return UpdateCatalogueServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UpdateCatalogueServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UpdateCatalogueServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UpdateCatalogueServiceFutureStub>() {
        @java.lang.Override
        public UpdateCatalogueServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UpdateCatalogueServiceFutureStub(channel, callOptions);
        }
      };
    return UpdateCatalogueServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UpdateCatalogueServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void updateCatalogue(lk.iit.retail.grpc.generated.UpdateCatalogueRequest request,
        io.grpc.stub.StreamObserver<lk.iit.retail.grpc.generated.UpdateCatalogueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCatalogueMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUpdateCatalogueMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                lk.iit.retail.grpc.generated.UpdateCatalogueRequest,
                lk.iit.retail.grpc.generated.UpdateCatalogueResponse>(
                  this, METHODID_UPDATE_CATALOGUE)))
          .build();
    }
  }

  /**
   */
  public static final class UpdateCatalogueServiceStub extends io.grpc.stub.AbstractAsyncStub<UpdateCatalogueServiceStub> {
    private UpdateCatalogueServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdateCatalogueServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UpdateCatalogueServiceStub(channel, callOptions);
    }

    /**
     */
    public void updateCatalogue(lk.iit.retail.grpc.generated.UpdateCatalogueRequest request,
        io.grpc.stub.StreamObserver<lk.iit.retail.grpc.generated.UpdateCatalogueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCatalogueMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UpdateCatalogueServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UpdateCatalogueServiceBlockingStub> {
    private UpdateCatalogueServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdateCatalogueServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UpdateCatalogueServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public lk.iit.retail.grpc.generated.UpdateCatalogueResponse updateCatalogue(lk.iit.retail.grpc.generated.UpdateCatalogueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCatalogueMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UpdateCatalogueServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UpdateCatalogueServiceFutureStub> {
    private UpdateCatalogueServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdateCatalogueServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UpdateCatalogueServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lk.iit.retail.grpc.generated.UpdateCatalogueResponse> updateCatalogue(
        lk.iit.retail.grpc.generated.UpdateCatalogueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCatalogueMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPDATE_CATALOGUE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UpdateCatalogueServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UpdateCatalogueServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPDATE_CATALOGUE:
          serviceImpl.updateCatalogue((lk.iit.retail.grpc.generated.UpdateCatalogueRequest) request,
              (io.grpc.stub.StreamObserver<lk.iit.retail.grpc.generated.UpdateCatalogueResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UpdateCatalogueServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UpdateCatalogueServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return lk.iit.retail.grpc.generated.RetailService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UpdateCatalogueService");
    }
  }

  private static final class UpdateCatalogueServiceFileDescriptorSupplier
      extends UpdateCatalogueServiceBaseDescriptorSupplier {
    UpdateCatalogueServiceFileDescriptorSupplier() {}
  }

  private static final class UpdateCatalogueServiceMethodDescriptorSupplier
      extends UpdateCatalogueServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UpdateCatalogueServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UpdateCatalogueServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UpdateCatalogueServiceFileDescriptorSupplier())
              .addMethod(getUpdateCatalogueMethod())
              .build();
        }
      }
    }
    return result;
  }
}
