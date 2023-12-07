package com.factory.area;

import java.util.*;

public class AreaOfRectangle implements Shape {
	private int length;
	private int breadth;

	@Override
	public void area() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle");
		length = sc.nextInt();
		System.out.println("Enter the breadth of the rectangle");
		breadth = sc.nextInt();
		System.out.println("The area of reactangle is: " + (length * breadth));
		sc.close();
	}

}
