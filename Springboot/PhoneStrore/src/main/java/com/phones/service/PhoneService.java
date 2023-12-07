package com.phones.service;

import java.util.List;

import com.phones.model.Phones;

public interface PhoneService {
	
	Phones savePhone(Phones phone);
	
	List<Phones> getAllPhones();

	Phones updatePhone(Phones phone);
	
	public void deletePhone(int id);
}