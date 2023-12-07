package com.motivity.Model;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Order {
	@Id
	//@GeneratedValue
	private int orderId;
	private int orderAmount;
	private int orderTrackingId;
	
	@ManyToOne
	@JoinColumn(name="CustomerId")
	private Customer customers;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}

	public int getOrderTrackingId() {
		return orderTrackingId;
	}

	public void setOrderTrackingId(int orderTrackingId) {
		this.orderTrackingId = orderTrackingId;
	}

	public Customer getCustomer() {
		return customers;
	}

	public void setCustomer(Customer customers) {
		this.customers = customers;
	}

	
	
	
}
