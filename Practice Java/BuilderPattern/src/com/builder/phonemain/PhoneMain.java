package com.builder.phonemain;

import com.builder.phone.Phone;
import com.builder.phonebuilder.PhoneBuilder;

public class PhoneMain {
	public static void main(String[] args) {
		Phone phone = new PhoneBuilder().setPhoneName("Samsung").setProcessor("Snapdragon").setRam(8).getPhone();
		System.out.println(phone);
	}
}