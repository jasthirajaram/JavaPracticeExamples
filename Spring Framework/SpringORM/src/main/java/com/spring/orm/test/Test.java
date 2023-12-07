package com.spring.orm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.Student;
import com.spring.orm.StudentDAO;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("orm.xml");
		StudentDAO dao = context.getBean("studentDAO", StudentDAO.class);
		Student student = new Student(1088, "Rajaram", "Miyapur");
		int id = dao.insert(student);
        System.out.println("Data Inserted :" +id);
	}
}
