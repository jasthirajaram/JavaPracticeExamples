package com.motivity.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.motivity.entity.Student;
import com.motivity.repository.Studentrepo;
import com.motivity.service.StudentService;

@Service
public class StudentserviceImpl implements StudentService 
{
	@Autowired
	private Studentrepo stdrepo;
//save
	@Override
	public Student saveStudent(Student std) {
		// TODO Auto-generated method stub
		return stdrepo.save(std);
	}
	
//getById
	@Override
	public Student getById(int id) {
		Optional<Student> std=stdrepo.findById(id);
		return std.get();
	}
	
//delete
	@Override
	public void deletebyid(int id)
	{
             stdrepo.deleteById(id);		
	}

	//custom method
	@Override
	public List<Student> findBysname(String sname) {
		// TODO Auto-generated method stub
		return stdrepo.findBysname(sname);
	}

	//getAll
	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return stdrepo.findAll();
	}

	//update 
	@Override
	public Student updateStudent(String sname,int id) {
		// TODO Auto-generated method stub
		Optional<Student> s=stdrepo.findById(id);
		Student s1=s.get();
		s1.setSname(sname);
		return stdrepo.save(s1);

	}

	@Override
	public boolean existsById(int id) {
		// TODO Auto-generated method stub
		return stdrepo.existsById(id);
	}

	@Override
	public boolean existsBysname(String sname) {
		// TODO Auto-generated method stub
		 return stdrepo.existsBysname(sname);	
	}
	
	

}

