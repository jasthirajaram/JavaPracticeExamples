package com.thread.demo;

public class Basic {
	public static void main(String[] args) {
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		Integer i1 = -128;
		Integer i2 = -128;
		Integer i3 = 128988;
		Integer i4 = 128988;
		System.out.println(i1 == i2);
		System.out.println(i3 == i4);
		System.out.println("*******************************");
		int num1 = 5;
		int num2 = 4;
		int a=(num1>num2)?num1:num2;
		System.out.println(a);
	}
}