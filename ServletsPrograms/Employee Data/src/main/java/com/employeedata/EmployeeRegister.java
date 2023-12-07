package com.employeedata;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeRegister
 */
@WebServlet("/EmployeeRegister")
public class EmployeeRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	private static String url = "jdbc:mysql://localhost:3306/motivity_labs";
	private static String username = "root";
	private static String dbpassword = "Cherry$9821";
	private static String loadClass = "com.mysql.jdbc.Driver";
	private int eid;
	private String ename, email, password, department;

	public EmployeeRegister() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @throws SQLException
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// EmployeeRegister empObj = new EmployeeRegister();
		try {
			PrintWriter writer = response.getWriter();
			eid = Integer.parseInt(request.getParameter("eid"));
			ename = request.getParameter("ename");
			email = request.getParameter("email");
			department = request.getParameter("department");
			password = request.getParameter("password");
			// writer.println("Data entered successfully");
			Class.forName(loadClass);
			Connection connection = DriverManager.getConnection(url, username, dbpassword);
			String query = "INSERT INTO employee VALUES (?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, eid);
			statement.setString(2, ename);
			statement.setString(3, email);
			statement.setString(4, department);
			statement.setString(5, password);
			statement.executeUpdate();
			response.sendRedirect("EmployeeData.jsp");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
