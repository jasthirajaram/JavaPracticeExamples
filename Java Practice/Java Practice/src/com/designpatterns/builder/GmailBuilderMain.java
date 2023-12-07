package com.designpatterns.builder;

public class GmailBuilderMain {
	public static void main(String[] args) {
		Gmail gmailObj = new GmailBuilder().setName("Rajaram").setMail("rajaram.jasthi@motivitylabs.com")
				.setDob("14/10/2000").setPhoneNumber(7288042796L).getInstGamil("Rajaram");
		System.out.println(gmailObj);
	}
}