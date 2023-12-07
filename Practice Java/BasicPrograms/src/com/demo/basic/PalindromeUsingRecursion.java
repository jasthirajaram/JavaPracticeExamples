package com.demo.basic;

import java.util.Scanner;

public class PalindromeUsingRecursion {
	public static boolean isPalindrome(String input) {
		if(input.length() == 0 || input.length() == 1) {
			return true;
		}
		if(input.charAt(0) == input.charAt(input.length()-1)) {
			return isPalindrome(input.substring(1, input.length()-1));
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		if(isPalindrome(str)) {
			System.out.println("Entered Strng is a Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
		sc.close();
	}
}