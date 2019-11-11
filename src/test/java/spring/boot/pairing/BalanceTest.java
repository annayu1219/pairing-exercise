package spring.boot.pairing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalanceTest {

    @Test
    public void saveBalanceShouldReturnValueInBalanceRequest() {
        Balance balance = new Balance();
        BalanceRequest request = new BalanceRequest("200");

        Integer result = balance.saveBalance(request);

        assertEquals(result, 200);
    }

    @Test
    public void addShouldAddValueToBalance() {
        Balance balance = new Balance(100);

        Integer result = balance.add(200);

        assertEquals(result, 300);
    }

}