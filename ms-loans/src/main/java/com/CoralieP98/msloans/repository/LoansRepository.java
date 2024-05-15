package com.CoralieP98.msloans.repository;

import com.CoralieP98.msloans.model.Loans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoansRepository extends JpaRepository<Loans,Integer> {
    public List<Loans> getAllLoansByCustomerId(int customerId);
}
