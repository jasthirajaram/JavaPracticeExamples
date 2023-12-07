package com.linkedhashset.demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
	public static void main(String[] args) {
		Set lh = new LinkedHashSet<>();
		lh.add("C");
		lh.add("A");
		lh.add("Z");
		lh.add(null);
		lh.add(24);
		System.out.println(lh);
		
		//throws exception because integer cannot be casted to string
//		Iterator<String> itr = lh.iterator();
//		while(itr.hasNext()) {
//			String str = itr.next();
//			System.out.println(str);
//		}
	}
}
