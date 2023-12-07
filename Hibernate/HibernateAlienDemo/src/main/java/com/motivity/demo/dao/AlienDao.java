package com.motivity.demo.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.motivity.demo.Entity.Alien;
import com.motivity.demo.Entity.AlienName;
import com.motivity.demo.utility.HibernateUtility;

public class AlienDao {
	public void saveAlien() {
		Session session = HibernateUtility.getSession();
		AlienName aName = new AlienName();
		aName.setfName("Nommo");
		aName.setlName("African");
		aName.setmName("alien");
		Alien alien = new Alien(1, aName, "Mars", "Golden Yellow");
		Transaction transaction = session.beginTransaction();
		Alien load = session.load(Alien.class, 1);
		System.out.println(load);
		transaction.commit();
		session.close();
	}
}
