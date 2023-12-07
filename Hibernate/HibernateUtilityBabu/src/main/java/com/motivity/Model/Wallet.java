package com.motivity.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Wallet {
	@Id
	@GeneratedValue
	private int wID;
	private int amount;
	
//	@OneToOne
//	@JoinColumn(name="fk_customerID")
//	private Customer customer;

	public int getwID() {
		return wID;
	}

	public void setwID(int wID) {
		this.wID = wID;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

//	public Customer getCustomer() {
//		return customer;
//	}
//
//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}

//	@Override
//	public String toString() {
//		return "Wallet [wID=" + wID + ", amount=" + amount + ", customer=" + customer + "]";
//	}

//	public Wallet(int wID, int amount, Customer customer) {
//		super();
//		this.wID = wID;
//		this.amount = amount;
//		this.customer = customer;
//	}

	public Wallet() {
		super();
	}
	
	
}
