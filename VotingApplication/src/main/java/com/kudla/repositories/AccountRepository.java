package com.kudla.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kudla.entities.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {

}
