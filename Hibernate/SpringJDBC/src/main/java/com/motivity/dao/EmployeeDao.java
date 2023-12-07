package com.motivity.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.motivity.entity.Employee;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	//inserting into the table employee
	public int insertRecord(Employee employee) {
		String query = "insert into employee values (?,?,?,?)";
		int result = this.jdbcTemplate.update(query, employee.getEmpId(), employee.getEmpName(),
				employee.getEmpSalary(), employee.getEmpAddress());
		return result;
	}
	
	//selecting single record from employee table
	public Employee retrievingSingleRecord(int empID) {
		String query = "select * from employee where empId=?";
		RowMapperImpl impl = new RowMapperImpl();
		Employee employee = this.jdbcTemplate.queryForObject(query,impl,empID);
		return employee;
	}
	
	//selecting all records from employee table
	public List<Employee> retrievingMultipleRecords(){
		String query = "select * from employee";
		List<Employee> employees = this.jdbcTemplate.query(query, new RowMapperImpl());
		return employees;
	} 

	// updating the record
	public int updateRecord(Employee employee) {
		String query = "update employee set empName=? where empId=?";
		int result = this.jdbcTemplate.update(query,employee.getEmpName(),employee.getEmpId());
		return result;
	}
	
	// deleting the record
	public int deleteRecord(int empId) {
		String query = "delete from employee where empId=?";
		int result = this.jdbcTemplate.update(query,empId);
		return result;
	}
	
}
