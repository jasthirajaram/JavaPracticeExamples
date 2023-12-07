package com.motivity.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.motivity.entity.Hospital;
import com.motivity.repository.HospitalRepo;
import com.motivity.service.HospitalService;

@Service
public class HospitalServiceImpl implements HospitalService 
{
	@Autowired
	private HospitalRepo hp;

	@Override
	public Hospital save(Hospital hpp) {
		// TODO Auto-generated method stub
		
		return hp.save(hpp);
		
	}

	@Override
	public List<Hospital> findByFirstAndLastName(String fname, String lname) {
		// TODO Auto-generated method stub
		return hp.findByFnameAndLname(fname, lname);
	}

	@Override
	public List<Hospital> findByFnameOrLname(String fname, String lname) {
		// TODO Auto-generated method stub
		return hp.findByFnameOrLname(fname,lname);
	}

//	@Override
//	public List<Hospital> findAgeBetween(int l1, int l2) {
//		// TODO Auto-generated method stub
//		return hp.findAgeBetween(l1, l2);
//	}

//	@Override
//	public List<Hospital> findByAgeLessThan(int o1, int o2) {
//		// TODO Auto-generated method stub
//		return hp.LessThan(o1, o2);
//	}

	@Override
	public List<Hospital> getByFname(String fname) {
		// TODO Auto-generated method stub
		return hp.getByFname(fname);
	}

	
	
	

}
