package com.motivity.model;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.motivity.utils.HibernateUtils;    

public class OneToOneMain {
	public static void main(String[] args) {
		Session session = HibernateUtils.getSession();
		Customer customer = new Customer();
		customer.setcId(1088);
		customer.setcName("Rajaram");
		customer.setEmail("rajaram@gmail.com");
		customer.setMobile(728804279);
		session.save(customer);
		
		Wallet wallet = new Wallet();
		wallet.setwId(100);
		wallet.setAmount(25000);
		//customer.setWallet(wallet);
		wallet.setCustomer(customer);
		session.save(wallet);
		Transaction transaction = session.beginTransaction();
		transaction.commit();
		session.close();
		System.out.println("Success");
	}
}
