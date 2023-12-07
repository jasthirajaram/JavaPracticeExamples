package com.motivity.jpaxml.entity;

public class JavaCeo
{
	private int ceoID;
	private String ceoName;
	private String ceoDept;
	public int getCeoID() {
		return ceoID;
	}
	public void setCeoID(int ceoID) {
		this.ceoID = ceoID;
	}
	public String getCeoName() {
		return ceoName;
	}
	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}
	public String getCeoDept() {
		return ceoDept;
	}
	public void setCeoDept(String ceoDept) {
		this.ceoDept = ceoDept;
	}
	@Override
	public String toString() {
		return "JavaCeo [ceoID=" + ceoID + ", ceoName=" + ceoName + ", ceoDept=" + ceoDept + "]";
	}
	
	
}
