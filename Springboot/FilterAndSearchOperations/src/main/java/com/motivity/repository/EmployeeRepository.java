package com.motivity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.motivity.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
         

	//public Boolean  existsByename(String ename);
	
	//public List<Employee> findByempcodeStartsWith(String code);
	
	@Query("select m from Employee m")// standard query
	public List<Employee> getAllEmp();
	
	@Query(value =  "select * from manager1  where salary>?1",nativeQuery = true)
	public List<Employee> findBysalaryGreaterThan(Integer salary);

	   
	@Query("SELECT e FROM Employee e WHERE e.firstname LIKE CONCAT('%',:query,'%')"+
		        "or e.lastname LIKE CONCAT('%',:query,'%') "+
		        "or e.fullname LIKE CONCAT('%',:query,'%')"+
		        "or e.dept LIKE CONCAT('%',:query,'%')"+
		        "or e.age LIKE CONCAT('%',:query,'%')"+
		        "or e.salary LIKE CONCAT('%',:query,'%')"+
		        "or e.empcode LIKE CONCAT('%',:query,'%')")
    List<Employee> searchingEmployeeData(@Param("query") String YourInput);
	   
	   

       List<Employee> findByEmpcodeStartsWith(String empcode);
       
       List<Employee> findByEmpcodeEndsWith(String empcode);
       
       List<Employee> findByEmpcodeEquals(String empcode);
       
       List<Employee> findByEmpcodeNot(String empcode);
       
      List<Employee> findByEmpcodeContaining(String empcode);
       
      List<Employee> findByEmpcodeNotContaining(String empcode);
			       

}
