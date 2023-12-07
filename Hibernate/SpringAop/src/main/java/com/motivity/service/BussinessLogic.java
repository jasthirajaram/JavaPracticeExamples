
//1) write a class BussinessLogic which has logicOne(),logicTwo(),logicThree(),logicFour(),logicFive() methods. methods.
//   By using AspectJ without changing this BussinessLogic class while calling these methods from main() 
//		the following tasks has to be performed
//    i)"before logicOne method' has to be printed before logicOne()
//    ii)"after logicTwo method" has to be printed after logicTwo()
//    iii)"before and after logicThree method" has to be printed before and after logicThree()
//    iV)"after logicThree method returned" has to be printed after logicFour() returned
//    V)"before and after logicThree method" has to be printed logicFive() throws exception
package com.motivity.service;

public class BussinessLogic
{
	public void logicOne() {
		System.out.println("Great Logic 1 completed");
	}
	public void logicTwo() {
		System.out.println("Great Logic 2 completed");
	}
	public void logicThree() {
		System.out.println("Great Logic 3 completed");
	}
	public void logicFour() {
		System.out.println("Great Logic 4 completed");
	}
	public void logicFive() {
		System.out.println("Great Logic 5 completed");
	}
}
