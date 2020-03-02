package com.kudla.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kudla.entities.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate, Integer> {

}
