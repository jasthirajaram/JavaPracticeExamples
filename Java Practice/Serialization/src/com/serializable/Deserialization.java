package com.serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
	public static void main(String[] args) {
		Employee empObj = null;
		try {
			FileInputStream fileIn = new FileInputStream("D:\\Info.txt");
			ObjectInputStream inputObj = new ObjectInputStream(fileIn);
			empObj = (Employee) inputObj.readObject();
			inputObj.close();
			fileIn.close();
		}
		catch(Exception e) {
			System.out.println("Throws an exception");
		}
		finally {
			System.out.println("Deserializind employee");
			System.out.println(empObj.getName());
			System.out.println(empObj.getDate());
			System.out.println(empObj.getDepartment());
			System.out.println(empObj.getDesignation());
			System.out.println(empObj.getSalary());
		}
	}
}
