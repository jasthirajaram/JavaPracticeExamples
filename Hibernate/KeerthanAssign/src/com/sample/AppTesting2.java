package com.sample;

import java.util.Scanner;

public class AppTesting2 {
	public static void main(String[] args) {
		TestApp2.map.put("count_2k", null);
		TestApp2.map.put("count_5h", null);
		TestApp2.map.put("count_1h", null);
		TestApp2.map.put("count_50", null);
		TestApp2.map.put("count_10", null);
		TestApp2.map.put("count_5", null);
		TestApp2.map.put("count_2", null);
		TestApp2.map.put("count_1", null);
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		TestApp2.calculateNotes(TestApp2.map, amount);
		scanner.close();
	}
}
