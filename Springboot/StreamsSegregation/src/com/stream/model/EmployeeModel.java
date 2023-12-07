package com.stream.model;

import java.util.List;

public class EmployeeModel {
	int eid;
	List<String> roles;
	String ename;

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "EmployeeModel [ename=" + ename + ", eid=" + eid + ", roles=" + roles + "]";
	}

	public EmployeeModel(String ename, int eid, List<String> roles) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.roles = roles;
	}

	public EmployeeModel() {
		super();
		// TODO Auto-generated constructor stub
	}
}
