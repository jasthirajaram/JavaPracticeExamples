package com.sortedset.demo;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
	public static void main(String[] args) {
		SortedSet set = new TreeSet();
		set.add("Z");
		set.add("A");
		set.add("C");
//		set.add(25);
//		set.add(null);
		System.out.println(set);
	}
}