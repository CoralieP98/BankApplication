package com.CoralieP98.msaccount.controller;

import ch.qos.logback.core.net.ObjectWriter;
import com.CoralieP98.msaccount.model.*;
import com.CoralieP98.msaccount.repository.AccountRepository;
import com.CoralieP98.msaccount.service.client.CardsFeignClient;
import com.CoralieP98.msaccount.service.client.LoansFeignClient;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {
    private final AccountRepository accountRepository;

//    @Autowired
//    AccountServiceConfig accountsConfig;

    @Autowired
    LoansFeignClient loansFeignClient;

    @Autowired
    CardsFeignClient cardsFeignClient;

    public AccountController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }


    @PostMapping("/myAccount")
    public Accounts getAccount(@RequestBody Accounts customer){
        return accountRepository.getAccountByCustomerId(customer.getCustomerId());
    }

    @PostMapping("myAccountDetails")
    public Accounts getAccountDetails(@RequestBody Customer customer){
        Accounts accounts = accountRepository.findByCustomerId(customer.getCustomerId());
        if (accounts != null){
            return accounts;
        }else{
            return null;
        }
    }

//    @GetMapping("/account/properties")
//    public String getPropertyDetails() throws JsonProcessingException{
//        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
//    }

    @PostMapping("/myCustomerDetail")
    public CustomerDetails myCustomerDetails(@RequestBody Customer customer){
        Accounts accounts = accountRepository.findByCustomerId(customer.getCustomerId());
        List<Loans> loans = loansFeignClient.getLoansDetails(customer);
        List<Cards> cards = cardsFeignClient.getCardsDetails(customer);

        CustomerDetails customerDetails = new CustomerDetails();
        customerDetails.setAccounts(accounts);
        customerDetails.setLoans(loans);
        customerDetails.setCards(cards);

        return customerDetails;
    }
}
