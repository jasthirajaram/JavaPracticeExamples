package com.jwtsql.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class UserData {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	int uid;
	String username;
	String password;
	String email;
	String dept;
	int salary;
	public UserData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserData(int uid, String username, String password, String email, String dept, int salary) {
		super();
		this.uid = uid;
		this.username = username;
		this.password = password;
		this.email = email;
		this.dept = dept;
		this.salary = salary;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
}
