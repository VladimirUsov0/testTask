package org.example.services.data;

import lombok.AllArgsConstructor;
import org.example.entities.Client;
import org.example.entities.Credit;
import org.example.entities.LoanOffer;
import org.example.repo.LoanOfferRepo;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class LoanOfferServiceImpl implements LoanOfferService {

    LoanOfferRepo loanOfferRepo;


    @Override
    public LoanOffer addLoanOffer(LoanOffer loanOffer) {
        return loanOfferRepo.save(loanOffer);
    }

    @Override
    public LoanOffer findById(UUID id) {
        return loanOfferRepo.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public void delete(UUID id) {
        loanOfferRepo.deleteById(id);
    }

    @Override
    public LoanOffer editLoanOffer(LoanOffer loanOffer) {
        return loanOfferRepo.saveAndFlush(loanOffer);
    }

    @Override
    public List<LoanOffer> getAll() {
        return loanOfferRepo.findAll();
    }

    @Override
    public LoanOffer findByClient(Client client) {
        return loanOfferRepo.findByClientEquals(client).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public LoanOffer findByCredit(Credit credit) {
        return loanOfferRepo.findByCreditEquals(credit).orElseThrow(EntityNotFoundException::new);
    }
}
