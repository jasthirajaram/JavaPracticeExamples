package com.enumeration.demo;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.add(2);
		v.add(5);
		v.add(7);
		v.add(6);
		System.out.println(v);
		Enumeration<Integer> e = v.elements();
		while (e.hasMoreElements()) {
			Integer integer = (Integer) e.nextElement();
			if (integer % 2 == 0)
				//Printing elements one by one by the condition
				System.out.println(integer);
		}
		//Printing all elements in theVector
		System.out.println(v);
	}
}
