package com.motivity.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Manager 
{
	@Id
	private int id;
	private String fname;
	private String lname;
	private String fullName;
	private String dept;
	private double sal;
	private String empcode;
	private int age;
	public Manager(int id, String fname, String lname, String fullName, String dept, double sal, String empcode,
			int age) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.fullName = fullName;
		this.dept = dept;
		this.sal = sal;
		this.empcode = empcode;
		this.age = age;
	}
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getEmpcode() {
		return empcode;
	}
	public void setEmpcode(String empcode) {
		this.empcode = empcode;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Manager [id=" + id + ", fname=" + fname + ", lname=" + lname + ", fullName=" + fullName + ", dept="
				+ dept + ", sal=" + sal + ", empcode=" + empcode + ", age=" + age + "]";
	}
	
	
}