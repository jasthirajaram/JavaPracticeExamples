package com.employee.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	private String fname;
	private String lname;
	private double salary;
	private String dept;
	private int yoj;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(int eid, String fname, String lname, double salary, String dept, int yoj) {
		super();
		this.eid = eid;
		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
		this.dept = dept;
		this.yoj = yoj;
	}


	public int getYoj() {
		return yoj;
	}


	public void setYoj(int yoj) {
		this.yoj = yoj;
	}


	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", fname=" + fname + ", lname=" + lname + ", salary=" + salary + ", dept="
				+ dept + ", yoj=" + yoj + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(dept, eid, fname, lname, salary, yoj);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(dept, other.dept) && eid == other.eid && Objects.equals(fname, other.fname)
				&& Objects.equals(lname, other.lname)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary) && yoj == other.yoj;
	}
	
}
