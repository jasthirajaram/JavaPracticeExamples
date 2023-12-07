package com.motivity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.motivity.Dao.Vehicle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        Vehicle obj = (Vehicle) context.getBean("vehicle");
        obj.drive();
    }
}