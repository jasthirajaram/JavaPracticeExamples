package com.motivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.motivity.model.Person;



public class App 
{
    public static void main( String[] args )
    {
    	StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml").build();
		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
		SessionFactory factory = metadata.buildSessionFactory();
		Session session = factory.openSession();
		
		Person person = session.load(Person.class, 1);
		System.out.println(person);
		session.close();
		
		Session session2 = factory.openSession();
		Person person2 = session2.load(Person.class, 1);
		System.out.println(person2);
		session.close();
		
        
   
        
    }
}
