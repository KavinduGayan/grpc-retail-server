package lk.iit.retail.grpc.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: RetailService.proto")
public final class AddShoppingCartServiceGrpc {

  private AddShoppingCartServiceGrpc() {}

  public static final String SERVICE_NAME = "lk.iit.retail.grpc.generated.AddShoppingCartService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<lk.iit.retail.grpc.generated.AddShoppingCartRequest,
      lk.iit.retail.grpc.generated.AddShoppingCartResponse> getAddShoppingCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addShoppingCart",
      requestType = lk.iit.retail.grpc.generated.AddShoppingCartRequest.class,
      responseType = lk.iit.retail.grpc.generated.AddShoppingCartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<lk.iit.retail.grpc.generated.AddShoppingCartRequest,
      lk.iit.retail.grpc.generated.AddShoppingCartResponse> getAddShoppingCartMethod() {
    io.grpc.MethodDescriptor<lk.iit.retail.grpc.generated.AddShoppingCartRequest, lk.iit.retail.grpc.generated.AddShoppingCartResponse> getAddShoppingCartMethod;
    if ((getAddShoppingCartMethod = AddShoppingCartServiceGrpc.getAddShoppingCartMethod) == null) {
      synchronized (AddShoppingCartServiceGrpc.class) {
        if ((getAddShoppingCartMethod = AddShoppingCartServiceGrpc.getAddShoppingCartMethod) == null) {
          AddShoppingCartServiceGrpc.getAddShoppingCartMethod = getAddShoppingCartMethod =
              io.grpc.MethodDescriptor.<lk.iit.retail.grpc.generated.AddShoppingCartRequest, lk.iit.retail.grpc.generated.AddShoppingCartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addShoppingCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lk.iit.retail.grpc.generated.AddShoppingCartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lk.iit.retail.grpc.generated.AddShoppingCartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AddShoppingCartServiceMethodDescriptorSupplier("addShoppingCart"))
              .build();
        }
      }
    }
    return getAddShoppingCartMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AddShoppingCartServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AddShoppingCartServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AddShoppingCartServiceStub>() {
        @java.lang.Override
        public AddShoppingCartServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AddShoppingCartServiceStub(channel, callOptions);
        }
      };
    return AddShoppingCartServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AddShoppingCartServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AddShoppingCartServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AddShoppingCartServiceBlockingStub>() {
        @java.lang.Override
        public AddShoppingCartServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AddShoppingCartServiceBlockingStub(channel, callOptions);
        }
      };
    return AddShoppingCartServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AddShoppingCartServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AddShoppingCartServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AddShoppingCartServiceFutureStub>() {
        @java.lang.Override
        public AddShoppingCartServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AddShoppingCartServiceFutureStub(channel, callOptions);
        }
      };
    return AddShoppingCartServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AddShoppingCartServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addShoppingCart(lk.iit.retail.grpc.generated.AddShoppingCartRequest request,
        io.grpc.stub.StreamObserver<lk.iit.retail.grpc.generated.AddShoppingCartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddShoppingCartMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddShoppingCartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                lk.iit.retail.grpc.generated.AddShoppingCartRequest,
                lk.iit.retail.grpc.generated.AddShoppingCartResponse>(
                  this, METHODID_ADD_SHOPPING_CART)))
          .build();
    }
  }

  /**
   */
  public static final class AddShoppingCartServiceStub extends io.grpc.stub.AbstractAsyncStub<AddShoppingCartServiceStub> {
    private AddShoppingCartServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AddShoppingCartServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AddShoppingCartServiceStub(channel, callOptions);
    }

    /**
     */
    public void addShoppingCart(lk.iit.retail.grpc.generated.AddShoppingCartRequest request,
        io.grpc.stub.StreamObserver<lk.iit.retail.grpc.generated.AddShoppingCartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddShoppingCartMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AddShoppingCartServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AddShoppingCartServiceBlockingStub> {
    private AddShoppingCartServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AddShoppingCartServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AddShoppingCartServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public lk.iit.retail.grpc.generated.AddShoppingCartResponse addShoppingCart(lk.iit.retail.grpc.generated.AddShoppingCartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddShoppingCartMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AddShoppingCartServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AddShoppingCartServiceFutureStub> {
    private AddShoppingCartServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AddShoppingCartServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AddShoppingCartServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lk.iit.retail.grpc.generated.AddShoppingCartResponse> addShoppingCart(
        lk.iit.retail.grpc.generated.AddShoppingCartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddShoppingCartMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_SHOPPING_CART = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AddShoppingCartServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AddShoppingCartServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_SHOPPING_CART:
          serviceImpl.addShoppingCart((lk.iit.retail.grpc.generated.AddShoppingCartRequest) request,
              (io.grpc.stub.StreamObserver<lk.iit.retail.grpc.generated.AddShoppingCartResponse>) responseObserver);
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

  private static abstract class AddShoppingCartServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AddShoppingCartServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return lk.iit.retail.grpc.generated.RetailService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AddShoppingCartService");
    }
  }

  private static final class AddShoppingCartServiceFileDescriptorSupplier
      extends AddShoppingCartServiceBaseDescriptorSupplier {
    AddShoppingCartServiceFileDescriptorSupplier() {}
  }

  private static final class AddShoppingCartServiceMethodDescriptorSupplier
      extends AddShoppingCartServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AddShoppingCartServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AddShoppingCartServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AddShoppingCartServiceFileDescriptorSupplier())
              .addMethod(getAddShoppingCartMethod())
              .build();
        }
      }
    }
    return result;
  }
}
