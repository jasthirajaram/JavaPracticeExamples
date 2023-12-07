package com.singleton.test;

import com.singleton.model.SingletonModel;

public class SingletonTest {
	public static void main(String[] args) {
		SingletonModel obj1 = SingletonModel.getInstance();
		SingletonModel obj2 = SingletonModel.getInstance();

		System.out.println("The hashcode of obj1 is: " + obj1.hashCode());
		System.out.println("The hashcode of obj2 is: " + obj2.hashCode());
		System.out.println(obj1.hashCode() == obj2.hashCode());
		System.out.println(obj1.equals(obj2));
	}
}