package com.motivity.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.motivity.entity.Manager;
import com.motivity.entity.Student;
import com.motivity.globalexception.UserNameNotAvailableException;
import com.motivity.repository.Managerrepo;
import com.motivity.service.MangerService;

@Service
public class ManagerServiceImpl implements MangerService 
{
	@Autowired
	private Managerrepo mrepo;

	@Override
	public Manager saveManager(Manager m) {
		// TODO Auto-generated method stub
		return mrepo.save(m);
	}

	@Override
	public List<Manager> findByFnameAndLname(String fname, String lname) {
		// TODO Auto-generated method stub
		return mrepo.findByFnameAndLname(fname, lname);
	}

	@Override
	public List<Manager> findByAgeGreaterThan(int age) {
		// TODO Auto-generated method stub
		return mrepo.findByAgeGreaterThan(age);
	}

	@Override
	public List<Manager> findByAgeEquals(int age) {
		// TODO Auto-generated method stub
		return mrepo.findByAgeEquals(age);
	}

	@Override
	public List<Manager> findByempcode(String empcode) {
		// TODO Auto-generated method stub
		return mrepo.findByempcode(empcode);
	}

	@Override
	public List<Manager> findByempcodeStartsWith(String empcode) {
		// TODO Auto-generated method stub
		return mrepo.findByempcodeStartsWith(empcode);
	}

	@Override
	public List<Manager> findByempcodeEndsWith(String empcode) {
		// TODO Auto-generated method stub
		return mrepo.findByempcodeEndsWith(empcode);
	}

	@Override
	public List<Manager> findByempcodeEquals(String empcode) {
		// TODO Auto-generated method stub
		return mrepo.findByempcodeEquals(empcode);
	}

	@Override
	public List<Manager> findByempcodeIsNot(String empcode) {
		// TODO Auto-generated method stub
		return mrepo.findByempcodeIsNot(empcode);
	}

	@Override
	public List<Manager> findBysalBetween(double sal1,double sal2) {
		// TODO Auto-generated method stub
		return mrepo.findBysalBetween(sal1,sal2);
	}

	@Override
	public List<Manager> findByfullNameLike(String fullName) {
		// TODO Auto-generated method stub
		return mrepo.findByfullNameLike(fullName);
	}

	@Override
	public List<Manager> findByempcodeContains(String empcode) {
		// TODO Auto-generated method stub
		return mrepo.findByempcodeContains(empcode);
	}

	@Override
	public List<Manager> findByempcodeNotContains(String empcode) {
		// TODO Auto-generated method stub
		return mrepo.findByempcodeNotContains(empcode);
	}

	@Override
	public List<Manager> findByAgeGreaterThanEqual(int age) {
		// TODO Auto-generated method stub
		return mrepo.findByAgeGreaterThanEqual(age);
	}

	@Override
	public Optional<Manager> getById(int id) {
		return mrepo.findById(id);
	}

	@Override
	public Manager findByFname(String fname) {
		// TODO Auto-generated method stub
		Optional<Manager> findByFname = mrepo.findByFname(fname);
		if(findByFname.isPresent()) {
			return findByFname.get();
		}
		else {
			throw new UserNameNotAvailableException();
		}
	}

	
	

}
