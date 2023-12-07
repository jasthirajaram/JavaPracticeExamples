package com.otp.demo.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.otp.demo.entity.Student;
import com.otp.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student createStudent(Student student) {
		student.setId(UUID.randomUUID().toString());
		if(phoneAlreadyExist(student)) {
			throw new RuntimeException("Phone number already exist");
		}
		Student savedStudent = studentRepository.save(student);
		return savedStudent;
	}

	@Override
	public Student findById(String id) {
		Student student = studentRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Student not found"));
		return student;
	}
	
	@Override
	public Student findByPhone(String phone) {
		Student student = studentRepository.findByPhone(phone)
				.orElseThrow(() -> new RuntimeException("Student not found"));
		return student;
	}

	private boolean phoneAlreadyExist(Student student) {
		return studentRepository.findByPhone(student.getPhone()).isPresent();
	}
}
