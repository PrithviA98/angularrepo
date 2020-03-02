package com.aciworldwide.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aciworldwide.entities.User;

//PERSISTENCE LAYER
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	//JPQL-java persistence query lang----obj oriented query lang
	
	User findByUsername(String username);
	
	
}
