package service;

import generated.APIResponse;
import generated.FormatAddressGrpc;
import generated.addressFmt;
import io.grpc.stub.StreamObserver;


public class AddressService extends FormatAddressGrpc.FormatAddressImplBase {
    @Override
    public void request(addressFmt request, StreamObserver<APIResponse> responseObserver) {
       String fullAddress = request.getAddress();


       APIResponse.Builder response = APIResponse.newBuilder();

       response.setResponseMessage(AddressFormatter.format(fullAddress)).setResponseCode(200);

       responseObserver.onNext(response.build());
       responseObserver.onCompleted();

    }
}
