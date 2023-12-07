package com.demo.basic;

import java.util.Scanner;

public class Factorial {
	public static int factorial(int num) {
		int factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

	public static void main(String[] args) {
		// Try with resource
		Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			System.out.println(factorial(num));
			sc.close();
		
	}
}