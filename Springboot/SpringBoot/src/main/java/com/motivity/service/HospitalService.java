package com.motivity.service;

import java.util.List;

import com.motivity.entity.Hospital;

public interface HospitalService 
{
	 public Hospital save(Hospital hp);
	 public List<Hospital> findByFirstAndLastName(String fname,String lname);
	public List<Hospital> findByFnameOrLname(String fname,String lname);
	//public List<Hospital> findAgeBetween(int l1,int l2);
//	public List<Hospital> findByAgeLessThan(int o1,int o2);
	public List<Hospital> getByFname(String fname);

	

}
