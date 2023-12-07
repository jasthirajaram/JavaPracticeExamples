package com.motivity.service;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.motivity.Entity.Employee;
import com.motivity.utility.HibernateUtility;

public class ServiceImpl {
	public void saveEmployee() {
		Session session = HibernateUtility.getSession();
		Employee e1 = new Employee(6, "Kailash", "EA", "KPHB", 33000);
		Transaction transaction = session.beginTransaction();
		session.save(e1);
		transaction.commit();
		session.close();
	}
	
	public void groupedByOperation() {
		Session session = HibernateUtility.getSession();
		Criteria criteria = session.createCriteria(Employee.class);
		Object object = criteria.setProjection(Projections.min("EmpSalary")).uniqueResult();
		System.out.println("minimum salary is "+object);
		Object object2 = criteria.setProjection(Projections.max("EmpSalary")).uniqueResult();
		System.out.println("maximum salary is "+object2);
		Object object3 = criteria.setProjection(Projections.avg("EmpSalary")).uniqueResult();
		System.out.println("Average of salary is "+object3);
		Object object4 = criteria.setProjection(Projections.count("EmpSalary")).uniqueResult();
		System.out.println("count is "+object4);
	}
	
	public void orderByOperation() {
		Session session = HibernateUtility.getSession();
		Criteria criteria = session.createCriteria(Employee.class);
//		List<Employee> employees = criteria.add(Restrictions.gt("EmpSalary", 30000)).list();
//		System.out.println("Salary of people greater than 30000");
//		for(Employee employee:employees) {
//			System.out.println(employee);
//		}
		List<Employee> employees1 = criteria.add(Restrictions.lt("EmpSalary", 30000)).list();
		System.out.println("Salary of people lesser than 30000");
		for (Employee employee : employees1) {
			System.out.println(employee);
		}
		
	}
	public void orderByAscOrDesc() {
		Session session = HibernateUtility.getSession();
		Criteria criteria = session.createCriteria(Employee.class);
//		List<Employee> employees = criteria.addOrder(Order.asc("EmpName")).list();
		//List<Employee> employees = criteria.addOrder(Order.desc("EmpName")).list();
		//List<Employee> employees = criteria.addOrder(Order.desc("EmpSalary")).list();
		//List<Employee> employees = criteria.addOrder(Order.asc("EmpSalary")).list();
		//List<Employee> employees = criteria.addOrder(Order.asc("EmpDept")).list();
		//List<Employee> employees = criteria.addOrder(Order.asc("EmpId")).list();
		List<Employee> employees = criteria.addOrder(Order.desc("EmpId")).list();
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
}