package com.motivity.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtility {
	public static Session getSession() {
		StandardServiceRegistry sRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata metadata = new MetadataSources(sRegistry).getMetadataBuilder().build();
		SessionFactory factory = metadata.buildSessionFactory();
		Session session = factory.openSession();
		return session;
	}
}
