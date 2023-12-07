package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.Patients;

@Repository
public interface PatientsRepository extends JpaRepository<Patients, Integer>{

}