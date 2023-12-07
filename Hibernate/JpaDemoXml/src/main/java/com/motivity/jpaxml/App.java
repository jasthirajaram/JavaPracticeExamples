package com.motivity.jpaxml;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.motivity.jpaxml.entity.JavaCeo;
import com.motivity.jpaxml.utility.PersistenceUtility;

public class App 
{
	 public static void saveEntity() {
   	  EntityManager entityManager = PersistenceUtility.getEntityManager();
	  EntityTransaction transaction = entityManager.getTransaction();
	try {
		transaction.begin();
   	  JavaCeo ceo = new JavaCeo();
  	  ceo.setCeoID(503);
   	  ceo.setCeoName("Krishna prasad");
   	  ceo.setCeoDept(".NET Full stack");
   	  entityManager.persist(ceo);
   	  transaction.commit();
   	  
     }catch(Exception exception){
    	 transaction.rollback();
    	  exception.printStackTrace();
    	 System.out.println("Roll back applied");
     }
	 }
	 public static void findEntity() {
		 EntityManager entityManager = PersistenceUtility.getEntityManager();
		// EntityTransaction transaction = entityManager.getTransaction();
		 
			 JavaCeo ceo = entityManager.find(JavaCeo.class, 501);
			 System.out.println(ceo);
			 
		 
	 }
	 public static void updateEntity() {
		 EntityManager entityManager = PersistenceUtility.getEntityManager();
		 EntityTransaction transaction = entityManager.getTransaction();
		 try {
			 transaction.begin();
			 JavaCeo ceo = entityManager.find(JavaCeo.class, 503);
			 ceo.setCeoName("Sandeep");
			 transaction.commit();
			 
		 }catch(Exception e) {
			 transaction.rollback();
		 }
	 }
	 public static void deleteEntity() {
		 EntityManager entityManager = PersistenceUtility.getEntityManager();
		 EntityTransaction transaction = entityManager.getTransaction();
		 try {
			 transaction.begin();
			 JavaCeo javaCeo = entityManager.find(JavaCeo.class, 502);
			  entityManager.remove(javaCeo);
			  transaction.commit();
			
		 }catch(Exception e ) {
			 transaction.rollback();
			 e.printStackTrace();
		 }
	 }
    public static void main( String[] args )
    {
//    	saveEntity();
//    	findEntity();
//    	updateEntity();
    	deleteEntity();
    }
}
