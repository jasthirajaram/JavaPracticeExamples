package com.motivity.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int EmpId;
	private String EmpName;
	private String EmpDept;
	private String EmpAddress;
	private int EmpSalary;
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmpDept() {
		return EmpDept;
	}
	public void setEmpDept(String empDept) {
		EmpDept = empDept;
	}
	public String getEmpAddress() {
		return EmpAddress;
	}
	public void setEmpAddress(String empAddress) {
		EmpAddress = empAddress;
	}
	public int getEmpSalary() {
		return EmpSalary;
	}
	public void setEmpSalary(int empSalary) {
		EmpSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + ", EmpDept=" + EmpDept + ", EmpAddress="
				+ EmpAddress + ", EmpSalary=" + EmpSalary + "]";
	}
	public Employee(int empId, String empName, String empDept, String empAddress, int empSalary) {
		super();
		EmpId = empId;
		EmpName = empName;
		EmpDept = empDept;
		EmpAddress = empAddress;
		EmpSalary = empSalary;
	}
	public Employee() {
		super();
	}
	
	
}
