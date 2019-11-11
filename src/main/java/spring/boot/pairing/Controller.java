package spring.boot.pairing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private Balance balance;
    private Payment payment;

    public Controller(Balance balance, Payment payment) {
        this.balance = balance;
        this.payment = payment;
    }

    @GetMapping("/")
    public String sayHello() {
        return "hello";
    }

    @PostMapping("/balance")
    public Integer inputBalance(@RequestBody BalanceRequest request) {
        return balance.saveBalance(request);
    }

    @PostMapping("/payment")
    public Integer makePayment(@RequestBody PaymentRequest request) {
        return payment.makePayment(request);
    }
}
