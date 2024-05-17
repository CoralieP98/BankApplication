package com.CoralieP98.msaccount.service.client;

import com.CoralieP98.msaccount.model.Cards;
import com.CoralieP98.msaccount.model.Customer;
import com.CoralieP98.msaccount.model.Loans;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("ms-loans")
public interface LoansFeignClient {

    @RequestMapping(method = RequestMethod.POST, value = "myLoans", consumes = "application/json")
    List<Loans> getLoansDetails(@RequestBody Customer customer);
}
