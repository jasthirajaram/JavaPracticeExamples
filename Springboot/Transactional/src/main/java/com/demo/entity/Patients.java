package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Patients {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int patientno;
	private String name;
	
	private String gender;
	private long mobile;
	private int age;

	public Patients() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patients(int patientno, String name, String gender, long mobile, int age) {
		super();
		this.patientno = patientno;
		this.name = name;
		this.gender = gender;
		this.mobile = mobile;
		this.age = age;
	}

	public int getPatientno() {
		return patientno;
	}

	public void setPatientno(int patientno) {
		this.patientno = patientno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Patients [patientno=" + patientno + ", name=" + name + ", gender=" + gender + ", mobile=" + mobile
				+ ", age=" + age + "]";
	}
}
