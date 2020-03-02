package com.aciworldwide.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aciworldwide.entities.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

	@Query("Select a from Account a where a.ownerName = ?1")
	Account findByOwnerName(String ownerName);

	@Query("Select a from Account a where a.balance= ?1")
	Account findByBalance(double balance);

}
