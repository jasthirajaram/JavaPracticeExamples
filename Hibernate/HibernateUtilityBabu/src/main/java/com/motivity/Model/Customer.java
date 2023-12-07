package com.motivity.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Customer {
	@Id
	//@GeneratedValue
	private int cId;
	private String cName;
	private String cEmail;
	private String cPhone;
	
//	@OneToOne(mappedBy = "customer",cascade = CascadeType.ALL)
//	private Wallet wallet;

	@OneToMany(mappedBy = "customers",cascade = CascadeType.ALL)
	private List<Order> orders;
	
	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcEmail() {
		return cEmail;
	}

	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}

	public String getcPhone() {
		return cPhone;
	}

	public void setcPhone(String cPhone) {
		this.cPhone = cPhone;
	}

//	public Wallet getWallet() {
//		return wallet;
//	}
//
//	public void setWallet(Wallet wallet) {
//		this.wallet = wallet;
//	}

	public Customer() {
		super();
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	
	
	
}
