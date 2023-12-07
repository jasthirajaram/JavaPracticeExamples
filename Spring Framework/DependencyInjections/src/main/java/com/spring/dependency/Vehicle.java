package com.spring.dependency;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Vehicle {
	//Engine engine;
	Fortuner fortuner;
    Tyres tyre;

    public Tyres getTyre()
    {
        return tyre;
    }

    public void setTyre(Tyres tyre)
    {
        System.out.println("tyre instantiated using setter");
        this.tyre = tyre;
    }

    public Vehicle(Fortuner fortuner, Tyres tyre)
    {
        System.out.println("instantiated using constructor");
        this.fortuner = fortuner;
        this.tyre = tyre;
    }

    public Vehicle() {
    	
    }
    
    public Fortuner getfoFortuner()
    {

        return fortuner;
    }
    public void setfortuner(Fortuner fortuner)
    {
        System.out.println("instantiated using setter");
        this.fortuner = fortuner;
    }

    @Override
    public String toString()
    {
        return fortuner + " " + tyre;
    }

   
}