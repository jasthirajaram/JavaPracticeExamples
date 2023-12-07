package com.motivity.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.motivity.Model.Merchant;
import com.motivity.utility.HibernateUtils;

public class MerchantTest {
	public void saveMerchant() {
		Merchant merchant = new Merchant();
		merchant.setMname("Abhilash");
		merchant.setAddress("KpHB");
		Session session = HibernateUtils.getSession();
		Transaction tran = session.beginTransaction();
		session.save(merchant);
		tran.commit();
		session.close();
	}
	
	public void updateMerchant() {
		Merchant merchant = new Merchant();
		merchant.setMid(8);
		merchant.setAddress("Warangal");
		Session session = HibernateUtils.getSession();
		Transaction tran = session.beginTransaction();
		session.update(merchant);
		tran.commit();
		session.close();
	}
	public void deleteMerchant() 
	{
		Merchant merchant = new Merchant();
		merchant.setMid(2);
		Session session = HibernateUtils.getSession();
		Transaction tran = session.beginTransaction();
		session.delete(merchant);
		tran.commit();
		session.close();
	}
	public void saveOrUpdateMerchant() {
		Merchant merchant = new Merchant();
		//merchant.setMid(6);
		merchant.setMname("Ballanki");
		Session session = HibernateUtils.getSession();
		Transaction tran = session.beginTransaction();
		session.saveOrUpdate(merchant);
		tran.commit();
		session.close();
	}
	public void mergeMerchant() {
		Merchant merchant = new Merchant();
		merchant.setMid(2);
		Session session = HibernateUtils.getSession();
		Transaction transaction=session.beginTransaction();
        session.evict(merchant);
        merchant.setMname("Abhi");
        merchant.setAddress("Hyderabad");
        session.merge(merchant);
        transaction.commit();
	}
	public void getMerchant() {
		int merch_id;
		Merchant merchant;
		Session session = HibernateUtils.getSession();
		merch_id=2;
		merchant = session.get(Merchant.class, merch_id);
		if(merchant!=null) {
			System.out.println(merchant);
		}
		else {
			System.out.println("Not success");
		}
		session.close();
	}
}
