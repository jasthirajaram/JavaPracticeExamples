package com.motivity.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Alien_Details")
public class Alien {
	@Id
	private int alienId;
	private AlienName alienName;
	private String alienAddress;
	private String alienColor;
	public int getAlienId() {
		return alienId;
	}
	public void setAlienId(int alienId) {
		this.alienId = alienId;
	}
	
	public AlienName getAlienName() {
		return alienName;
	}
	public void setAlienName(AlienName alienName) {
		this.alienName = alienName;
	}
	public String getAlienAddress() {
		return alienAddress;
	}
	public void setAlienAddress(String alienAddress) {
		this.alienAddress = alienAddress;
	}
	public String getAlienColor() {
		return alienColor;
	}
	public void setAlienColor(String alienColor) {
		this.alienColor = alienColor;
	}
	public Alien(int alienId, AlienName alienName, String alienAddress, String alienColor) {
		super();
		this.alienId = alienId;
		this.alienName = alienName;
		this.alienAddress = alienAddress;
		this.alienColor = alienColor;
	}
	
	
}
