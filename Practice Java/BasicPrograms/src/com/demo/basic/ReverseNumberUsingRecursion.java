package com.demo.basic;

import java.util.Scanner;

public class ReverseNumberUsingRecursion {
	public static void reverseNumber(long number) {
		if(number<10) {
			System.out.println(number);
		}
		else {
			System.out.print(number%10);
			reverseNumber(number/10);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		long number = sc.nextInt();
		reverseNumber(number);
		sc.close();
	}
}