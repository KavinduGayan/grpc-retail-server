package lk.iit.retail.grpc.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: RetailService.proto")
public final class GetCatalogueServiceGrpc {

  private GetCatalogueServiceGrpc() {}

  public static final String SERVICE_NAME = "lk.iit.retail.grpc.generated.GetCatalogueService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<lk.iit.retail.grpc.generated.GetCatalogueRequest,
      lk.iit.retail.grpc.generated.GetCatalogueResponse> getGetCatalogueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCatalogue",
      requestType = lk.iit.retail.grpc.generated.GetCatalogueRequest.class,
      responseType = lk.iit.retail.grpc.generated.GetCatalogueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<lk.iit.retail.grpc.generated.GetCatalogueRequest,
      lk.iit.retail.grpc.generated.GetCatalogueResponse> getGetCatalogueMethod() {
    io.grpc.MethodDescriptor<lk.iit.retail.grpc.generated.GetCatalogueRequest, lk.iit.retail.grpc.generated.GetCatalogueResponse> getGetCatalogueMethod;
    if ((getGetCatalogueMethod = GetCatalogueServiceGrpc.getGetCatalogueMethod) == null) {
      synchronized (GetCatalogueServiceGrpc.class) {
        if ((getGetCatalogueMethod = GetCatalogueServiceGrpc.getGetCatalogueMethod) == null) {
          GetCatalogueServiceGrpc.getGetCatalogueMethod = getGetCatalogueMethod =
              io.grpc.MethodDescriptor.<lk.iit.retail.grpc.generated.GetCatalogueRequest, lk.iit.retail.grpc.generated.GetCatalogueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCatalogue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lk.iit.retail.grpc.generated.GetCatalogueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lk.iit.retail.grpc.generated.GetCatalogueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GetCatalogueServiceMethodDescriptorSupplier("getCatalogue"))
              .build();
        }
      }
    }
    return getGetCatalogueMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GetCatalogueServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GetCatalogueServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GetCatalogueServiceStub>() {
        @java.lang.Override
        public GetCatalogueServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GetCatalogueServiceStub(channel, callOptions);
        }
      };
    return GetCatalogueServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GetCatalogueServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GetCatalogueServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GetCatalogueServiceBlockingStub>() {
        @java.lang.Override
        public GetCatalogueServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GetCatalogueServiceBlockingStub(channel, callOptions);
        }
      };
    return GetCatalogueServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GetCatalogueServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GetCatalogueServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GetCatalogueServiceFutureStub>() {
        @java.lang.Override
        public GetCatalogueServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GetCatalogueServiceFutureStub(channel, callOptions);
        }
      };
    return GetCatalogueServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GetCatalogueServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getCatalogue(lk.iit.retail.grpc.generated.GetCatalogueRequest request,
        io.grpc.stub.StreamObserver<lk.iit.retail.grpc.generated.GetCatalogueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCatalogueMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCatalogueMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                lk.iit.retail.grpc.generated.GetCatalogueRequest,
                lk.iit.retail.grpc.generated.GetCatalogueResponse>(
                  this, METHODID_GET_CATALOGUE)))
          .build();
    }
  }

  /**
   */
  public static final class GetCatalogueServiceStub extends io.grpc.stub.AbstractAsyncStub<GetCatalogueServiceStub> {
    private GetCatalogueServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetCatalogueServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GetCatalogueServiceStub(channel, callOptions);
    }

    /**
     */
    public void getCatalogue(lk.iit.retail.grpc.generated.GetCatalogueRequest request,
        io.grpc.stub.StreamObserver<lk.iit.retail.grpc.generated.GetCatalogueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCatalogueMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GetCatalogueServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GetCatalogueServiceBlockingStub> {
    private GetCatalogueServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetCatalogueServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GetCatalogueServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public lk.iit.retail.grpc.generated.GetCatalogueResponse getCatalogue(lk.iit.retail.grpc.generated.GetCatalogueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCatalogueMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GetCatalogueServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GetCatalogueServiceFutureStub> {
    private GetCatalogueServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetCatalogueServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GetCatalogueServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lk.iit.retail.grpc.generated.GetCatalogueResponse> getCatalogue(
        lk.iit.retail.grpc.generated.GetCatalogueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCatalogueMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CATALOGUE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GetCatalogueServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GetCatalogueServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CATALOGUE:
          serviceImpl.getCatalogue((lk.iit.retail.grpc.generated.GetCatalogueRequest) request,
              (io.grpc.stub.StreamObserver<lk.iit.retail.grpc.generated.GetCatalogueResponse>) responseObserver);
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

  private static abstract class GetCatalogueServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GetCatalogueServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return lk.iit.retail.grpc.generated.RetailService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GetCatalogueService");
    }
  }

  private static final class GetCatalogueServiceFileDescriptorSupplier
      extends GetCatalogueServiceBaseDescriptorSupplier {
    GetCatalogueServiceFileDescriptorSupplier() {}
  }

  private static final class GetCatalogueServiceMethodDescriptorSupplier
      extends GetCatalogueServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GetCatalogueServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GetCatalogueServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GetCatalogueServiceFileDescriptorSupplier())
              .addMethod(getGetCatalogueMethod())
              .build();
        }
      }
    }
    return result;
  }
}
