package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.exception.EnterFullDetailsException;
import com.employee.exception.UserNotFoundException;
import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		//double d = employee.getSalary();
		try {
			if(employee.getFname().isEmpty() || employee.getLname().isEmpty() || employee.getDept().isEmpty() || employee.getSalary() == 0 || employee.getYoj() == 0) {
				throw new EnterFullDetailsException();
			}
		}
		catch (Exception e) {
			throw new EnterFullDetailsException();
		}
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> findByfname(String fname) {
		List<Employee> data = null;
		try {
			data = employeeRepository.findByFname(fname);
		} catch (Exception e) {
			throw new UserNotFoundException();
		}
		if (data.isEmpty())
			throw new UserNotFoundException();
		return data;
	}

	@Override
	public List<Employee> findBySalaryAndYoj(double salary, int yoj) {
		List<Employee> data = null;
		try {
			data = employeeRepository.findBySalaryAndYoj(salary, yoj);
		} catch (Exception e) {
			throw new UserNotFoundException();
		}
		if (data.isEmpty())
			throw new UserNotFoundException();
		return data;
	}

	@Override
	public List<Employee> findBylname(String lname) {
		List<Employee> data = null;
		try {
			data = employeeRepository.findByLname(lname);
		} catch (Exception e) {
			throw new UserNotFoundException();
		}
		if (data.isEmpty())
			throw new UserNotFoundException();
		return data;
	}
	
	
}
