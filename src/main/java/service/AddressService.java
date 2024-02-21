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

       if(!fullAddress.isEmpty()){
           response.setResponseMessage(AddressFormatter.format(fullAddress));
           response.setResponseCode(0);
       }
       else {
          response.setResponseMessage("Endereço não informado");
          response.setResponseCode(3);
       }
    }
}
