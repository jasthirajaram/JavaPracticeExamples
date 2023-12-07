package com.registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserLogin
 */
@WebServlet("/UserLogin")
public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	private static String url = "jdbc:mysql://localhost:3306/motivity_labs";
	private static String user = "root";
	private static String password1 = "Cherry$9821";
	//private static boolean flag;

	public void updation(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = response.getWriter();
		Connection con = DriverManager.getConnection(url, user, password1);
		out.println("Connection establishment successful");
		String updateQuery = "UPDATE employee_registration"
				+ "SET username = 'Raj', email = 'raj@gmail.com'"
				+ "WHERE regno = 1";
		Statement s = con.createStatement();
		s.execute(updateQuery);
		//ps.executeUpdate();
		out.println("Data updated sucessfully");
		con.close();
	}

	public void delete(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = response.getWriter();
		Connection con = DriverManager.getConnection(url, user, password1);
		out.println("Connection establishment successful");
		String truncateQuery = "truncate table employee_registration";
		Statement st = con.createStatement();
		st.execute(truncateQuery);
		out.println("Data cleared successfully");
		con.close();
	}

	public void read(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter out = response.getWriter();
		Connection con = DriverManager.getConnection(url, user, password1);
		//out.println("Connection establishment successful");
		String readQuery = "select * from employee_registration";
		Statement st = con.createStatement();
		ResultSet result1 = st.executeQuery(readQuery);
		// System.out.println("The data in the employee table is:");
		out.println("The data in the employee_registration is: ");
		while (result1.next()) {
			;
			int regno = result1.getInt("regno");
			String username = result1.getString("username");
			String password = result1.getString("password");
			String email = result1.getString("email");

			out.println(regno + "   " + username + "   " + password + "   " + email);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		UserLogin userLogin = new UserLogin();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String choice = request.getParameter("choice");
		if(choice == null) {
			out.println("Choice is null");		}
		else if (username.equals("motivity") && password.equals("root")) {
			try {
				switch (choice) {
				case "Updation":
					userLogin.updation(request, response);
					break;
				case "Deletion":
					userLogin.delete(request, response);
					break;
				default:
					userLogin.read(request, response);
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else
			out.println("Enter valid choice");
	}
}