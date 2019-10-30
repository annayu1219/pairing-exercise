package spring.boot.pairing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    private PaymentRepo repo;

    public PaymentController(PaymentRepo repo) {
        this.repo = repo;
    }

    @GetMapping("/")
    public String sayHello() {
        return "hello";
    }

    @PostMapping("/balance")
    public CurrentBalance inputBalance(@RequestBody NewBalance balance) {
        return repo.saveBalance(balance);
    }
}
