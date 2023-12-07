package com.motivity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "manager1")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
@Id
@GeneratedValue
	 private int eid;
	 private String firstname;
	 private String lastname;
	 private String fullname;
     private int salary;
	 private String dept;
	 private int age;
	 private String empcode;
	 
//	 
//	public int getEid() {
//		return eid;
//	}
//	public void setEid(int eid) {
//		this.eid = eid;
//	}
//	public String getEname() {
//		return ename;
//	}
//	public void setEname(String ename) {
//		this.ename = ename;
//	}
//	public String getDept() {
//		return dept;
//	}
//	public void setDept(String dept) {
//		this.dept = dept;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	@Override
//	public String toString() {
//		return "Employee [eid=" + eid + ", ename=" + ename + ", dept=" + dept + ", age=" + age + "]";
//	}
//	 
	 
}
