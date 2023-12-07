package com.motivity.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentDetail {
	@Id
	private int rollNo;
	private String studName;
	private String stuAddress;
	private String stuCourse;
	public StudentDetail(int rollNo, String studName, String stuAddress, String stuCourse) {
		super();
		this.rollNo = rollNo;
		this.studName = studName;
		this.stuAddress = stuAddress;
		this.stuCourse = stuCourse;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getStuAddress() {
		return stuAddress;
	}
	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}
	public String getStuCourse() {
		return stuCourse;
	}
	public void setStuCourse(String stuCourse) {
		this.stuCourse = stuCourse;
	}
	
}
