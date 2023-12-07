package com.motivity.jpaxml.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceUtility 
{
	public static EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JavaCeo");
		EntityManager manager = factory.createEntityManager();
		return manager;
	}
}
