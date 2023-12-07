package com.employee.service;

import java.util.List;

import com.employee.model.Employee;

public interface EmployeeService {
	public Employee saveEmployee(Employee employee);
	
	public List<Employee> findByfname(String fname);
	
	public List<Employee> findBylname(String lname);
	
	List<Employee> findBySalaryAndYoj(double salary, int yoj);

}