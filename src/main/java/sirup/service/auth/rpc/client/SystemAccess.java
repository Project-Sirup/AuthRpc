package sirup.service.auth.rpc.client;

public enum SystemAccess {
    HIDDEN(-1),
    DEFAULT(0),
    SERVICE(1),
    PRO(2),
    ADMIN(3);
    public final int id;
    SystemAccess(final int id) {
        this.id = id;
    }
}
