package com.spring.jdbc.dao;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entity.Employee;

public class EmployeeDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}



	public int insert(Employee employee) {
		String query = "insert into employee values(?, ?, ?, ?)";
		int result = jdbcTemplate.update(query, employee.getEid(), employee.getEname(), employee.getSalary(), employee.getAddress());
		return result;
	}
	
	public Employee retrieve(Employee employee){
		String query = "select * from employee";
		RowMapper<Employee> rm=new RowmapperImpl();
		Employee e=this.jdbcTemplate.queryForObject(query, rm);
		return e;
		
	}
	
	public int update(Employee employee){  
	    String query="update employee set ename=? where eid=?";  
	    int result =  jdbcTemplate.update(query, employee.getEname(), employee.getEid());
		return result;  
	}	
}
