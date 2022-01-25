package org.example.services.data;

import org.example.entities.Bank;
import org.example.entities.Client;
import org.example.entities.Credit;
import org.example.entities.LoanOffer;

import java.util.List;
import java.util.UUID;

public interface LoanOfferService {

    LoanOffer addLoanOffer(LoanOffer loanOffer);
    void delete(UUID id);
    LoanOffer editLoanOffer(LoanOffer loanOffer);
    List<LoanOffer> getAll();
    LoanOffer findByClient(Client client);
    LoanOffer findByCredit(Credit credit);
}
