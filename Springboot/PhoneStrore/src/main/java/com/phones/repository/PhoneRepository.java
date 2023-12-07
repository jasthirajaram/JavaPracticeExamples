package com.phones.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phones.model.Phones;

@Repository
public interface PhoneRepository extends JpaRepository<Phones, Integer> {

}