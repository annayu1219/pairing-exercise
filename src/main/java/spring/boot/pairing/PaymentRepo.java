package spring.boot.pairing;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.UUID;

@Repository
public class PaymentRepo {

    private final HashMap<String, CurrentBalance> repo;

    public PaymentRepo() {
        repo = new HashMap<>();
    }

    public CurrentBalance saveBalance(NewBalance balance) {
        String id = UUID.randomUUID().toString();
        repo.put(id, new CurrentBalance(id, balance.getValue()));
        return repo.get(id);
    }
}
