package com.jdk8;

public interface SomeInterface {
	
		default void show() {
			System.out.println("All cars can run");
		}
		public static void start() {
			System.out.println("All cars can start");
		}
	}

