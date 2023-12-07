package com.resttemplate.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetEmployeeData {
	@JsonProperty("eid")
	private int eid;
	
	@JsonProperty("fname")
	private String fname;
	
	@JsonProperty("lname")
	private String lname;
	
	@JsonProperty("salary")
	private double salary;
	
	@JsonProperty("dept")
	private String dept;
	
	@JsonProperty("yoj")
	private int yoj;

	public GetEmployeeData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GetEmployeeData(int eid, String fname, String lname, double salary, String dept, int yoj) {
		super();
		this.eid = eid;
		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
		this.dept = dept;
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

	public int getYoj() {
		return yoj;
	}

	public void setYoj(int yoj) {
		this.yoj = yoj;
	}
}
