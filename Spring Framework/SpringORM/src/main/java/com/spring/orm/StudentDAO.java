package com.spring.orm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
public class StudentDAO {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public int insert(Student student) {
		hibernateTemplate.save(student);
		return 1;
	}
	
	public void update(Student student) {
		hibernateTemplate.update(student);
    }
	
	public Student getStudent(int rollNumber) {
		Student student = (Student) hibernateTemplate.get(Student.class, rollNumber);
		return student;
	}
	
	public void delete(int rollNumber) {
		hibernateTemplate.delete(getStudent(rollNumber));
	}

	public List<Student> getAllStudent(){
		return (List<Student>) hibernateTemplate.find("from Student");
	}
	
}