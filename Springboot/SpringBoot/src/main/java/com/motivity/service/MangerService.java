package com.motivity.service;

import java.util.List;
import java.util.Optional;

import com.motivity.entity.Manager;
import com.motivity.entity.Student;

public interface MangerService 
{
	public Manager saveManager(Manager m);
	Manager findByFname(String fname);
	List<Manager> findByFnameAndLname(String fname,String lname);
	List<Manager> findByAgeGreaterThan(int age);
	List<Manager> findByAgeEquals(int age);
	List<Manager> findByempcode(String empcode);
	List<Manager> findByempcodeStartsWith(String empcode);
	List<Manager> findByempcodeEndsWith(String empcode);
	List<Manager> findByempcodeEquals(String empcode);
	List<Manager> findByempcodeIsNot(String empcode);
	List<Manager> findBysalBetween(double sal1,double sal2);
	List<Manager> findByfullNameLike(String fullName);
	List<Manager> findByempcodeContains(String empcode);
	List<Manager> findByempcodeNotContains(String empcode);
	List<Manager> findByAgeGreaterThanEqual(int age);
	public Optional<Manager> getById(int id);










}
