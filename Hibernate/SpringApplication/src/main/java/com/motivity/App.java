package com.motivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.motivity.config.EmployeeConfig;
import com.motivity.entity.Employee;

public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		Employee employee = applicationContext.getBean("emp1", Employee.class);
		Employee employee1 = applicationContext.getBean("emp2", Employee.class);
		Employee employee2 = applicationContext.getBean("emp3", Employee.class);
		Employee employee3 = applicationContext.getBean("emp4", Employee.class);
		Employee employee4 = applicationContext.getBean("emp5", Employee.class);
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(employee);
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);

		Comparator<Employee> comparatorByDept = new Comparator<Employee>() {

			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getDept().compareTo(o2.getDept());
			}
		};
		Comparator<Employee> comparatorByFname = new Comparator<Employee>() {

			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
		};
		Comparator<Employee> comparatorBySalary = new Comparator<Employee>() {

			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				if (o1.getSalary() > o2.getSalary())
					return 1;
				else
					return -1;
			}
		};

		System.out.println("sorted by using department");
		Collections.sort(employees, comparatorByDept);
		for (Employee employee5 : employees) {
			System.out.println(employee5);
		}
		System.out.println("==================================================");
		System.out.println("sorted by using fname");
		Collections.sort(employees, comparatorByFname);
		for (Employee employee5 : employees) {
			System.out.println(employee5);
		}
		System.out.println("==================================================");
		System.out.println("sorted by using Salary");
		Collections.sort(employees, comparatorBySalary);
		for (Employee employee5 : employees) {
			System.out.println(employee5);
		}
		System.out.println("=================================================");

	}

}
