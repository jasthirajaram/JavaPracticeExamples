package com.motivity.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.motivity.model.Employee;
import com.motivity.repository.EmployeeRepository;
import com.motivity.service.EmployeeService;
import com.motivity.utility.Filters;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
    @Autowired
	private EmployeeRepository employeeRepository;

    @Override
	public Employee saveEmployee(Employee emp) {
		return employeeRepository.save(emp);
	}

	@Override
	public void deleteByID(Integer id) {
       employeeRepository.deleteById(id);		
	}

	@Override
	public Optional<Employee> getbyEmployeeid(Integer id) {
		return employeeRepository.findById(id);
	}

	

	
	@Override
	public Boolean Existbyid(Integer id) {
		return employeeRepository.existsById(id);
	}

	

	@Override
	public List<Employee> getAllEmps() {
		
		return employeeRepository.findAll();
	}

//	@Override
//	public List<Employee> findByempcodeStartsWith(String code) {
//		return employeeRepository.findAll();
//	}

	@Override
	public List<Employee> findBysalaryGreaterThan(Integer salary) {
		return employeeRepository.findBysalaryGreaterThan(salary);
	}

	@Override
	public List<Employee> getAllEmp() {
		return employeeRepository.getAllEmp();
	}

	@Override
	public List<Employee> filterData(String filtertype, String empcode) {
		
		List<Employee> list= new ArrayList<>();
		      Filters filter=Filters.valueOf(filtertype);
		switch (filter) {
		case startswith:
			list=employeeRepository.findByEmpcodeStartsWith(empcode);
			break;
		case endswith:
			list=employeeRepository.findByEmpcodeEndsWith(empcode);
			break;
		case equals:
			list=employeeRepository.findByEmpcodeEquals(empcode);
			break;
		case containing:
			list=employeeRepository.findByEmpcodeContaining(empcode);
			break;
		case notContaining:
			list=employeeRepository.findByEmpcodeNotContaining(empcode);
			break;
		case notequals:
			list=employeeRepository.findByEmpcodeNot(empcode);
			break;
				

		default:
			break;
		}
		return list;
	}

	@Override
	public List<Employee> searchingEmployeeData(String YourInput) {
		return employeeRepository.searchingEmployeeData(YourInput);
	}

//	@Override
//	public Boolean ExistByename(String ename) {
//		return employeeRepository.existsByename(ename);
//	}

	

	
	
	

}
