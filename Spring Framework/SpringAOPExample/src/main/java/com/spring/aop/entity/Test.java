package com.spring.aop.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args){  
        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");  
        BusinessLogic bl = (BusinessLogic) context.getBean("entity");  
        bl.logicOne();  
       // op.display(); 
	}
}
