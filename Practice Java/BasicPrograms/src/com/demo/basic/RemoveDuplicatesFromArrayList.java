package com.demo.basic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicatesFromArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(5);
		al.add(4);
		al.add(5);
		al.add(4);
		al.add(1);
		al.add(2);
		HashSet<Integer> set = new HashSet<>(al);
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			Integer type = (Integer) itr.next();
			if (type % 2 == 0) {
				System.out.println(type);
			} else
				itr.remove();
		}
	}
}