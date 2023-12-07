package com.Manager.Management.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Manager.Management.Entity.Manager;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, Integer>{

	List<Manager> findByFirstName(String firstName);
	
	List<Manager> findByFirstNameAndLastName(String firstName , String lastName);
	
	List<Manager> findByEmpCodeStartingWith(String empCode);
	
	List<Manager> findByEmpCodeEndingWith(String empCode);
	
	List<Manager> findByEmpCodeContaining(String empCode);
	
	List<Manager> findByEmpCodeNotContaining(String empCode);
	
	List<Manager> findByEmpCodeEquals(String empCode);
	
	List<Manager> findByEmpCodeNot(String empCode);
	
	//-------------------------------------------//
	List<Manager> findBySalaryBetween(int start,int end);
	
	List<Manager> findByFullNameLike(String fullName);
	
	List<Manager> findBySalaryGreaterThanEqual(int salary);
	
	
	
	
	
}
