package lk.iit.retail.grpc.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: RetailService.proto")
public final class UpdateNotifyServiceGrpc {

  private UpdateNotifyServiceGrpc() {}

  public static final String SERVICE_NAME = "lk.iit.retail.grpc.generated.UpdateNotifyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<lk.iit.retail.grpc.generated.NotifyRequest,
      lk.iit.retail.grpc.generated.NotifyResponse> getUpdateNotifyServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateNotifyService",
      requestType = lk.iit.retail.grpc.generated.NotifyRequest.class,
      responseType = lk.iit.retail.grpc.generated.NotifyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<lk.iit.retail.grpc.generated.NotifyRequest,
      lk.iit.retail.grpc.generated.NotifyResponse> getUpdateNotifyServiceMethod() {
    io.grpc.MethodDescriptor<lk.iit.retail.grpc.generated.NotifyRequest, lk.iit.retail.grpc.generated.NotifyResponse> getUpdateNotifyServiceMethod;
    if ((getUpdateNotifyServiceMethod = UpdateNotifyServiceGrpc.getUpdateNotifyServiceMethod) == null) {
      synchronized (UpdateNotifyServiceGrpc.class) {
        if ((getUpdateNotifyServiceMethod = UpdateNotifyServiceGrpc.getUpdateNotifyServiceMethod) == null) {
          UpdateNotifyServiceGrpc.getUpdateNotifyServiceMethod = getUpdateNotifyServiceMethod =
              io.grpc.MethodDescriptor.<lk.iit.retail.grpc.generated.NotifyRequest, lk.iit.retail.grpc.generated.NotifyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateNotifyService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lk.iit.retail.grpc.generated.NotifyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lk.iit.retail.grpc.generated.NotifyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UpdateNotifyServiceMethodDescriptorSupplier("updateNotifyService"))
              .build();
        }
      }
    }
    return getUpdateNotifyServiceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UpdateNotifyServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UpdateNotifyServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UpdateNotifyServiceStub>() {
        @java.lang.Override
        public UpdateNotifyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UpdateNotifyServiceStub(channel, callOptions);
        }
      };
    return UpdateNotifyServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UpdateNotifyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UpdateNotifyServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UpdateNotifyServiceBlockingStub>() {
        @java.lang.Override
        public UpdateNotifyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UpdateNotifyServiceBlockingStub(channel, callOptions);
        }
      };
    return UpdateNotifyServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UpdateNotifyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UpdateNotifyServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UpdateNotifyServiceFutureStub>() {
        @java.lang.Override
        public UpdateNotifyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UpdateNotifyServiceFutureStub(channel, callOptions);
        }
      };
    return UpdateNotifyServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UpdateNotifyServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void updateNotifyService(lk.iit.retail.grpc.generated.NotifyRequest request,
        io.grpc.stub.StreamObserver<lk.iit.retail.grpc.generated.NotifyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateNotifyServiceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUpdateNotifyServiceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                lk.iit.retail.grpc.generated.NotifyRequest,
                lk.iit.retail.grpc.generated.NotifyResponse>(
                  this, METHODID_UPDATE_NOTIFY_SERVICE)))
          .build();
    }
  }

  /**
   */
  public static final class UpdateNotifyServiceStub extends io.grpc.stub.AbstractAsyncStub<UpdateNotifyServiceStub> {
    private UpdateNotifyServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdateNotifyServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UpdateNotifyServiceStub(channel, callOptions);
    }

    /**
     */
    public void updateNotifyService(lk.iit.retail.grpc.generated.NotifyRequest request,
        io.grpc.stub.StreamObserver<lk.iit.retail.grpc.generated.NotifyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateNotifyServiceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UpdateNotifyServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UpdateNotifyServiceBlockingStub> {
    private UpdateNotifyServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdateNotifyServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UpdateNotifyServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public lk.iit.retail.grpc.generated.NotifyResponse updateNotifyService(lk.iit.retail.grpc.generated.NotifyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateNotifyServiceMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UpdateNotifyServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UpdateNotifyServiceFutureStub> {
    private UpdateNotifyServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdateNotifyServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UpdateNotifyServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lk.iit.retail.grpc.generated.NotifyResponse> updateNotifyService(
        lk.iit.retail.grpc.generated.NotifyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateNotifyServiceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPDATE_NOTIFY_SERVICE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UpdateNotifyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UpdateNotifyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPDATE_NOTIFY_SERVICE:
          serviceImpl.updateNotifyService((lk.iit.retail.grpc.generated.NotifyRequest) request,
              (io.grpc.stub.StreamObserver<lk.iit.retail.grpc.generated.NotifyResponse>) responseObserver);
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

  private static abstract class UpdateNotifyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UpdateNotifyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return lk.iit.retail.grpc.generated.RetailService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UpdateNotifyService");
    }
  }

  private static final class UpdateNotifyServiceFileDescriptorSupplier
      extends UpdateNotifyServiceBaseDescriptorSupplier {
    UpdateNotifyServiceFileDescriptorSupplier() {}
  }

  private static final class UpdateNotifyServiceMethodDescriptorSupplier
      extends UpdateNotifyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UpdateNotifyServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UpdateNotifyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UpdateNotifyServiceFileDescriptorSupplier())
              .addMethod(getUpdateNotifyServiceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
