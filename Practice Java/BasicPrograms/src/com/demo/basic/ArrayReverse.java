package com.demo.basic;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int arr[] = new int[5];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//
//		for (int i = arr.length - 1; i >= 0; i--) {
//			System.out.println(arr[i]);
//		}

		int arr[] = { 10, 15, 14, 12, 5 };
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			int temp = arr[len - 1];
			arr[len - 1] = arr[i];
			arr[i] = temp;
			len--;
		}

		System.out.println(Arrays.toString(arr));
		// sc.close();
	}
}