package com.motivity.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.motivity.entity.Student;

@Service
public interface StudentService {
	Student addStudent(Student student);
	Student getStudent(int studentId);
}
