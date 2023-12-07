package com.demo.basic;

import java.util.Scanner;

public class PalindromeInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int copynum = num;
		int digit, result = 0;
		while (num > 0) {
			digit = num % 10;
			result = (result * 10) + digit;
			num = num / 10;
		}
		if (copynum == result) {
			System.out.println(copynum + " is Palindrome");
		} else {
			System.out.println(copynum + " is not Palindrome");
		}
		sc.close();
	}
}