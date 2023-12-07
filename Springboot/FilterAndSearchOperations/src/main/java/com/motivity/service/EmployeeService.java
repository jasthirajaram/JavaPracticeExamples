package com.motivity.service;

import java.util.List;
import java.util.Optional;

import com.motivity.model.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee emp);

	void deleteByID(Integer id);

	Optional<Employee> getbyEmployeeid(Integer id);

	List<Employee> getAllEmps();

	//Boolean ExistByename(String ename);
	
	//public List<Employee> findByempcodeStartsWith(String code);

	public List<Employee> getAllEmp(); 
	
	Boolean Existbyid(Integer id);
	
	public List<Employee> findBysalaryGreaterThan(Integer salary);

	public List<Employee> filterData(String filtertype, String empcode);

	List<Employee> searchingEmployeeData(String YourInput);

	

}
