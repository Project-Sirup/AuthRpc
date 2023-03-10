package sirup.service.auth.rpc.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import sirup.service.auth.rpc.proto.*;

import java.util.concurrent.TimeUnit;

public class AuthClient {
    private static String address;
    private static int port;
    private static AuthClient instance;
    private ManagedChannel managedChannel;
    private SirupAuthGrpc.SirupAuthBlockingStub authService;
    private AuthClient() {
        managedChannel = ManagedChannelBuilder.forAddress(address,port).usePlaintext().build();
        authService = SirupAuthGrpc.newBlockingStub(managedChannel);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                managedChannel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }));
    }

    public static void init(String address, int port) {
        AuthClient.address = address;
        AuthClient.port = port;
    }

    public static AuthClient getInstance() {
        return instance == null ? instance = new AuthClient() : instance;
    }

    public boolean auth(String token, String userId) throws AuthServiceUnavailableException {
        AuthRequest request = AuthRequest.newBuilder()
                .setToken(token)
                .setCredentialsRpc(CredentialsRpc.newBuilder().setUserID(userId))
                .build();
        AuthResponse response;
        try {
            response = authService.auth(request);
        } catch (StatusRuntimeException e) {
            throw new AuthServiceUnavailableException(e.getMessage());
        }
        return response.getTokenValid();
    }

    public String token(String userId) throws AuthServiceUnavailableException {
        TokenRequest request = TokenRequest.newBuilder().setCredentials(CredentialsRpc.newBuilder().setUserID(userId)).build();
        TokenResponse response;
        try {
            response = authService.token(request);
        } catch (StatusRuntimeException e) {
            throw new AuthServiceUnavailableException(e.getMessage());
        }
        return response.getToken();
    }
}
