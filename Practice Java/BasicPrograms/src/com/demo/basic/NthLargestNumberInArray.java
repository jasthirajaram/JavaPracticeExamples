package com.demo.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class NthLargestNumberInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements into the array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		for (Integer i : arr) {
			set.add(i);
		}
		List<Integer> list = new ArrayList<>(set);
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list.get(list.size() - 2));
	}
}