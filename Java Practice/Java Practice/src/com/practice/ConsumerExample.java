package com.practice;

import java.util.function.BiConsumer;

public class ConsumerExample {
	public void sum(int a, int b) {
		System.out.println(a+b);
	}
	public static void main(String args[]) {
	ConsumerExample ce = new ConsumerExample();
	BiConsumer <Integer, Integer> consumer1 = ce::sum;
	consumer1.accept(2, 2);
	}
}