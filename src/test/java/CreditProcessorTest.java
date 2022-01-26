import org.example.Main;
import org.example.entities.Client;
import org.example.entities.LoanOffer;
import org.example.services.CreditProcessor;
import org.example.services.data.CreditService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootTest(classes = Main.class)
public class CreditProcessorTest {


    @Autowired
    CreditProcessor creditProcessor;

    @Autowired
    CreditService creditService;

    @Test
    @Transactional
    public void annuitettest() {
        LoanOffer loanOffer = new LoanOffer(new Client(),
                creditService.getAll().get(1),
                new BigDecimal("100000"),
                LocalDate.now(),
                new BigDecimal("10"),
                6);


        creditProcessor.countAnnuitet(loanOffer).stream()
                .forEach(
                        (x) -> System.out.println(
                                x.getPaymentDate() + " " +
                                x.getPaymentCreditBody() + " " +
                                x.getPaymentCreditPercent() + " " +
                                x.getPaymentSum()));


    }


}
