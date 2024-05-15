package com.CoralieP98.msaccount.controller;

import com.CoralieP98.msaccount.model.Accounts;
import com.CoralieP98.msaccount.repository.AccountRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    private final AccountRepository accountRepository;

    public AccountController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }


    @PostMapping("/myAccount")
    public Accounts getAccount(@RequestBody Accounts customer){
        return accountRepository.getAccountByCustomerId(customer.getCustomerId());
    }
}
