package com.demo.basic;

import java.util.Scanner;

public class AmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int result = 0;
		int digit;
		String numString = String.valueOf(num);
		int len = numString.length();
		while (num > 0) {
			digit = num % 10;
			result = result + (int) Math.pow(digit, len);
			num = num / 10;
		}
		if (temp == result) {
			System.out.println("Amstrong Number");
		} else {
			System.out.println("Not a Amstrong");
		}
		sc.close();
	}
}