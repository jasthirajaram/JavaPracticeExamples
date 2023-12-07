package com.otp.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.otp.demo.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, String>{
	Optional<Student> findByPhone(String phone);
}
