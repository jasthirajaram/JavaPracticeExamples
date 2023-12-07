package com.jdk8;

public class SomeClass implements SomeInterface{
	
	@Override
	public void show() {
		System.out.println("Hi");
		SomeInterface.start();
	}
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		SomeInterface s = new SomeClass();
		s.show();
		

	}

}
