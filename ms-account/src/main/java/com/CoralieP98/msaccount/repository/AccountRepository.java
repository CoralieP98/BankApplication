package com.CoralieP98.msaccount.repository;

import com.CoralieP98.msaccount.model.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Accounts, Integer> {

    public Accounts getAccountByCustomerId(int customerId);
}
