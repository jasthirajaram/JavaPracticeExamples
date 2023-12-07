package com.factory.area;

import java.util.Scanner;

public class AreaOfSquare implements Shape {
	private int side;

	@Override
	public void area() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of the square");
		side = sc.nextInt();
		System.out.println("The area of square is: " + (side * side));
		sc.close();
	}
}
