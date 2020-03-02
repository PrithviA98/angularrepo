package com.aciworldwide.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aciworldwide.entities.User;

//PERSISTENCE LAYER
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	//JPQL-java persistence query lang----obj oriented query lang
	@Query("Select u from User u where u.username = ?1")
	User findByUsername(String username);
	
	//@Query("Select u from User where u.username=?1 and u.password=?2")
	//User findByUser(String username,String password);
	
}
