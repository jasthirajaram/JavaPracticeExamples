package com.registration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserRegister
 */
@WebServlet("/UserRegister")
public class UserRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	private static String url = "jdbc:mysql://localhost:3306/motivity_labs";
	private static String username1 = "root";
	private static String password1 = "Cherry$9821";
	private static String loadClass = "com.mysql.jdbc.Driver";
	private int regno;
	private String username, email, password;

	public UserRegister() {
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
			regno = Integer.parseInt(request.getParameter("regno"));
			username = request.getParameter("username");
			password = request.getParameter("password");
			email = request.getParameter("email");
			// writer.println("Data entered successfully");
			Class.forName(loadClass);
			Connection connection = DriverManager.getConnection(url, username1, password1);
			String query = "INSERT INTO employee_registration VALUES (?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, regno);
			statement.setString(2, username);
			statement.setString(3, password);
			statement.setString(4, email);
			statement.executeUpdate();
			response.sendRedirect("login.jsp");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
