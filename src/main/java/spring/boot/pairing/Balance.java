package spring.boot.pairing;

import org.springframework.stereotype.Component;

@Component
public class Balance {

    private Integer balance;

    public Balance() {}

    public Balance(Integer initialBalance) {
        balance = initialBalance;
    }

    public Integer saveBalance(BalanceRequest balance) {
        this.balance = Integer.valueOf(balance.getValue());
        return this.balance;
    }

    public Integer add(Integer value) {
        return value + balance;
    }
}
