package com.builder.phone;

public class Phone {
	private String phoneName;
	private String processor;
	private int ram;
	private int storage;

	public Phone(String phoneName, String processor, int ram, int storage) {
		super();
		this.phoneName = phoneName;
		this.processor = processor;
		this.ram = ram;
		this.storage = storage;
	}

	@Override
	public String toString() {
		return "Phone [phoneName=" + phoneName + ", processor=" + processor + ", ram=" + ram + ", storage=" + storage
				+ "]";
	}

}
