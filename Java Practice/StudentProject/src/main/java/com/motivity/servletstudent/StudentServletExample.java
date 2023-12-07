package com.motivity.servletstudent;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentServletExample extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String name = req.getParameter("name");
		int id = Integer.parseInt(req.getParameter("rollno"));
		PrintWriter out = res.getWriter();
		out.println(name+"   "+id);
	}
}
