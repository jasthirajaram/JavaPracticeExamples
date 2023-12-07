package com.builder.phonebuilder;

import com.builder.phone.Phone;

public class PhoneBuilder {
	private String phoneName;
	private String processor;
	private int ram;
	private int storage;

	public PhoneBuilder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PhoneBuilder setPhoneName(String phoneName) {
		this.phoneName = phoneName;
		return this;
	}

	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}

	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}

	public PhoneBuilder setStorage(int storage) {
		this.storage = storage;
		return this;
	}

	public Phone getPhone() {
		return new Phone(phoneName, processor, ram, storage);
	}

}
