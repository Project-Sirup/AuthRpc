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
public final class SirupAuthServiceGrpc {

  private SirupAuthServiceGrpc() {}

  public static final String SERVICE_NAME = "auth.v4.SirupAuthService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<sirup.service.auth.rpc.proto.HealthRequest,
      sirup.service.auth.rpc.proto.HealthResponse> getHealthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Health",
      requestType = sirup.service.auth.rpc.proto.HealthRequest.class,
      responseType = sirup.service.auth.rpc.proto.HealthResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sirup.service.auth.rpc.proto.HealthRequest,
      sirup.service.auth.rpc.proto.HealthResponse> getHealthMethod() {
    io.grpc.MethodDescriptor<sirup.service.auth.rpc.proto.HealthRequest, sirup.service.auth.rpc.proto.HealthResponse> getHealthMethod;
    if ((getHealthMethod = SirupAuthServiceGrpc.getHealthMethod) == null) {
      synchronized (SirupAuthServiceGrpc.class) {
        if ((getHealthMethod = SirupAuthServiceGrpc.getHealthMethod) == null) {
          SirupAuthServiceGrpc.getHealthMethod = getHealthMethod = 
              io.grpc.MethodDescriptor.<sirup.service.auth.rpc.proto.HealthRequest, sirup.service.auth.rpc.proto.HealthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "auth.v4.SirupAuthService", "Health"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sirup.service.auth.rpc.proto.HealthRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sirup.service.auth.rpc.proto.HealthResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SirupAuthServiceMethodDescriptorSupplier("Health"))
                  .build();
          }
        }
     }
     return getHealthMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sirup.service.auth.rpc.proto.TokenRequest,
      sirup.service.auth.rpc.proto.TokenResponse> getTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Token",
      requestType = sirup.service.auth.rpc.proto.TokenRequest.class,
      responseType = sirup.service.auth.rpc.proto.TokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sirup.service.auth.rpc.proto.TokenRequest,
      sirup.service.auth.rpc.proto.TokenResponse> getTokenMethod() {
    io.grpc.MethodDescriptor<sirup.service.auth.rpc.proto.TokenRequest, sirup.service.auth.rpc.proto.TokenResponse> getTokenMethod;
    if ((getTokenMethod = SirupAuthServiceGrpc.getTokenMethod) == null) {
      synchronized (SirupAuthServiceGrpc.class) {
        if ((getTokenMethod = SirupAuthServiceGrpc.getTokenMethod) == null) {
          SirupAuthServiceGrpc.getTokenMethod = getTokenMethod = 
              io.grpc.MethodDescriptor.<sirup.service.auth.rpc.proto.TokenRequest, sirup.service.auth.rpc.proto.TokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "auth.v4.SirupAuthService", "Token"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sirup.service.auth.rpc.proto.TokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sirup.service.auth.rpc.proto.TokenResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SirupAuthServiceMethodDescriptorSupplier("Token"))
                  .build();
          }
        }
     }
     return getTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sirup.service.auth.rpc.proto.AuthRequest,
      sirup.service.auth.rpc.proto.AuthResponse> getAuthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Auth",
      requestType = sirup.service.auth.rpc.proto.AuthRequest.class,
      responseType = sirup.service.auth.rpc.proto.AuthResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sirup.service.auth.rpc.proto.AuthRequest,
      sirup.service.auth.rpc.proto.AuthResponse> getAuthMethod() {
    io.grpc.MethodDescriptor<sirup.service.auth.rpc.proto.AuthRequest, sirup.service.auth.rpc.proto.AuthResponse> getAuthMethod;
    if ((getAuthMethod = SirupAuthServiceGrpc.getAuthMethod) == null) {
      synchronized (SirupAuthServiceGrpc.class) {
        if ((getAuthMethod = SirupAuthServiceGrpc.getAuthMethod) == null) {
          SirupAuthServiceGrpc.getAuthMethod = getAuthMethod = 
              io.grpc.MethodDescriptor.<sirup.service.auth.rpc.proto.AuthRequest, sirup.service.auth.rpc.proto.AuthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "auth.v4.SirupAuthService", "Auth"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sirup.service.auth.rpc.proto.AuthRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sirup.service.auth.rpc.proto.AuthResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SirupAuthServiceMethodDescriptorSupplier("Auth"))
                  .build();
          }
        }
     }
     return getAuthMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sirup.service.auth.rpc.proto.ServiceTokenRequest,
      sirup.service.auth.rpc.proto.ServiceTokenResponse> getServiceTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ServiceToken",
      requestType = sirup.service.auth.rpc.proto.ServiceTokenRequest.class,
      responseType = sirup.service.auth.rpc.proto.ServiceTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sirup.service.auth.rpc.proto.ServiceTokenRequest,
      sirup.service.auth.rpc.proto.ServiceTokenResponse> getServiceTokenMethod() {
    io.grpc.MethodDescriptor<sirup.service.auth.rpc.proto.ServiceTokenRequest, sirup.service.auth.rpc.proto.ServiceTokenResponse> getServiceTokenMethod;
    if ((getServiceTokenMethod = SirupAuthServiceGrpc.getServiceTokenMethod) == null) {
      synchronized (SirupAuthServiceGrpc.class) {
        if ((getServiceTokenMethod = SirupAuthServiceGrpc.getServiceTokenMethod) == null) {
          SirupAuthServiceGrpc.getServiceTokenMethod = getServiceTokenMethod = 
              io.grpc.MethodDescriptor.<sirup.service.auth.rpc.proto.ServiceTokenRequest, sirup.service.auth.rpc.proto.ServiceTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "auth.v4.SirupAuthService", "ServiceToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sirup.service.auth.rpc.proto.ServiceTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sirup.service.auth.rpc.proto.ServiceTokenResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SirupAuthServiceMethodDescriptorSupplier("ServiceToken"))
                  .build();
          }
        }
     }
     return getServiceTokenMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SirupAuthServiceStub newStub(io.grpc.Channel channel) {
    return new SirupAuthServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SirupAuthServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SirupAuthServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SirupAuthServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SirupAuthServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SirupAuthServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void health(sirup.service.auth.rpc.proto.HealthRequest request,
        io.grpc.stub.StreamObserver<sirup.service.auth.rpc.proto.HealthResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getHealthMethod(), responseObserver);
    }

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

    /**
     */
    public void serviceToken(sirup.service.auth.rpc.proto.ServiceTokenRequest request,
        io.grpc.stub.StreamObserver<sirup.service.auth.rpc.proto.ServiceTokenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getServiceTokenMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHealthMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                sirup.service.auth.rpc.proto.HealthRequest,
                sirup.service.auth.rpc.proto.HealthResponse>(
                  this, METHODID_HEALTH)))
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
          .addMethod(
            getServiceTokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                sirup.service.auth.rpc.proto.ServiceTokenRequest,
                sirup.service.auth.rpc.proto.ServiceTokenResponse>(
                  this, METHODID_SERVICE_TOKEN)))
          .build();
    }
  }

  /**
   */
  public static final class SirupAuthServiceStub extends io.grpc.stub.AbstractStub<SirupAuthServiceStub> {
    private SirupAuthServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SirupAuthServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SirupAuthServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SirupAuthServiceStub(channel, callOptions);
    }

    /**
     */
    public void health(sirup.service.auth.rpc.proto.HealthRequest request,
        io.grpc.stub.StreamObserver<sirup.service.auth.rpc.proto.HealthResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHealthMethod(), getCallOptions()), request, responseObserver);
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

    /**
     */
    public void serviceToken(sirup.service.auth.rpc.proto.ServiceTokenRequest request,
        io.grpc.stub.StreamObserver<sirup.service.auth.rpc.proto.ServiceTokenResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getServiceTokenMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SirupAuthServiceBlockingStub extends io.grpc.stub.AbstractStub<SirupAuthServiceBlockingStub> {
    private SirupAuthServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SirupAuthServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SirupAuthServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SirupAuthServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public sirup.service.auth.rpc.proto.HealthResponse health(sirup.service.auth.rpc.proto.HealthRequest request) {
      return blockingUnaryCall(
          getChannel(), getHealthMethod(), getCallOptions(), request);
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

    /**
     */
    public sirup.service.auth.rpc.proto.ServiceTokenResponse serviceToken(sirup.service.auth.rpc.proto.ServiceTokenRequest request) {
      return blockingUnaryCall(
          getChannel(), getServiceTokenMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SirupAuthServiceFutureStub extends io.grpc.stub.AbstractStub<SirupAuthServiceFutureStub> {
    private SirupAuthServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SirupAuthServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SirupAuthServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SirupAuthServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sirup.service.auth.rpc.proto.HealthResponse> health(
        sirup.service.auth.rpc.proto.HealthRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHealthMethod(), getCallOptions()), request);
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

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sirup.service.auth.rpc.proto.ServiceTokenResponse> serviceToken(
        sirup.service.auth.rpc.proto.ServiceTokenRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getServiceTokenMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HEALTH = 0;
  private static final int METHODID_TOKEN = 1;
  private static final int METHODID_AUTH = 2;
  private static final int METHODID_SERVICE_TOKEN = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SirupAuthServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SirupAuthServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HEALTH:
          serviceImpl.health((sirup.service.auth.rpc.proto.HealthRequest) request,
              (io.grpc.stub.StreamObserver<sirup.service.auth.rpc.proto.HealthResponse>) responseObserver);
          break;
        case METHODID_TOKEN:
          serviceImpl.token((sirup.service.auth.rpc.proto.TokenRequest) request,
              (io.grpc.stub.StreamObserver<sirup.service.auth.rpc.proto.TokenResponse>) responseObserver);
          break;
        case METHODID_AUTH:
          serviceImpl.auth((sirup.service.auth.rpc.proto.AuthRequest) request,
              (io.grpc.stub.StreamObserver<sirup.service.auth.rpc.proto.AuthResponse>) responseObserver);
          break;
        case METHODID_SERVICE_TOKEN:
          serviceImpl.serviceToken((sirup.service.auth.rpc.proto.ServiceTokenRequest) request,
              (io.grpc.stub.StreamObserver<sirup.service.auth.rpc.proto.ServiceTokenResponse>) responseObserver);
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

  private static abstract class SirupAuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SirupAuthServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sirup.service.auth.rpc.proto.Auth.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SirupAuthService");
    }
  }

  private static final class SirupAuthServiceFileDescriptorSupplier
      extends SirupAuthServiceBaseDescriptorSupplier {
    SirupAuthServiceFileDescriptorSupplier() {}
  }

  private static final class SirupAuthServiceMethodDescriptorSupplier
      extends SirupAuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SirupAuthServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SirupAuthServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SirupAuthServiceFileDescriptorSupplier())
              .addMethod(getHealthMethod())
              .addMethod(getTokenMethod())
              .addMethod(getAuthMethod())
              .addMethod(getServiceTokenMethod())
              .build();
        }
      }
    }
    return result;
  }
}
