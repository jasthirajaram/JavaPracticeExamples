package com.demo.basic;

import java.util.Scanner;

public class FactorialUsingRecursion {
	public static int factorial(int i) {
		if (i == 0) {
			return 1;
		} else {
			return i * factorial(i - 1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int i = sc.nextInt();
		int factorial = factorial(i);
		System.out.println("Factorial: " + factorial);
		sc.close();
	}
}