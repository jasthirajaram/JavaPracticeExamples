package com.motivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//import com.motivity.Entity.Student;
import com.motivity.Entity.StudentDetail;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       StudentDetail s1 = new StudentDetail(505, "Gaddam Anil Kumar", "KPHB", "guideware developer");
       StudentDetail s2 = new StudentDetail(504, "Akash", "Miyapur", "Fresher");
       Configuration configuration = new Configuration().configure().addAnnotatedClass(StudentDetail.class);
       SessionFactory factory = configuration.buildSessionFactory();
       Session session = factory.openSession();
       Transaction transaction = session.beginTransaction();
       session.update(s1);
      session.update(s2);
      transaction.commit();
       session.close();
       factory.close();
      
    }
}
