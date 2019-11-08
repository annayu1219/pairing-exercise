package spring.boot.pairing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentRepoTest {

    @Test
    public void saveBalanceShouldReturnValueInBalanceRequest() {
        PaymentRepo repo = new PaymentRepo();
        BalanceRequest request = new BalanceRequest("200");

        int result = repo.saveBalance(request);

        assertEquals(result, 200);
    }

}