package com.listiterator.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		al.add("balakrishna");
		al.add("harikrishna");
		al.add("chiru");
		al.add("venky");
		System.out.println("The elements in the list are: " + al);
		ListIterator<String> ltr = al.listIterator();
		while (ltr.hasNext()) {
			String s = (String) ltr.next();
			if (s.equals("venky")) {
				ltr.remove();
			} else if (s.equals("harikrishna")) {
				ltr.set("NTR");
			} else if (s.equals("chiru")) {
				ltr.add("charan");
			}
		}
		System.out.println(al);
	}
}
