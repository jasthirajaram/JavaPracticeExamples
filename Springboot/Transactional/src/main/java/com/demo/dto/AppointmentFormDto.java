package com.demo.dto;

public class AppointmentFormDto {
	private String name;
	private String gender;
	private long mobile;
	private int age;
	public AppointmentFormDto(String name, String gender, long mobile, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.mobile = mobile;
		this.age = age;
	}
	public AppointmentFormDto() {
		super();
		// TODO Auto-generated constructor stub
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
		return "AppointmentFormDto [name=" + name + ", gender=" + gender + ", mobile=" + mobile + ", age=" + age + "]";
	}
}
