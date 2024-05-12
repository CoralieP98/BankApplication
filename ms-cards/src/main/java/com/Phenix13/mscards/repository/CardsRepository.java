package com.Phenix13.mscards.repository;

import com.Phenix13.mscards.model.Cards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardsRepository extends JpaRepository<Cards, Integer> {
    public List<Cards> getAllCardsByCustomerId(int customerId);
}
