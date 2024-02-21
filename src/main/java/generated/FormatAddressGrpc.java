package generated;

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
    comments = "Source: AddressFormatter.proto")
public final class FormatAddressGrpc {

  private FormatAddressGrpc() {}

  public static final String SERVICE_NAME = "proto.FormatAddress";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.addressFmt,
      generated.APIResponse> getRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "request",
      requestType = generated.addressFmt.class,
      responseType = generated.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.addressFmt,
      generated.APIResponse> getRequestMethod() {
    io.grpc.MethodDescriptor<generated.addressFmt, generated.APIResponse> getRequestMethod;
    if ((getRequestMethod = FormatAddressGrpc.getRequestMethod) == null) {
      synchronized (FormatAddressGrpc.class) {
        if ((getRequestMethod = FormatAddressGrpc.getRequestMethod) == null) {
          FormatAddressGrpc.getRequestMethod = getRequestMethod = 
              io.grpc.MethodDescriptor.<generated.addressFmt, generated.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.FormatAddress", "request"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.addressFmt.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FormatAddressMethodDescriptorSupplier("request"))
                  .build();
          }
        }
     }
     return getRequestMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FormatAddressStub newStub(io.grpc.Channel channel) {
    return new FormatAddressStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FormatAddressBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FormatAddressBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FormatAddressFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FormatAddressFutureStub(channel);
  }

  /**
   */
  public static abstract class FormatAddressImplBase implements io.grpc.BindableService {

    /**
     */
    public void request(generated.addressFmt request,
        io.grpc.stub.StreamObserver<generated.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRequestMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRequestMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.addressFmt,
                generated.APIResponse>(
                  this, METHODID_REQUEST)))
          .build();
    }
  }

  /**
   */
  public static final class FormatAddressStub extends io.grpc.stub.AbstractStub<FormatAddressStub> {
    private FormatAddressStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FormatAddressStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FormatAddressStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FormatAddressStub(channel, callOptions);
    }

    /**
     */
    public void request(generated.addressFmt request,
        io.grpc.stub.StreamObserver<generated.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRequestMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FormatAddressBlockingStub extends io.grpc.stub.AbstractStub<FormatAddressBlockingStub> {
    private FormatAddressBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FormatAddressBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FormatAddressBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FormatAddressBlockingStub(channel, callOptions);
    }

    /**
     */
    public generated.APIResponse request(generated.addressFmt request) {
      return blockingUnaryCall(
          getChannel(), getRequestMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FormatAddressFutureStub extends io.grpc.stub.AbstractStub<FormatAddressFutureStub> {
    private FormatAddressFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FormatAddressFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FormatAddressFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FormatAddressFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.APIResponse> request(
        generated.addressFmt request) {
      return futureUnaryCall(
          getChannel().newCall(getRequestMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REQUEST = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FormatAddressImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FormatAddressImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REQUEST:
          serviceImpl.request((generated.addressFmt) request,
              (io.grpc.stub.StreamObserver<generated.APIResponse>) responseObserver);
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

  private static abstract class FormatAddressBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FormatAddressBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.addressFormatterProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FormatAddress");
    }
  }

  private static final class FormatAddressFileDescriptorSupplier
      extends FormatAddressBaseDescriptorSupplier {
    FormatAddressFileDescriptorSupplier() {}
  }

  private static final class FormatAddressMethodDescriptorSupplier
      extends FormatAddressBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FormatAddressMethodDescriptorSupplier(String methodName) {
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
      synchronized (FormatAddressGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FormatAddressFileDescriptorSupplier())
              .addMethod(getRequestMethod())
              .build();
        }
      }
    }
    return result;
  }
}
