package sirup.service.auth.rpc.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: sirup_auth.proto")
public final class SirupAuthGrpc {

  private SirupAuthGrpc() {}

  public static final String SERVICE_NAME = "auth.proto.SirupAuth";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<sirup.service.auth.rpc.proto.TokenRequest,
      sirup.service.auth.rpc.proto.TokenResponse> getTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "token",
      requestType = sirup.service.auth.rpc.proto.TokenRequest.class,
      responseType = sirup.service.auth.rpc.proto.TokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sirup.service.auth.rpc.proto.TokenRequest,
      sirup.service.auth.rpc.proto.TokenResponse> getTokenMethod() {
    io.grpc.MethodDescriptor<sirup.service.auth.rpc.proto.TokenRequest, sirup.service.auth.rpc.proto.TokenResponse> getTokenMethod;
    if ((getTokenMethod = SirupAuthGrpc.getTokenMethod) == null) {
      synchronized (SirupAuthGrpc.class) {
        if ((getTokenMethod = SirupAuthGrpc.getTokenMethod) == null) {
          SirupAuthGrpc.getTokenMethod = getTokenMethod = 
              io.grpc.MethodDescriptor.<sirup.service.auth.rpc.proto.TokenRequest, sirup.service.auth.rpc.proto.TokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "auth.proto.SirupAuth", "token"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sirup.service.auth.rpc.proto.TokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sirup.service.auth.rpc.proto.TokenResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SirupAuthMethodDescriptorSupplier("token"))
                  .build();
          }
        }
     }
     return getTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sirup.service.auth.rpc.proto.AuthRequest,
      sirup.service.auth.rpc.proto.AuthResponse> getAuthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "auth",
      requestType = sirup.service.auth.rpc.proto.AuthRequest.class,
      responseType = sirup.service.auth.rpc.proto.AuthResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sirup.service.auth.rpc.proto.AuthRequest,
      sirup.service.auth.rpc.proto.AuthResponse> getAuthMethod() {
    io.grpc.MethodDescriptor<sirup.service.auth.rpc.proto.AuthRequest, sirup.service.auth.rpc.proto.AuthResponse> getAuthMethod;
    if ((getAuthMethod = SirupAuthGrpc.getAuthMethod) == null) {
      synchronized (SirupAuthGrpc.class) {
        if ((getAuthMethod = SirupAuthGrpc.getAuthMethod) == null) {
          SirupAuthGrpc.getAuthMethod = getAuthMethod = 
              io.grpc.MethodDescriptor.<sirup.service.auth.rpc.proto.AuthRequest, sirup.service.auth.rpc.proto.AuthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "auth.proto.SirupAuth", "auth"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sirup.service.auth.rpc.proto.AuthRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sirup.service.auth.rpc.proto.AuthResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SirupAuthMethodDescriptorSupplier("auth"))
                  .build();
          }
        }
     }
     return getAuthMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SirupAuthStub newStub(io.grpc.Channel channel) {
    return new SirupAuthStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SirupAuthBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SirupAuthBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SirupAuthFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SirupAuthFutureStub(channel);
  }

  /**
   */
  public static abstract class SirupAuthImplBase implements io.grpc.BindableService {

    /**
     */
    public void token(sirup.service.auth.rpc.proto.TokenRequest request,
        io.grpc.stub.StreamObserver<sirup.service.auth.rpc.proto.TokenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTokenMethod(), responseObserver);
    }

    /**
     */
    public void auth(sirup.service.auth.rpc.proto.AuthRequest request,
        io.grpc.stub.StreamObserver<sirup.service.auth.rpc.proto.AuthResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAuthMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                sirup.service.auth.rpc.proto.TokenRequest,
                sirup.service.auth.rpc.proto.TokenResponse>(
                  this, METHODID_TOKEN)))
          .addMethod(
            getAuthMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                sirup.service.auth.rpc.proto.AuthRequest,
                sirup.service.auth.rpc.proto.AuthResponse>(
                  this, METHODID_AUTH)))
          .build();
    }
  }

  /**
   */
  public static final class SirupAuthStub extends io.grpc.stub.AbstractStub<SirupAuthStub> {
    private SirupAuthStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SirupAuthStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SirupAuthStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SirupAuthStub(channel, callOptions);
    }

    /**
     */
    public void token(sirup.service.auth.rpc.proto.TokenRequest request,
        io.grpc.stub.StreamObserver<sirup.service.auth.rpc.proto.TokenResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void auth(sirup.service.auth.rpc.proto.AuthRequest request,
        io.grpc.stub.StreamObserver<sirup.service.auth.rpc.proto.AuthResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAuthMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SirupAuthBlockingStub extends io.grpc.stub.AbstractStub<SirupAuthBlockingStub> {
    private SirupAuthBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SirupAuthBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SirupAuthBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SirupAuthBlockingStub(channel, callOptions);
    }

    /**
     */
    public sirup.service.auth.rpc.proto.TokenResponse token(sirup.service.auth.rpc.proto.TokenRequest request) {
      return blockingUnaryCall(
          getChannel(), getTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public sirup.service.auth.rpc.proto.AuthResponse auth(sirup.service.auth.rpc.proto.AuthRequest request) {
      return blockingUnaryCall(
          getChannel(), getAuthMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SirupAuthFutureStub extends io.grpc.stub.AbstractStub<SirupAuthFutureStub> {
    private SirupAuthFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SirupAuthFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SirupAuthFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SirupAuthFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sirup.service.auth.rpc.proto.TokenResponse> token(
        sirup.service.auth.rpc.proto.TokenRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sirup.service.auth.rpc.proto.AuthResponse> auth(
        sirup.service.auth.rpc.proto.AuthRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAuthMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TOKEN = 0;
  private static final int METHODID_AUTH = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SirupAuthImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SirupAuthImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TOKEN:
          serviceImpl.token((sirup.service.auth.rpc.proto.TokenRequest) request,
              (io.grpc.stub.StreamObserver<sirup.service.auth.rpc.proto.TokenResponse>) responseObserver);
          break;
        case METHODID_AUTH:
          serviceImpl.auth((sirup.service.auth.rpc.proto.AuthRequest) request,
              (io.grpc.stub.StreamObserver<sirup.service.auth.rpc.proto.AuthResponse>) responseObserver);
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

  private static abstract class SirupAuthBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SirupAuthBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sirup.service.auth.rpc.proto.Auth.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SirupAuth");
    }
  }

  private static final class SirupAuthFileDescriptorSupplier
      extends SirupAuthBaseDescriptorSupplier {
    SirupAuthFileDescriptorSupplier() {}
  }

  private static final class SirupAuthMethodDescriptorSupplier
      extends SirupAuthBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SirupAuthMethodDescriptorSupplier(String methodName) {
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
      synchronized (SirupAuthGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SirupAuthFileDescriptorSupplier())
              .addMethod(getTokenMethod())
              .addMethod(getAuthMethod())
              .build();
        }
      }
    }
    return result;
  }
}
