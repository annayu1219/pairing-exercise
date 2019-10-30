package spring.boot.pairing;

public class CurrentBalance {
    private String id;
    private String value;

    public CurrentBalance(String id, String value) {
        this.id = id;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String getId() {
        return id;
    }
}
