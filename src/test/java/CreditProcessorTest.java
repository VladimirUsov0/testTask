import org.example.Main;
import org.example.entities.Client;
import org.example.entities.Credit;
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
                new Credit(new BigDecimal("5000000"),12),
                new BigDecimal("200000"),
                LocalDate.now(),
                new BigDecimal("10"),
                24);

        System.out.println("    date   getPaymentCreditBody    getPaymentCreditPercent    getPaymentSum"  );
        creditProcessor.countAnnuitet(loanOffer).stream()
                .forEach(
                        (x) -> System.out.println(
                                x.getPaymentDate() + " " +
                                x.getPaymentCreditBody() + " " +
                                x.getPaymentCreditPercent() + " " +
                                x.getPaymentSum()));


    }


}
