package com.starbank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.starbank.entities.Account;

public interface AccountRepository extends JpaRepository<Account,Long> {
	@Query("Select a from Account a where a.ownerName = ?1")
	Account findByOwnerName(String ownerName);

	@Query("Select a from Account a where a.balance= ?1")
	Account findByBalance(double balance);

}
