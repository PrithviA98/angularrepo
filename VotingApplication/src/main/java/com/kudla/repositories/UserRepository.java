package com.kudla.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kudla.entities.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {

}
