package com.motivity.test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.motivity.model.Student;
import com.motivity.utils.HibernateUtils;

public class StudentTest {
	
	public void saveStudent() {
		
		Student s=new Student();
		
		//s.setSid();
		s.setRollno(515);
		s.setSname("Abhilash");
		
	Session session =  HibernateUtils.getSession();
	         session.save(s);
	 Transaction transaction = session.beginTransaction();
	 transaction.commit();
	}
	
	public void update()
	{
		Student s =new Student();
		s.setSid(2);
		s.setRollno(513);
		s.setSname("Rajaram");
		Session session = HibernateUtils.getSession();
		session.update(s);
		Transaction transaction = session.beginTransaction();
		transaction.commit();
	}
	public static void main(String[] args) {
		StudentTest st=new StudentTest();
		        st.saveStudent();
		        //st.update();
	}

}