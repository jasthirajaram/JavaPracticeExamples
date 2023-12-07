package com.designpatterns.builder;

public class GmailBuilder {
	private String name;
	private long phoneNumber;
	private String dob;
	private String mail;

	public GmailBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public GmailBuilder setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}

	public GmailBuilder setDob(String dob) {	
		this.dob = dob;
		return this;
	}

	public GmailBuilder setMail(String mail) {
		this.mail = mail;
		return this;
	}

	public Gmail getInstGamil(String name1) {
		// if(name.equals("Rajaram"));
		return new Gmail(name, phoneNumber, dob, mail);
	}
}
