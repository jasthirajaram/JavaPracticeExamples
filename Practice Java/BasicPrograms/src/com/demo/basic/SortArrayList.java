package com.demo.basic;

import java.util.ArrayList;
import java.util.Comparator;

public class SortArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(5);
		al.add(7);
		al.add(1);
		al.add(4);
		al.add(3);
		al.add(0);
	    System.out.println(al);
	    al.sort(Comparator.naturalOrder());
	    System.out.println(al);
	    
	    
	}
}