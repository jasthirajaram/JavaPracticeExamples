package com.motivity.manytomany;

import java.util.Arrays;
import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtils {

	public static Session getSession() {
		StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml").build();
		Metadata metadata = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
		Session session = sessionFactory.openSession();
		return session;

	}

	public static void main(String[] args) {

		Session s = HibernateUtils.getSession();
		Customer c = new Customer();
		Customer c1 = new Customer();
		Customer c2 = new Customer();

		c.setCustEmail("sri@gmai.com");

		c.setCustId(25);
		c.setCustName("srinija");

		c1.setCustEmail("raj@gmai.com");

		c1.setCustId(26);
		c1.setCustName("rajaram");

		c.setCustEmail("medical@gmai.com");

		c.setCustId(27);
		c.setCustName("goutham");

	    List<Customer> list = Arrays.asList(c,c1,c2);
	    for (Customer customer : list) {
			s.save(customer);
		}
	    
	    Items i = new Items();
	    Items i1 = new Items();
	    Items i2 = new Items();
	    
	    i.setItemBrand("Nokia");
	    i.setItemId(12);
	    i.setItemName("Phone");
	    i.setCus(list);
	    
	    i1.setItemBrand("Samsung");
	    i1.setItemId(13);
	    i1.setItemName("Phone");
	    i1.setCus(list);
	    
	    i2.setItemBrand("Apple");
	    i2.setItemId(14);
	    i2.setItemName("Phone");
	    i2.setCus(list);
	    
	    List<Items> list1 = Arrays.asList(i,i1,i2);
	    for (Items item : list1) {
			s.save(item);
		}
	    org.hibernate.Transaction t = s.beginTransaction();
	    t.commit();
}
}
