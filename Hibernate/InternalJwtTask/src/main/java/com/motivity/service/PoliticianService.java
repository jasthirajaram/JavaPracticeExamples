package com.motivity.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.motivity.exception.PoliticianNotFound;
import com.motivity.model.Politician;
import com.motivity.repository.PoliticianRepository;

@Service
public class PoliticianService {

	@Autowired
	private PoliticianRepository repository;
	
	public Politician savePolitician(Politician politician) {
		return repository.save(politician);
	}
	
	public Politician getPolitician(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public Politician updatePolitician(int id,Politician politician) {
		Optional<Politician> politician2 = repository.findById(id);
		if(politician2.isPresent()) {
			Politician politician3 = politician2.get();
			politician3.setName(politician.getName());
			politician3.setPartyName(politician.getPartyName());
			return repository.save(politician3);
		}
		else {
			throw new PoliticianNotFound("Politician is not found");
		}
	}
}
