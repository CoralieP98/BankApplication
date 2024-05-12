package com.Phenix13.msloans.controller;

import com.Phenix13.msloans.model.Customer;
import com.Phenix13.msloans.model.Loans;
import com.Phenix13.msloans.repository.LoansRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class LoansController {
    private final LoansRepository loansRepository;

    public LoansController(LoansRepository loansRepository) {
        this.loansRepository = loansRepository;
    }

    @PostMapping("/myLoans")
    public List<Loans> getLoans(@RequestBody Customer customer){
        return loansRepository.getAllLoansByCustomerId(customer.getCustomerId());
    }
}
