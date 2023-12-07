package com.motivity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.motivity.entity.Employee;
import com.motivity.entity.Laptop;

public class App {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("UnitOne");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		Employee employee = new Employee();
		employee.setEmpName("Raja ram");
		employee.setEmpDept("EA");
		employee.setEmpAddress("Miyapur");
		employee.setSalary(25550);
		manager.persist(employee);
		
		Laptop laptop = new Laptop();
		laptop.setLaptopChargerId(1523);
		laptop.setLaptopName("HP core i3");
		laptop.setEmployee(employee);
		manager.persist(laptop);
		manager.getTransaction().commit();
		
	}
}
