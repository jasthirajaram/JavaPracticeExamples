package com.hashset.demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add("A");
		h.add("Z");
		h.add("C");
		h.add(null);
		h.add(20);
		h.add("B");
//		h.add("C");
		System.out.println(h.add("C"));
		System.out.println(h);
	}
}