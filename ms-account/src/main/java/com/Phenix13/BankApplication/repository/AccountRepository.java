package com.Phenix13.BankApplication.repository;

import com.Phenix13.BankApplication.controller.AccountController;
import com.Phenix13.BankApplication.model.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Accounts, Integer> {

    public Accounts getAccountByCustomerId(int customerId);
}
