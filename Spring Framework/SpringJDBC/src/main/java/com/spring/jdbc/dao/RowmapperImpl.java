package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entity.Employee;

public class RowmapperImpl  implements RowMapper<Employee>{

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setEid(Integer.parseInt(rs.getString(1)));
		employee.setEname(rs.getString(2));
		employee.setSalary(Integer.parseInt(rs.getString(3)));
		employee.setAddress(rs.getString(4));
		
		return employee;
	}

	
	}


