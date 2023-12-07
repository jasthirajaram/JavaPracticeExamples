package com.motivity.demo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.motivity.demo.Entity.Laptop;
import com.motivity.demo.Entity.Student;
import com.motivity.demo.Utility.HibernateUtility;

public class App {
	public static void main(String[] args) {
//		Student student = new Student();
//		student.setRollNo(502);
//		student.setStudName("Akanksha");
//		student.setMarks(71);
//
//		Student student2 = new Student();
//		student2.setRollNo(503);
//		student2.setStudName("Akash");
//		student2.setMarks(70);
//		
//		List<Student> lStudents = new ArrayList<Student>();
//		lStudents.add(student);
//		lStudents.add(student2);
//
//		Laptop laptop = new Laptop();
//		laptop.setLaptopId(102);
//		laptop.setLaptopName("Dell i7");
//		laptop.setStudents(lStudents);
//
//		Laptop laptop2 = new Laptop();
//		laptop2.setLaptopId(103);
//		laptop2.setLaptopName("Apple MacBook");
//		laptop2.setStudents(lStudents);
//
//		List<Laptop> laptops = new ArrayList<Laptop>();
//		laptops.add(laptop);
//		laptops.add(laptop2);
//
//		student.setLaptop(laptops);
//		student2.setLaptop(laptops);
//		
//		Session session= HibernateUtility.getSession();
//		Transaction transaction = session.beginTransaction();
//		session.save(student);
//		session.save(student2);
//		transaction.commit();
//		session.close();
//		
		Session session= HibernateUtility.getSession();
		Transaction transaction = session.beginTransaction();
		Student student = session.get(Student.class, 502);
		System.out.println(student.getRollNo());
		System.out.println(student.getStudName());
		System.out.println(student.getLaptop());
		session.close();
		
		
		
		
	}
}
