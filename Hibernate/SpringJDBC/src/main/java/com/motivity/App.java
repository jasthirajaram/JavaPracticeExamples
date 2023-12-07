package com.motivity;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.motivity.dao.EmployeeDao;
import com.motivity.entity.Employee;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com.motivity.springJdbc.xml");
        EmployeeDao dao = context.getBean("employeeDao",EmployeeDao.class);
        //inserting into employee
        // Employee employee = new Employee(504, "Anil", "33000", "Chennai");
        // int result = dao.insertRecord(employee);
        // System.out.println("records affected are "+result);
        
        //selecting single record from employee
          Employee employee = dao.retrievingSingleRecord(501);
           System.out.println(employee);
        
        //selecting multiple records from employee
        // List<Employee> employees = dao.retrievingMultipleRecords();
        //  for (Employee employee : employees) {
        //	System.out.println(employee);
        //}
        
        //updating record
        //  Employee employee = new Employee(501, "Ballanki Abhilash", "25263", "Hyderabad");
        //  int result = dao.updateRecord(employee);
        //  System.out.println("Rows Updated are "+result);
        
        //deleting record 
//        int result = dao.deleteRecord(504);
//        System.out.println("Deleted records are "+result);
    }
}
