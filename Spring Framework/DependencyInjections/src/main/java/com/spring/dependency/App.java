package com.spring.dependency;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	 public static void main(String a[])
	    {
	        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");
	        
	        //Resource res = new ClassPathResource("spring.xml");
	        BeanFactory bean =  new ClassPathXmlApplicationContext("spring.xml");

	        // Instantiating the obj1 using Constructor DI
	        Vehicle obj1 = (Vehicle)bean.getBean("InjectwithConstructor");

	        // Instantiating the obj1 using Setter DI
	        Vehicle obj2 = (Vehicle)appContext.getBean("InjectwithSetter");

	        System.out.println(obj1);
	        System.out.println(obj2);
	    }
}
