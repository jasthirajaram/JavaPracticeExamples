package com.strings.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ElementsRotationDemo {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		al.add(5);
		al.add(3);
		al.add(1);
		al.add(4);
		al.add(2);
		System.out.println(al);
		Collections.rotate(al, 3);
		System.out.println(al);
	}
}