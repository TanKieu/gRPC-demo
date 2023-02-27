package server;

import com.tankieu.HelloProto;
import com.tankieu.HelloServiceGrpc;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

public class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {
    @Override
    public void sayHello(HelloProto.HelloRequest request, StreamObserver<HelloProto.HelloResponse> responseObserver) {
        System.out.println("Request received from client:\n"+request);

        String greeting = new StringBuffer().append("Hello, ")
                .append(request.getName()).toString();

        HelloProto.HelloResponse response = HelloProto.HelloResponse.newBuilder().setMessage(greeting).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void sayHellos(HelloProto.HelloRequest request, StreamObserver<HelloProto.HelloResponse> responseObserver) {
        System.out.println("Request received from client:\n"+request);

        String greeting = new StringBuffer().append("Hello, ").append(request.getName()).toString();
        HelloProto.HelloResponse response1 = HelloProto.HelloResponse.newBuilder().setMessage(greeting).build();
        responseObserver.onNext(response1);

        String greeting2= new StringBuffer().append("Hi, ").append(request.getName()).toString();
        HelloProto.HelloResponse response2 = HelloProto.HelloResponse.newBuilder().setMessage(greeting2).build();
        responseObserver.onNext(response2);

        String greeting3 = new StringBuffer().append("Good morning, ").append(request.getName()).toString();
        HelloProto.HelloResponse response3 = HelloProto.HelloResponse.newBuilder().setMessage(greeting3).build();
        responseObserver.onNext(response3);

        responseObserver.onCompleted();

    }


    @Override
    public StreamObserver<HelloProto.HelloRequest> sayHelloToMany(StreamObserver<HelloProto.HelloResponse> responseStreamObserverObserver) {
        return new StreamObserver<HelloProto.HelloRequest>() {
            StringBuilder listName = new StringBuilder();

            @Override
            public void onNext(HelloProto.HelloRequest helloRequest) {
                listName.append(helloRequest.getName()).append(" ");
                System.out.println(listName);
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("Error "+throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Received ");
                HelloProto.HelloResponse response = HelloProto.HelloResponse.newBuilder().setMessage("hello all "+listName).build();
                responseStreamObserverObserver.onNext(response);
                responseStreamObserverObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<HelloProto.HelloRequest> sayHelloToEach(StreamObserver<HelloProto.HelloResponse> responseObserver) {
        return new StreamObserver<HelloProto.HelloRequest>() {
            @Override
            public void onNext(HelloProto.HelloRequest helloRequest) {
                StringBuilder message = new StringBuilder().append("Hello").append(helloRequest.getName());
                HelloProto.HelloResponse response = HelloProto.HelloResponse.newBuilder().setMessage(message.toString()).build();
                responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable throwable) {
                System.err.println("Errors " + throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Completed ");
                responseObserver.onCompleted();
            }
        };
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(8080).addService(new HelloServiceImpl()).build();

        System.out.println("Starting server ...");
        server.start();
        System.out.println("Server started");
        server.awaitTermination();
    }
}
