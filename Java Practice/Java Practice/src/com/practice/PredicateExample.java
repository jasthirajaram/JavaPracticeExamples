package com.practice;

import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {
		Predicate <Integer> pre = a -> (a>100);
		System.out.println(pre.test(101));
	}
}
