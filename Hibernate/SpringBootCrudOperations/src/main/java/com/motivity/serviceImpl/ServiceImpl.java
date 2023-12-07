package com.motivity.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.motivity.entity.Student;
import com.motivity.repository.StudentRepository;
import com.motivity.service.StudentService;

@Service
public class ServiceImpl implements StudentService {

	@Autowired
	private StudentRepository repository;

	@Override
	public Student addStudent(Student student) {
		Student student2 = repository.save(student);
		return student2;
	}

	@Override
	public Student getStudent(int studentId) {
		Optional<Student> student = repository.findById(studentId);
		return student.get();
	}

}
