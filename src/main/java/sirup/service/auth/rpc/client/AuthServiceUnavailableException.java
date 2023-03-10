package sirup.service.auth.rpc.client;

public class AuthServiceUnavailableException extends RuntimeException {
    public AuthServiceUnavailableException() {}
    public AuthServiceUnavailableException(String message) { super(message); }
}
