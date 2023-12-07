package com.motivity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.motivity.service.BussinessLogic;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Config.xml");
        BussinessLogic bussinessLogic = applicationContext.getBean("business",BussinessLogic.class);
        bussinessLogic.logicOne();
        bussinessLogic.logicTwo();
        bussinessLogic.logicThree();
        bussinessLogic.logicFour();
        bussinessLogic.logicFive();
    }
}
