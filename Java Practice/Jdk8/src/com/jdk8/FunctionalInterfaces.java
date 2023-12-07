package com.jdk8;

import java.util.*;
import java.util.function.*;

public class FunctionalInterfaces {
	public static void main(String args[])
	{

		List<String> names = Arrays.asList(
			"Jayanth", "Durga", "Rajaram", "Abhilash");
        
		Predicate<String> p = (s) -> s.startsWith("R");
		BiPredicate<String, String> p1 = (s1, s2) -> {
			if(s1.startsWith("R")) {
				return true;
			}
			else if(s2.endsWith("h")) {
				return true;
			}
			return false;
		};
		
		

		for (String st : names) {
			// call the test method
			if (p.test(st))
				System.out.println(st);
			if (p1.test(st,st))
				System.out.println(st);
		}
	}
}
