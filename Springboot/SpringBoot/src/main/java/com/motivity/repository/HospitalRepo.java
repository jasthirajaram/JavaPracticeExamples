package com.motivity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.motivity.entity.Hospital;

public interface HospitalRepo extends JpaRepository<Hospital,Integer>
{
	public List<Hospital> findByFnameAndLname(String fname,String lname);
	public List<Hospital> findByFnameOrLname(String fname,String lname);
//	public List<Hospital> findByAgeLessThan(int l1,int l2);
//	public List<Hospital> LessThan(int o1, int o2);
	public List<Hospital> getByFname(String fname);
}