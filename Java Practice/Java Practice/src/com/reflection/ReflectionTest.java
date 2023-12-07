package com.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("com.reflection.ReflectionExample");
		Object obj = c.newInstance();
		Field f = c.getDeclaredField("name");
		Method m = c.getDeclaredMethod("sampleMethod", null);
		f.setAccessible(true);
		m.setAccessible(true);
		f.set(obj, "Abhi");
		m.invoke(obj, null);
		String s = (String) f.get(obj);
		System.out.println(s);
	}
}
