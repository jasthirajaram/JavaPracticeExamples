package com.strings.demo;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		int copynum = number;
		int digit; int result = 0;
		int n = 0;
		
	
		while(number > 0) {
			digit = number%10;
			result = (int) (result + Math.pow(digit, n));
			number = number/10;
			n++;
		}
		if(copynum == result) {
			System.out.println("Amstrong Number");
		}
		else
		{
			System.out.println("Not an Amstrong Number");
		}
	}
}