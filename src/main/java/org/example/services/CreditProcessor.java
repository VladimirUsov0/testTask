package org.example.services;

import org.example.services.data.LoanOfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.example.repo.ClientRepo;

import java.math.BigDecimal;

@Component
public class CreditProcessor {


    LoanOfferService loanOfferService;


    void dd(){

    }



    BigDecimal countAnnuitet(){
        return null;
    }


    private float interestRate(){

        return 0f;
    }

}
