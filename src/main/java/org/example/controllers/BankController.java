package org.example.controllers;

import lombok.AllArgsConstructor;
import org.example.entities.Bank;
import org.example.services.data.BankService;
import org.example.services.data.ClientService;
import org.example.services.data.CreditService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

@Controller
@RequestMapping("/banks/")
@AllArgsConstructor
public class BankController {

    BankService bankService;
    ClientService clientService;
    CreditService creditService;


    @GetMapping("/bankList")
    public String showAllBanks(Model model) {
        model.addAttribute("bankService", bankService);
        return "banks/BankList";
    }

    @RequestMapping(value = "/edit",method = { RequestMethod.POST, RequestMethod.GET })
    public String editBank(Model model, @RequestParam("bankId") String id) {
        model.addAttribute("bank", bankService.findById(UUID.fromString(id)));
        return "banks/BankEdit";
    }

    @PostMapping(value = "/delete")
    public String deleteBank(@RequestParam("bankId") String id) {
        bankService.delete(UUID.fromString(id));
        return "redirect:/banks/bankList";
    }

    @PostMapping(value = "/addNew")
    public String addNewBank(Bank bank, Model model) {
        bankService.addBank(bank);
        return "banks/BankEdit";
    }


    @PostMapping(value = "/detachClient")
    public String detachClient(@RequestParam("clientToDetach") String clientId, @RequestParam("bankId") String bankId, RedirectAttributes redirectAttrs) {
        bankService.detachClient(UUID.fromString(bankId), clientService.findById(UUID.fromString(clientId)));
        redirectAttrs.addAttribute("bankId", bankId);
        return "redirect:/banks/edit";
    }

    @PostMapping(value = "/detachCredit")
    public String detachCredit(@RequestParam("creditToDetach") String creditId, @RequestParam("bankId") String bankId, RedirectAttributes redirectAttrs) {
        bankService.detachCredit(UUID.fromString(bankId), creditService.findById(UUID.fromString(creditId)));
        redirectAttrs.addAttribute("bankId", bankId);
        return "redirect:/banks/edit";

    }

    @PostMapping(value = "/appendClient")
    public String appendClient(@RequestParam("clientToAppend") String clientId, @RequestParam("bankId") String bankId, RedirectAttributes redirectAttrs) {
        bankService.appendClient(UUID.fromString(bankId), clientService.findById(UUID.fromString(clientId)));
        redirectAttrs.addAttribute("bankId", bankId);
        return "redirect:/banks/edit/{bankId}";
    }

    @PostMapping(value = "/appendCredit")
    public String appendCredit(@RequestParam("creditToAppend") String creditId, @RequestParam("bankId") String bankId, RedirectAttributes redirectAttrs) {
        bankService.appendCredit(UUID.fromString(bankId), creditService.findById(UUID.fromString(creditId)));
        redirectAttrs.addAttribute("bankId", bankId);
        return "redirect:/banks/edit/{bankId}";
    }
}
