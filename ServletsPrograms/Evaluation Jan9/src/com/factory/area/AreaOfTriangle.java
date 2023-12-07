package com.factory.area;

import java.util.Scanner;

public class AreaOfTriangle implements Shape {
	private int height;
	private int base;

	@Override
	public void area() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height of the trianglee");
		height = sc.nextInt();
		System.out.println("Enter the base of the triangle");
		base = sc.nextInt();
		System.out.println("The area of triangle is: " + (base * height) / 2);
		sc.close();
	}
}
