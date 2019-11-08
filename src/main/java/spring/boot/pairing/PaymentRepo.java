package spring.boot.pairing;

import org.springframework.stereotype.Repository;

@Repository
public class PaymentRepo {

    private Integer repo;

    public PaymentRepo() {}

    public int saveBalance(BalanceRequest balance) {
        repo = Integer.valueOf(balance.getValue());
        return repo;
    }
}
