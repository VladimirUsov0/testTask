package org.example.controllers;

import lombok.AllArgsConstructor;
import org.example.entities.Client;
import org.example.entities.Credit;
import org.example.entities.LoanOffer;
import org.example.entities.PaymentSchedule;
import org.example.services.CreditProcessor;
import org.example.services.data.ClientService;
import org.example.services.data.CreditService;
import org.example.services.data.LoanOfferService;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/offer")
@AllArgsConstructor
public class OfferController {

    ClientService clientService;
    CreditService creditService;
    LoanOfferService loanOfferService;
    CreditProcessor creditProcessor;


    @PostMapping("/create")
    public String createOfferAndShowSchedule(Model model,
                                             @ModelAttribute("loanOffer") LoanOffer loanOffer) {

        //        Client client = clientService.findById(UUID.fromString(clientId));
//        Credit credit = creditService.findById(UUID.fromString(creditId));
//        BigDecimal sumbd = new BigDecimal(sum);
//        int monthsCount = Integer.parseInt(period);
//        LoanOffer loanOffer = new LoanOffer(client,credit,sumbd, LocalDate.now(),BigDecimal.ZERO,monthsCount);
          Credit credit = creditService.findById(loanOffer.getCredit().getCreditID());
        Client client = clientService.findById(loanOffer.getClient().getClientID());
        loanOffer.setCredit(credit);
        loanOffer.setClient(client);
        LoanOffer la =  loanOfferService.addLoanOffer(loanOffer);
        la.setPaymentSchedule(creditProcessor.countAnnuitet(la));
//        List<PaymentSchedule> paymentScheduleList =  creditProcessor.countAnnuitet(la);
        model.addAttribute("paymentScheduleList",la.getPaymentSchedule());
        return "/offer/schedule";
    }

    @GetMapping("/preparation")
    public  String preparationOffer(Model model){

        model.addAttribute("clients",clientService.getAll());
        model.addAttribute("credits",creditService.getAll());
        model.addAttribute("loanOffer",new LoanOffer());
        return "/offer/createOffer";
    }

}
