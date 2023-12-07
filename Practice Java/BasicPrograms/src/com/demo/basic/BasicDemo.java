package com.demo.basic;

public class BasicDemo {
	public static void addition() {
		byte a = 10;
		int b = 20;
		System.out.println("The sum of " + a + " and " + b + " is " + (a + b));
	}

	public static void substraction() {
		int a = 20;
		int b = 10;
		System.out.println("The difference between " + a + " and " + b + " is " + (a - b));
	}

	public static void multiplication() {
		int a = 2;
		int b = 4;
		System.out.println("The product of " + a + " and " + b + " is " + (a * b));
	}

	public static void main(String[] args) {
		addition();
		substraction();
		multiplication();
	}
}