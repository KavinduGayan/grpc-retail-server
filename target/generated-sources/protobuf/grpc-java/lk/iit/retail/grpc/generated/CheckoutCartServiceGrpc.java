package lk.iit.retail.grpc.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: RetailService.proto")
public final class CheckoutCartServiceGrpc {

  private CheckoutCartServiceGrpc() {}

  public static final String SERVICE_NAME = "lk.iit.retail.grpc.generated.CheckoutCartService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<lk.iit.retail.grpc.generated.CheckoutRequest,
      lk.iit.retail.grpc.generated.CheckoutResponse> getCheckoutCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "checkoutCart",
      requestType = lk.iit.retail.grpc.generated.CheckoutRequest.class,
      responseType = lk.iit.retail.grpc.generated.CheckoutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<lk.iit.retail.grpc.generated.CheckoutRequest,
      lk.iit.retail.grpc.generated.CheckoutResponse> getCheckoutCartMethod() {
    io.grpc.MethodDescriptor<lk.iit.retail.grpc.generated.CheckoutRequest, lk.iit.retail.grpc.generated.CheckoutResponse> getCheckoutCartMethod;
    if ((getCheckoutCartMethod = CheckoutCartServiceGrpc.getCheckoutCartMethod) == null) {
      synchronized (CheckoutCartServiceGrpc.class) {
        if ((getCheckoutCartMethod = CheckoutCartServiceGrpc.getCheckoutCartMethod) == null) {
          CheckoutCartServiceGrpc.getCheckoutCartMethod = getCheckoutCartMethod =
              io.grpc.MethodDescriptor.<lk.iit.retail.grpc.generated.CheckoutRequest, lk.iit.retail.grpc.generated.CheckoutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "checkoutCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lk.iit.retail.grpc.generated.CheckoutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lk.iit.retail.grpc.generated.CheckoutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CheckoutCartServiceMethodDescriptorSupplier("checkoutCart"))
              .build();
        }
      }
    }
    return getCheckoutCartMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CheckoutCartServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CheckoutCartServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CheckoutCartServiceStub>() {
        @java.lang.Override
        public CheckoutCartServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CheckoutCartServiceStub(channel, callOptions);
        }
      };
    return CheckoutCartServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CheckoutCartServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CheckoutCartServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CheckoutCartServiceBlockingStub>() {
        @java.lang.Override
        public CheckoutCartServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CheckoutCartServiceBlockingStub(channel, callOptions);
        }
      };
    return CheckoutCartServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CheckoutCartServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CheckoutCartServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CheckoutCartServiceFutureStub>() {
        @java.lang.Override
        public CheckoutCartServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CheckoutCartServiceFutureStub(channel, callOptions);
        }
      };
    return CheckoutCartServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CheckoutCartServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void checkoutCart(lk.iit.retail.grpc.generated.CheckoutRequest request,
        io.grpc.stub.StreamObserver<lk.iit.retail.grpc.generated.CheckoutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckoutCartMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCheckoutCartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                lk.iit.retail.grpc.generated.CheckoutRequest,
                lk.iit.retail.grpc.generated.CheckoutResponse>(
                  this, METHODID_CHECKOUT_CART)))
          .build();
    }
  }

  /**
   */
  public static final class CheckoutCartServiceStub extends io.grpc.stub.AbstractAsyncStub<CheckoutCartServiceStub> {
    private CheckoutCartServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CheckoutCartServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CheckoutCartServiceStub(channel, callOptions);
    }

    /**
     */
    public void checkoutCart(lk.iit.retail.grpc.generated.CheckoutRequest request,
        io.grpc.stub.StreamObserver<lk.iit.retail.grpc.generated.CheckoutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckoutCartMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CheckoutCartServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CheckoutCartServiceBlockingStub> {
    private CheckoutCartServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CheckoutCartServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CheckoutCartServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public lk.iit.retail.grpc.generated.CheckoutResponse checkoutCart(lk.iit.retail.grpc.generated.CheckoutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckoutCartMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CheckoutCartServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CheckoutCartServiceFutureStub> {
    private CheckoutCartServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CheckoutCartServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CheckoutCartServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lk.iit.retail.grpc.generated.CheckoutResponse> checkoutCart(
        lk.iit.retail.grpc.generated.CheckoutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckoutCartMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHECKOUT_CART = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CheckoutCartServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CheckoutCartServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECKOUT_CART:
          serviceImpl.checkoutCart((lk.iit.retail.grpc.generated.CheckoutRequest) request,
              (io.grpc.stub.StreamObserver<lk.iit.retail.grpc.generated.CheckoutResponse>) responseObserver);
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

  private static abstract class CheckoutCartServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CheckoutCartServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return lk.iit.retail.grpc.generated.RetailService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CheckoutCartService");
    }
  }

  private static final class CheckoutCartServiceFileDescriptorSupplier
      extends CheckoutCartServiceBaseDescriptorSupplier {
    CheckoutCartServiceFileDescriptorSupplier() {}
  }

  private static final class CheckoutCartServiceMethodDescriptorSupplier
      extends CheckoutCartServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CheckoutCartServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CheckoutCartServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CheckoutCartServiceFileDescriptorSupplier())
              .addMethod(getCheckoutCartMethod())
              .build();
        }
      }
    }
    return result;
  }
}
