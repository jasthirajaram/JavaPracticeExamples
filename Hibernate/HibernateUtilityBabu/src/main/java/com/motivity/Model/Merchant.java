package com.motivity.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Merchant {
	@Id
	@GeneratedValue
	private int Mid;
	private String Mname;
	private String address;
	public int getMid() {
		return Mid;
	}
	public void setMid(int mid) {
		Mid = mid;
	}
	public String getMname() {
		return Mname;
	}
	public void setMname(String mname) {
		Mname = mname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Merchant(int mid, String mname, String address) {
		super();
		Mid = mid;
		Mname = mname;
		this.address = address;
	}
	
	public Merchant() {
		super();
	}
	@Override
	public String toString() {
		return "Merchant [Mid=" + Mid + ", Mname=" + Mname + ", address=" + address + "]";
	}
	
}
