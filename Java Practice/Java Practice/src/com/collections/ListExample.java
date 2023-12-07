package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>();
		values.add(45);
		values.add(1244);
		values.add(745);
		values.add(450);
		values.add(965);
		values.add(4554);
//		values.add("Rajaram");
//		values.add('C');
//		values.add(20.4);t
		//Collections.sort(values);
		// Printing values using iterator
		
		Comparator<Integer> comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				if(o1 > o2)
				return 1;
				else
					return -1;
			}
		};
		Collections.sort(values, comparator);
		for(int i : values) {
			System.out.println(i);
		}
		values.forEach(System.out :: println);
//	    Iterator i = values.iterator();
//	   
//	    while(i.hasNext())
//	    {
//	    	System.out.println(i.next());
//	    }
//	    System.out.println("*******************************************************");
//	    Collections.reverse(values);
//	    // Printing values using enhanced for loop
//	    for(int o: values) {
//	    	System.out.println(o);
//	    }
	}
}
