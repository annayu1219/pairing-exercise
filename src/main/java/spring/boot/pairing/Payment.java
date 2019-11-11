package spring.boot.pairing;

import org.springframework.stereotype.Component;

@Component
public class Payment {

    private Balance balance;
    private Integer[] payments = new Integer[10];
    private int numOfPayments = 0;

    public Payment(Balance balance) {
        this.balance = balance;
    }

    public Integer makePayment(PaymentRequest payment) {
        Integer paymentValue = Integer.valueOf(payment.getValue());
        balance.add(paymentValue);
        payments[numOfPayments] = paymentValue;
        return paymentValue;
    }
}
