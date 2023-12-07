package com.otp.demo.service;

import com.otp.demo.entity.Student;

public interface StudentService {
	public Student createStudent(Student student);
	
	public Student findById(String id);
	
	public Student findByPhone(String phone);
}
