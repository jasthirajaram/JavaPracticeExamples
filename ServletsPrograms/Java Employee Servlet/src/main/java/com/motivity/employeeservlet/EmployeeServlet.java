package com.motivity.employeeservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String name = req.getParameter("name");
		int id = Integer.parseInt(req.getParameter("eid"));
		int salary = Integer.parseInt(req.getParameter("salary"));

		PrintWriter out = res.getWriter();
		out.println(name+"   "+id+"   "+salary);
		
	}
}
