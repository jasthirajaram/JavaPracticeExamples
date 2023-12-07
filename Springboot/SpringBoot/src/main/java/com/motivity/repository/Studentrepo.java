package com.motivity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.motivity.entity.Student;

@Repository
public interface Studentrepo extends JpaRepository<Student, Integer> 
{
	
	List<Student> findBysname(String sname);

	boolean existsBysname(String sname);


	
}
