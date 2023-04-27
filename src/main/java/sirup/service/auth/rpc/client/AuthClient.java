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
    private SirupAuthServiceGrpc.SirupAuthServiceBlockingStub authService;
    private AuthClient() {
        managedChannel = ManagedChannelBuilder.forAddress(address,port).usePlaintext().build();
        authService = SirupAuthServiceGrpc.newBlockingStub(managedChannel);
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

    public int health() {
        HealthRequest request = HealthRequest.newBuilder().build();
        HealthResponse response;
        try {
            response = authService.health(request);
        } catch (StatusRuntimeException e) {
            throw new AuthServiceUnavailableException(e.getMessage());
        }
        return response.getHealthCode();
    }

    public boolean auth(String token, String userId, int systemAccess) throws AuthServiceUnavailableException {
        AuthRequest request = AuthRequest.newBuilder()
                .setToken(token)
                .setCredentialsRpc(CredentialsRpc.newBuilder()
                        .setUserId(userId)
                        .setSystemAccess(systemAccess))
                .build();
        AuthResponse response;
        try {
            response = authService.auth(request);
        } catch (StatusRuntimeException e) {
            throw new AuthServiceUnavailableException(e.getMessage());
        }
        return response.getTokenValid();
    }

    public String token(String userId, int systemAccess) throws AuthServiceUnavailableException {
        TokenRequest request = TokenRequest.newBuilder()
                .setCredentials(CredentialsRpc.newBuilder()
                        .setUserId(userId)
                        .setSystemAccess(systemAccess)).build();
        TokenResponse response;
        try {
            response = authService.token(request);
        } catch (StatusRuntimeException e) {
            throw new AuthServiceUnavailableException(e.getMessage());
        }
        return response.getToken();
    }

    public String serviceToken(String adminId, String adminToken, String serviceId) {
        ServiceTokenRequest request = ServiceTokenRequest.newBuilder()
                .setAdminCredentials(CredentialsRpc.newBuilder()
                        .setUserId(adminId)
                        .setSystemAccess(SystemAccess.ADMIN.id)
                        .build())
                .setAdminToken(adminToken)
                .setServiceCredentials(CredentialsRpc.newBuilder()
                        .setUserId(serviceId)
                        .setSystemAccess(SystemAccess.SERVICE.id)
                        .build())
                .build();
        ServiceTokenResponse response;
        try {
            response = authService.serviceToken(request);
        } catch (StatusRuntimeException e) {
            throw new AuthServiceUnavailableException(e.getMessage());
        }
        return response.getToken();
    }
}
