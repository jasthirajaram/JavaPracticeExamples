package com.stream.student;

import java.util.ArrayList;
import java.util.List;

public class StudentFilter {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
//		list.add(null)
//		int a = 1;
//		int b = a++;
//		int c = b++;
//		System.out.println(b);
//		System.out.println(c);

		list.add(new Student(10, "Rajaram", 65.00));
		list.add(new Student(11, "Abhilash", 85.96));
		list.add(new Student(12, "Goutham", 99.90));
		list.add(new Student(13, "Srivani", 100.00));
		list.stream().filter((m) -> m.getRollno() > 10).forEach(System.out::println);
		list.stream().filter(l -> l.getName().contentEquals("Srivani")).distinct().forEach(System.out::println);
		

	}
}