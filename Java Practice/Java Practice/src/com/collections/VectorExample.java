package com.collections;

import java.util.Vector;

import javax.xml.validation.Validator;
//Vector: follows dynamic array, its initial size is 10 and later on it will be increases by 100%
public class VectorExample {
	public static void main(String[] args) {
		Vector<Integer> values = new Vector<>();
		values.add(10);
		values.add(50);
		values.add(24);
		values.add(75);
		values.add(48);
		values.add(54);
		values.add(74);
		values.add(49); 
		values.add(69);
		values.add(21);
		// the initial size of the vector is 10
		System.out.println("The capacity of the vector is "+values.capacity());
		values.add(58);
		// after adding 11th element the size of the vector is double the size of initial size
		System.out.println("The capacity of the vector is "+values.capacity());
		values.forEach(System.out :: println);

	}
}
