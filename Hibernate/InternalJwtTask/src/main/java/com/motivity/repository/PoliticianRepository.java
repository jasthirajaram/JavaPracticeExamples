package com.motivity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.motivity.model.Politician;

public interface PoliticianRepository extends JpaRepository<Politician, Integer> {

}
