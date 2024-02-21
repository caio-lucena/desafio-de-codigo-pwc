import io.grpc.Server;
import io.grpc.ServerBuilder;
import service.AddressService;

import java.io.IOException;
import java.util.logging.Logger;

public class ApplicationServer {
    private static final Logger logger = Logger.getLogger(ApplicationServer.class.getName());

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(50051).addService(new AddressService()).build();

        server.start();

        logger.info("Serviço iniciado na porta " + server.getPort());

        server.awaitTermination();

    }

}
