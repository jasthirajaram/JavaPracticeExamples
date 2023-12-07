package com.practice;

import java.util.function.BiFunction;

public class FunctionExample {
	public static float sumOfNumbers(int a, float b) {
		return a + b;
	}
	public static void main(String[] args) {
		BiFunction <Integer, Float, Float> f = FunctionExample::sumOfNumbers;
		float result = f.apply(20, 20.02f);
		System.out.println(result);
	}
}
