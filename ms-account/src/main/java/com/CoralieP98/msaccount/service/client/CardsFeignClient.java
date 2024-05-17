package com.CoralieP98.msaccount.service.client;


import com.CoralieP98.msaccount.model.Cards;
import com.CoralieP98.msaccount.model.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("ms-cards")
public interface CardsFeignClient {

    @RequestMapping(method = RequestMethod.POST, value = "myCards", consumes = "application/json")
    List<Cards> getCardsDetails(@RequestBody Customer customer);
}
