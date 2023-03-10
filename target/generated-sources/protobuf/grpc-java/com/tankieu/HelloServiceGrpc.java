package com.tankieu;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: hello.proto")
public final class HelloServiceGrpc {

  private HelloServiceGrpc() {}

  public static final String SERVICE_NAME = "com.tankieu.HelloService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.tankieu.HelloProto.HelloRequest,
      com.tankieu.HelloProto.HelloResponse> METHOD_SAY_HELLO =
      io.grpc.MethodDescriptor.<com.tankieu.HelloProto.HelloRequest, com.tankieu.HelloProto.HelloResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.tankieu.HelloService", "SayHello"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.tankieu.HelloProto.HelloRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.tankieu.HelloProto.HelloResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.tankieu.HelloProto.HelloRequest,
      com.tankieu.HelloProto.HelloResponse> METHOD_SAY_HELLOS =
      io.grpc.MethodDescriptor.<com.tankieu.HelloProto.HelloRequest, com.tankieu.HelloProto.HelloResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "com.tankieu.HelloService", "SayHellos"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.tankieu.HelloProto.HelloRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.tankieu.HelloProto.HelloResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.tankieu.HelloProto.HelloRequest,
      com.tankieu.HelloProto.HelloResponse> METHOD_SAY_HELLO_TO_MANY =
      io.grpc.MethodDescriptor.<com.tankieu.HelloProto.HelloRequest, com.tankieu.HelloProto.HelloResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "com.tankieu.HelloService", "SayHelloToMany"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.tankieu.HelloProto.HelloRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.tankieu.HelloProto.HelloResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.tankieu.HelloProto.HelloRequest,
      com.tankieu.HelloProto.HelloResponse> METHOD_SAY_HELLO_TO_EACH =
      io.grpc.MethodDescriptor.<com.tankieu.HelloProto.HelloRequest, com.tankieu.HelloProto.HelloResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "com.tankieu.HelloService", "SayHelloToEach"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.tankieu.HelloProto.HelloRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.tankieu.HelloProto.HelloResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloServiceStub newStub(io.grpc.Channel channel) {
    return new HelloServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelloServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HelloServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HelloServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HelloServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class HelloServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sayHello(com.tankieu.HelloProto.HelloRequest request,
        io.grpc.stub.StreamObserver<com.tankieu.HelloProto.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SAY_HELLO, responseObserver);
    }

    /**
     */
    public void sayHellos(com.tankieu.HelloProto.HelloRequest request,
        io.grpc.stub.StreamObserver<com.tankieu.HelloProto.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SAY_HELLOS, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.tankieu.HelloProto.HelloRequest> sayHelloToMany(
        io.grpc.stub.StreamObserver<com.tankieu.HelloProto.HelloResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_SAY_HELLO_TO_MANY, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.tankieu.HelloProto.HelloRequest> sayHelloToEach(
        io.grpc.stub.StreamObserver<com.tankieu.HelloProto.HelloResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_SAY_HELLO_TO_EACH, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SAY_HELLO,
            asyncUnaryCall(
              new MethodHandlers<
                com.tankieu.HelloProto.HelloRequest,
                com.tankieu.HelloProto.HelloResponse>(
                  this, METHODID_SAY_HELLO)))
          .addMethod(
            METHOD_SAY_HELLOS,
            asyncServerStreamingCall(
              new MethodHandlers<
                com.tankieu.HelloProto.HelloRequest,
                com.tankieu.HelloProto.HelloResponse>(
                  this, METHODID_SAY_HELLOS)))
          .addMethod(
            METHOD_SAY_HELLO_TO_MANY,
            asyncClientStreamingCall(
              new MethodHandlers<
                com.tankieu.HelloProto.HelloRequest,
                com.tankieu.HelloProto.HelloResponse>(
                  this, METHODID_SAY_HELLO_TO_MANY)))
          .addMethod(
            METHOD_SAY_HELLO_TO_EACH,
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.tankieu.HelloProto.HelloRequest,
                com.tankieu.HelloProto.HelloResponse>(
                  this, METHODID_SAY_HELLO_TO_EACH)))
          .build();
    }
  }

  /**
   */
  public static final class HelloServiceStub extends io.grpc.stub.AbstractStub<HelloServiceStub> {
    private HelloServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloServiceStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(com.tankieu.HelloProto.HelloRequest request,
        io.grpc.stub.StreamObserver<com.tankieu.HelloProto.HelloResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SAY_HELLO, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sayHellos(com.tankieu.HelloProto.HelloRequest request,
        io.grpc.stub.StreamObserver<com.tankieu.HelloProto.HelloResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_SAY_HELLOS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.tankieu.HelloProto.HelloRequest> sayHelloToMany(
        io.grpc.stub.StreamObserver<com.tankieu.HelloProto.HelloResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_SAY_HELLO_TO_MANY, getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.tankieu.HelloProto.HelloRequest> sayHelloToEach(
        io.grpc.stub.StreamObserver<com.tankieu.HelloProto.HelloResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_SAY_HELLO_TO_EACH, getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class HelloServiceBlockingStub extends io.grpc.stub.AbstractStub<HelloServiceBlockingStub> {
    private HelloServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tankieu.HelloProto.HelloResponse sayHello(com.tankieu.HelloProto.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SAY_HELLO, getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.tankieu.HelloProto.HelloResponse> sayHellos(
        com.tankieu.HelloProto.HelloRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_SAY_HELLOS, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HelloServiceFutureStub extends io.grpc.stub.AbstractStub<HelloServiceFutureStub> {
    private HelloServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tankieu.HelloProto.HelloResponse> sayHello(
        com.tankieu.HelloProto.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SAY_HELLO, getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_SAY_HELLOS = 1;
  private static final int METHODID_SAY_HELLO_TO_MANY = 2;
  private static final int METHODID_SAY_HELLO_TO_EACH = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HelloServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HelloServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((com.tankieu.HelloProto.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.tankieu.HelloProto.HelloResponse>) responseObserver);
          break;
        case METHODID_SAY_HELLOS:
          serviceImpl.sayHellos((com.tankieu.HelloProto.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.tankieu.HelloProto.HelloResponse>) responseObserver);
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
        case METHODID_SAY_HELLO_TO_MANY:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sayHelloToMany(
              (io.grpc.stub.StreamObserver<com.tankieu.HelloProto.HelloResponse>) responseObserver);
        case METHODID_SAY_HELLO_TO_EACH:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sayHelloToEach(
              (io.grpc.stub.StreamObserver<com.tankieu.HelloProto.HelloResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class HelloServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tankieu.HelloProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HelloServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HelloServiceDescriptorSupplier())
              .addMethod(METHOD_SAY_HELLO)
              .addMethod(METHOD_SAY_HELLOS)
              .addMethod(METHOD_SAY_HELLO_TO_MANY)
              .addMethod(METHOD_SAY_HELLO_TO_EACH)
              .build();
        }
      }
    }
    return result;
  }
}
