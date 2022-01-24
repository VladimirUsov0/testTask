package org.example.services.dto;

import lombok.Data;
import org.example.entities.LoanOffer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Data
public class PaymentScheduleDto {
    UUID id;

    LoanOffer loanOffer;

    LocalDate paymentDate;

    BigDecimal paymentSum;

    BigDecimal paymentCreditBody;

    BigDecimal paymentCreditPercent;
}
