package com.motivity.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.motivity.entity.Employee;

public class RowMapperImpl implements RowMapper<Employee>{

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setEmpId(Integer.parseInt(rs.getString(1)));
		employee.setEmpName(rs.getString(2));
		employee.setEmpSalary(rs.getString(3));
		employee.setEmpAddress(rs.getString(4));
		return employee;
	}

}
