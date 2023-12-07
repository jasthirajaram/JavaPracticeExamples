package com.demo.basic;

public class ReverseWordsInString {
	public static void main(String[] args) {
		String str = "Welcome to the world";
		String temp="";
		String arr[] = str.split(" ");
		for(int i = arr.length-1;i>=0;i--) {
			temp = temp+arr[i]+" ";
		}
		System.out.println(temp);
	}
}