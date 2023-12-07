package com.spring.jdbc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.EmployeeDAO;
import com.spring.jdbc.entity.Employee;

public class Test {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("springJDBC.xml");
		//appContext.getBean("employeeDao", EmployeeDAO.class);
		EmployeeDAO dao = appContext.getBean("employeeDao", EmployeeDAO.class);
	    Employee employee = new Employee();
		employee .setEid(1);
	    employee.setEname("Ravikiran");
	    employee.setSalary(25000);
	    employee.setAddress("Miyapur");
	    int result = dao.update(employee);
	    System.out.println(result);
	}
}
