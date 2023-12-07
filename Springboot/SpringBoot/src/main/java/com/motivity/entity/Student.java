package com.motivity.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student 
{
	@Id
	private int id;
	private String sname;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String sname) {
		super();
		this.id = id;
		this.sname = sname;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + "]";
	}
	

}
