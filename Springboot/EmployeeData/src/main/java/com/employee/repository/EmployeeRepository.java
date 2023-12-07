package com.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.employee.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    //using salary and yoj
	@Query("SELECT e FROM Employee e WHERE e.salary>?1 AND e.yoj>?2")
	List<Employee> findBySalaryAndYoj(double salary, int yoj);
	
	//using fname
	@Query("SELECT e FROM Employee e where e.fname=?1")
	List<Employee> findByFname(String fname);
	
	//using lname
	@Query("SELECT e FROM Employee e where e.lname=?1")
	List<Employee> findByLname(String lname);
}