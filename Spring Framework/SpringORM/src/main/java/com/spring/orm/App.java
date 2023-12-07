package com.spring.orm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
public static void main(String []args)
	{        
        ApplicationContext context = new ClassPathXmlApplicationContext("orm.xml");
        StudentDAO studentDAO = context.getBean("studentDA", StudentDAO.class);
        Student student = new Student(1088,"Rajaram","Miyapur");
        System.out.println("------- CREATE  ----------");
        int id = studentDAO.insert(student);
        System.out.println("Data Inserted :" +id);
        
        
//        System.out.println("------ READ ---------------");
//        student = studentDAO.getStudent(1088);
//        System.out.println(student);
//        
//        
//        System.out.println("------ UPDATE ---------------");
//        student = new Student(1088,"Rajaram","Miryalaguda");
//        studentDAO.update(student);
//        student = studentDAO.getStudent(1088);
//        System.out.println(student);
//        
//        
//        System.out.println("------ DELETE ---------------");
//        studentDAO.delete(124);
//        
//        
//        System.out.println("--------- SHOW ALL RECORD -----------");
//        List<Student> students = studentDAO.getAllStudent();
//        for(Student s : students) {
//        	System.out.println(s);
//        }
    }
}
