package com.motivity.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Laptop {
	@Id
	@GeneratedValue
	private int laptopId;
	private int laptopChargerId;
	private String laptopName;
	
	@OneToOne
	private Employee employee;

	public int getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}

	public int getLaptopChargerId() {
		return laptopChargerId;
	}

	public void setLaptopChargerId(int laptopChargerId) {
		this.laptopChargerId = laptopChargerId;
	}

	public String getLaptopName() {
		return laptopName;
	}

	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", laptopChargerId=" + laptopChargerId + ", laptopName=" + laptopName
				+ "]";
	}

}
