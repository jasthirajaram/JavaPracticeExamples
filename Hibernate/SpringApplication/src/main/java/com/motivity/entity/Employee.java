//create a Spring app using the list of employee and having feilds id ,firstname,lastname, phno,Address,salary,dept (create 10 no of employees) 
//and sort the data based on Dept,name,salary and get the fullname in the console 
//(make sure that the code will be developed by java configuration only)

package com.motivity.entity;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int phno;
	private String address;
	private int salary;
	private String dept;
	public Employee(int id, String firstName, String lastName, int phno, String address, int salary, String dept) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phno = phno;
		this.address = address;
		this.salary = salary;
		this.dept = dept;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPhno() {
		return phno;
	}

	public void setPhno(int phno) {
		this.phno = phno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", phno=" + phno
				+ ", address=" + address + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
	
}
