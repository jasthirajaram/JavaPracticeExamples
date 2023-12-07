package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.Appointments;

@Repository
public interface AppointmentsRepository extends JpaRepository<Appointments, Integer>{

}