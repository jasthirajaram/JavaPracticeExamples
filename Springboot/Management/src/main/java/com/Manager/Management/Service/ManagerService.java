package com.Manager.Management.Service;

import java.util.List;

import com.Manager.Management.Entity.Manager;


public interface ManagerService {


	Manager saveEmp(Manager manager);
	
	List<Manager> getAll();
		
	public void delEmp(int manager);
	
	public Manager updateEmp(Manager manager, int empId );
	
	
	//**********************************************//
	List<Manager> findByFirstName(String firstName);
	
	List<Manager> findByFirstNameAndLastName(String firstName , String lastName);
	
	List<Manager> findByEmpCodeStartingWith(String empCode);
	
	List<Manager> findByEmpCodeEndingWith(String empCode);
	
	List<Manager> findByEmpCodeContaining(String empCode);
	
	List<Manager> findByEmpCodeNotContaining(String empCode);
	
	List<Manager> findByEmpCodeEquals(String empCode);
	
	List<Manager> findByEmpCodeNot(String empCode);
	
	//=============================================//
	
	List<Manager> findBySalaryBetween(int start,int end);
	
	List<Manager> findByFullNameLike(String fullName);
	
	List<Manager> findBySalaryGreaterThanEqual(int salary);
	
	
}
