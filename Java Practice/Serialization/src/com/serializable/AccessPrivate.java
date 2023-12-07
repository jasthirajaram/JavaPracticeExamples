package com.serializable;
import java.lang.reflect.Field;
public class AccessPrivate {
	

	public static void main(String[] args) throws Exception {
	DataClass obj = new DataClass();
	Class classObj = obj.getClass();
	Field privateField = classObj.getDeclaredField("data");
	privateField.setAccessible(true);

	String fieldValue = (String) privateField.get(obj);
	System.out.println("fieldValue = " + fieldValue);

	privateField.set(obj, "new value");

	fieldValue = (String) privateField.get(obj);
	System.out.println("fieldValue = " + fieldValue);
	}
	}

	class DataClass {
	private String data = "private data";
	}
