package com.serializable;

import java.lang.reflect.Method;

public class ReflectionApi {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("com.serializable.Student");
		c.getClass();
		Object obj = c.newInstance();
        Method m = c.getDeclaredMethod("stuDetails", null);
        m.setAccessible(true);
        m.invoke(obj, null);
	}
}