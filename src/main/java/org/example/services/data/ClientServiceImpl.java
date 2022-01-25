package org.example.services.data;

import lombok.AllArgsConstructor;
import org.example.entities.Bank;
import org.example.entities.Client;
import org.example.entities.LoanOffer;
import org.example.repo.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements ClientService {

    ClientRepo clientRepo;

    @Override
    public Client addClient(Client client) {
        Client client1 = clientRepo.save(client);
        return client1;
    }

    @Override
    public void delete(UUID id) {
        clientRepo.deleteById(id);
    }

    @Override
    public Client getById(UUID id) {
        return clientRepo.getById(id);
    }

    @Override
    public Client getByFIO(String fio) {
        return clientRepo.findByFioEquals(fio).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public Client getByPhone(String phone) {
        return clientRepo.findClientByPhoneEquals(phone).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public Client getByEmail(String email) {
        return clientRepo.findClientByEmailEquals(email).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public Client getByPassportNumber(String passportNumber) {
        return clientRepo.findClientByPassportNumberEquals(passportNumber).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public Client editClient(Client client) {
        return clientRepo.saveAndFlush(client);
    }

    @Override
    public List<Client> getAll() {
        return clientRepo.findAll();
    }

    @Override
    public List<Client> findAllByBank(Bank bank) {
        return clientRepo.findAllByBankListContaining(bank);
    }

    @Override
    public List<Client> findAllByLoanOffer(LoanOffer loanOffer) {
        return clientRepo.findAllByLoanOfferListContaining(loanOffer);
    }
}
