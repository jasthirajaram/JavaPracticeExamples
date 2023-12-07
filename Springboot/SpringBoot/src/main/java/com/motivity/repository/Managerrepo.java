package com.motivity.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.motivity.entity.Manager;

@Repository
public interface Managerrepo extends JpaRepository<Manager, Integer>
{
	Optional<Manager> findByFname(String fname);
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
}
