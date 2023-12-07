package com.demo.basic;

import java.util.Scanner;

public class RemoveWhiteSpacesInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		str = str.replace(" ", "");
		System.out.println(str);
		sc.close();
	}
}