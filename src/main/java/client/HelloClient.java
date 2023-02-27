package client;

import com.tankieu.HelloProto;
import com.tankieu.HelloServiceGrpc;
import io.grpc.Grpc;
import io.grpc.InsecureChannelCredentials;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Iterator;
import java.util.Random;

public class HelloClient {
    private static Random random = new Random();



    public static void main(String[] args) throws InterruptedException {
        ManagedChannel channel = Grpc.newChannelBuilder("localhost:8080", InsecureChannelCredentials.create()).build();

        HelloServiceGrpc.HelloServiceBlockingStub stub = HelloServiceGrpc.newBlockingStub(channel);
        HelloServiceGrpc.HelloServiceStub nonBlockingStub =  HelloServiceGrpc.newStub(channel);


        HelloProto.HelloResponse response = stub.sayHello(HelloProto.HelloRequest.newBuilder().setName("Tan Kieu").build());
        System.out.println("Response received from server:\n" + response);


        System.out.println("Request to Say Hellos");
        Iterator<HelloProto.HelloResponse> responses = stub.sayHellos(HelloProto.HelloRequest.newBuilder().setName("Tan ").build());
        for (int i = 1; responses.hasNext(); i++){
            HelloProto.HelloResponse res = responses.next();
            System.out.println("Response "+ i +"received " +res);
        }

        System.out.println("Request to Say Hello to Many");
        StreamObserver<HelloProto.HelloResponse> oneResponse =new StreamObserver<HelloProto.HelloResponse>() {


            @Override
            public void onNext(HelloProto.HelloResponse helloResponse) {
                System.out.println(helloResponse.getMessage());
            }

            @Override
            public void onError(Throwable throwable) {
                System.err.println("Error "+throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Finished sent");
            }
        };
        StreamObserver<HelloProto.HelloRequest> requestObserver = nonBlockingStub.sayHelloToMany(oneResponse);
        try{
            HelloProto.HelloRequest hr = HelloProto.HelloRequest.newBuilder().setName("tan").build();
            requestObserver.onNext(hr);
            Thread.sleep(random.nextInt(1000) + 500);

            HelloProto.HelloRequest hr1 = HelloProto.HelloRequest.newBuilder().setName("tan1").build();
            requestObserver.onNext(hr1);
            Thread.sleep(random.nextInt(1000) + 500);

            HelloProto.HelloRequest hr2 = HelloProto.HelloRequest.newBuilder().setName("tan2").build();
            requestObserver.onNext(hr2);
            Thread.sleep(random.nextInt(1000) + 500);

            HelloProto.HelloRequest hr3 = HelloProto.HelloRequest.newBuilder().setName("tan3").build();
            requestObserver.onNext(hr3);
            Thread.sleep(random.nextInt(1000) + 500);

        }catch (RuntimeException | InterruptedException e){
            requestObserver.onError(e);
            throw e;
        }
        requestObserver.onCompleted();


        System.out.println("Request to Say Hello To Each");
        StreamObserver<HelloProto.HelloRequest> requestStreamObserver = nonBlockingStub.sayHelloToEach(new StreamObserver<HelloProto.HelloResponse>() {
            @Override
            public void onNext(HelloProto.HelloResponse helloResponse) {
                System.out.println(helloResponse.getMessage());
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("Error: "+throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Finished");
            }
        });
        HelloProto.HelloRequest[] requests = {
                HelloProto.HelloRequest.newBuilder().setName("TanKN").build(),
                HelloProto.HelloRequest.newBuilder().setName("AnLam").build(),
                HelloProto.HelloRequest.newBuilder().setName("HaoLam").build(),
                HelloProto.HelloRequest.newBuilder().setName("TienTruong").build(),
        };
        try{
            for(HelloProto.HelloRequest request: requests){
                requestStreamObserver.onNext(request);
                Thread.sleep(random.nextInt(1000) + 500);
            }
        } catch (RuntimeException e){
            requestStreamObserver.onError(e);
            throw e;
        }
        System.out.println("End request");
        requestStreamObserver.onCompleted();

    }


}
