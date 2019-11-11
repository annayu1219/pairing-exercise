package spring.boot.pairing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class PaymentTest {

    @Test
    public void makePaymentReturnsPaymentValue() {
        Payment payment = new Payment();
        PaymentRequest request = new PaymentRequest("200");

        Integer result = payment.makePayment(request);

        assertEquals(200, result);
    }
}
