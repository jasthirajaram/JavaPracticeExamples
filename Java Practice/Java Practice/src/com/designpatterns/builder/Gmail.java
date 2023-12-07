package com.designpatterns.builder;

public class Gmail {
	private String name;
	private long phoneNumber;
	private String dob;
	private String mail;

	public Gmail(String name, long phoneNumber, String dob, String mail) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.dob = dob;
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "Gmail [name=" + name + ", phoneNumber=" + phoneNumber + ", dob=" + dob + ", mail=" + mail + "]";
	}

}
