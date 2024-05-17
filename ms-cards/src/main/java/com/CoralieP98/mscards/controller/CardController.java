package com.CoralieP98.mscards.controller;

import com.CoralieP98.mscards.model.Cards;
import com.CoralieP98.mscards.model.Customer;
import com.CoralieP98.mscards.repository.CardsRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardController {

    private final CardsRepository cardsRepository;

    public CardController(CardsRepository cardsRepository) {
        this.cardsRepository = cardsRepository;
    }

    @PostMapping("/myCards")
    public List<Cards> customerCards(@RequestBody Customer customer){
        return cardsRepository.getAllCardsByCustomerId(customer.getCustomerId());
    }


}
