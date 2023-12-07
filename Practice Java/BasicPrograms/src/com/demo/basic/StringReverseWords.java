package com.demo.basic;

import java.util.Scanner;

public class StringReverseWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		String temp = "";
		String arr[] = str.split(" ");
		for (int i = arr.length - 1; i >= 0; i--) {
			temp = temp + arr[i] + " ";
		}
		System.out.println(temp);
		sc.close();
	}
}