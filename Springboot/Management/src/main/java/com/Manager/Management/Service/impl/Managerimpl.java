package com.Manager.Management.Service.impl;

import java.util.List;
import java.util.Optional;
import java.util.logging.LogManager;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Manager.Management.Entity.Manager;
import com.Manager.Management.Exception.ManagerNotFound;
import com.Manager.Management.Repository.ManagerRepository;
import com.Manager.Management.Service.ManagerService;
@Service
public class Managerimpl implements ManagerService {
	@Autowired
	ManagerRepository managerRepository;
	
	private static final Logger log = org.apache.logging.log4j.LogManager.getLogger(ManagerService.class);
	
	@Override
	public Manager saveEmp(Manager manager) {
		manager.setFullName(manager.getFirstName() +" "+manager.getLastName());
		return managerRepository.save(manager);
	}
	@Override
	public List<Manager> getAll() {
		
		List<Manager> list = managerRepository.findAll();
		
		log.info("details",list);
		return list;		
	}
	
	
	
	@Override
	public void delEmp(int manager) {
		managerRepository.deleteById(manager);
		
	}
	
	@Override
	public Manager updateEmp(Manager manager, int empId) {
		Manager man = managerRepository.findById(empId).orElse(null);
		if(man != null) {
			man.setFirstName(manager.getFirstName());
			man.setLastName(manager.getLastName());
			man.setDept(manager.getDept());
			man.setSalary(manager.getSalary());
			man.setEmpCode(manager.getEmpCode());
			
			managerRepository.save(man);
		}
		return man;
	}
	
	//************************************************//
	
	@Override
	public List<Manager> findByFirstName(String firstName) {
		List<Manager> list= managerRepository.findByFirstName(firstName);
		
		if(list.isEmpty()) {
			throw new ManagerNotFound("manager not found");
		}
		return list;
	}
	
	@Override
	public List<Manager> findByFirstNameAndLastName(String firstName, String lastName) {
		// TODO Auto-generated method stub
//		List<Manager> list= managerRepository.findByFirstNameAndLastName(firstName, lastName);
//		
//		if(list.isEmpty()) {
//			throw new ManagerNotFound("manager not found");
//		}
		return managerRepository.findByFirstNameAndLastName(firstName, lastName);
	}
	@Override
	public List<Manager> findByEmpCodeStartingWith(String empCode) {
		
		return managerRepository.findByEmpCodeStartingWith(empCode);
	}
	@Override
	public List<Manager> findByEmpCodeEndingWith(String empCode) {
		
		return managerRepository.findByEmpCodeEndingWith(empCode);
	}
	@Override
	public List<Manager> findByEmpCodeContaining(String empCode) {
		
		return managerRepository.findByEmpCodeContaining(empCode);
	}
	@Override
	public List<Manager> findByEmpCodeNotContaining(String empCode) {
		
		return managerRepository.findByEmpCodeNotContaining(empCode);
	}
	@Override
	public List<Manager> findByEmpCodeEquals(String empCode) {
		
		return managerRepository.findByEmpCodeEquals(empCode);
	}
	@Override
	public List<Manager> findByEmpCodeNot(String empCode) {
		
		return managerRepository.findByEmpCodeNot(empCode);
	}
	@Override
	public List<Manager> findBySalaryBetween(int start, int end) {
		
		return managerRepository.findBySalaryBetween(start, end);
	}
	@Override
	public List<Manager> findByFullNameLike(String fullName) {
		
		return managerRepository.findByFullNameLike(fullName);
	}
	@Override
	public List<Manager> findBySalaryGreaterThanEqual(int salary) {
		
		return managerRepository.findBySalaryGreaterThanEqual(salary);
	}
	
	
}
