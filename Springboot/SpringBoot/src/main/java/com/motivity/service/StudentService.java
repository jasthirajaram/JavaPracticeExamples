package com.motivity.service;

import java.util.List;
import java.util.Optional;

import com.motivity.entity.Student;


public interface StudentService 
{
	public Student saveStudent(Student std);
	public Student getById(int id);
	public void deletebyid(int id);
	public Student updateStudent(String sname,int id);
	
	List<Student> getAll();
	
	//custom methods
	List<Student> findBysname(String sname);
	
	boolean existsById(int id);
	
	boolean existsBysname(String sname);
	

	
	
	
	

}
