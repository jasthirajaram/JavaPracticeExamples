package com.motivity.manytomany;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import java.util.List;

@Entity
public class Items {
	@Id
	@GeneratedValue
	private int itemId;
	private String itemName;
	private String itemBrand;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Customer> cus;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemBrand() {
		return itemBrand;
	}

	public void setItemBrand(String itemBrand) {
		this.itemBrand = itemBrand;
	}

	public List<Customer> getCus() {
		return cus;
	}

	public void setCus(List<Customer> cus) {
		this.cus = cus;
	}

	@Override
	public String toString() {
		return "Items [itemId=" + itemId + ", itemName=" + itemName + ", itemBrand=" + itemBrand + ", cus=" + cus + "]";
	}
	
	
	
	
}
