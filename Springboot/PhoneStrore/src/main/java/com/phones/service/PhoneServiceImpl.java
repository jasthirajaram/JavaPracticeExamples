package com.phones.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phones.exceptions.EnterFullSpecificatiponException;
import com.phones.exceptions.IdNotFoundException;
import com.phones.model.Phones;
import com.phones.repository.PhoneRepository;

@Service
public class PhoneServiceImpl implements PhoneService {

	@Autowired
	PhoneRepository phoneRepository;

	//Method to save data
	@Override
	public Phones savePhone(Phones phone) {
		try {
			if (phone.getPhoneName().isEmpty() || phone.getProcessor().isEmpty() || phone.getRam() == 0
					|| phone.getPhoneId().isEmpty()) {
				throw new Exception();
			}
		} catch (Exception e) {
			throw new EnterFullSpecificatiponException();
		}
		return phoneRepository.save(phone);
	}

	//Method to get all data
	@Override
	public List<Phones> getAllPhones() {
		return phoneRepository.findAll();
	}

	//Method to update data
	@Override
	public Phones updatePhone(Phones phone) {
		try {
			if (phoneRepository.existsById(phone.getId()) == false) {
				throw new Exception();
			}
		} catch (Exception e) {
			throw new IdNotFoundException();
		}
		return phoneRepository.save(phone);
	}

	//Method to delete data
	@Override
	public void deletePhone(int id) {
		try {
			if(phoneRepository.existsById(id) == false) {
				throw new Exception();
			}
		} catch (Exception e) {
			throw new IdNotFoundException();
		}
		phoneRepository.deleteById(id);
	}
}