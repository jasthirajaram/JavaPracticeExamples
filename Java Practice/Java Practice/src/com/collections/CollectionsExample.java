//Adding values into collection and printing them using iterator and enhanced for loop

package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionsExample {
	public static void main(String[] args) {
		Collection values = new ArrayList();
		values.add(45);
		values.add(1244);
		values.add(745);
		values.add("Rajaram");
		values.add('C');
		values.add(20.4);
		
		// Printing values using iterator
	    Iterator i = values.iterator();
	    
	    while(i.hasNext())
	    {
	    	System.out.println(i.next());
	    }
	    
	    // Printing values using enhanced for loop
	    for(Object o: values) {
	    	System.out.println(o);
	    }
	}
}
