package com.demo.basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayToMap {
	public static void main(String[] args) {
		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		
		System.out.println(Arrays.toString(arr));

		int count = 1;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			map.put(count++, arr[i]);
		}
		System.out.println(map);
	}
}