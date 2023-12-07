//package com.employeedata;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.sql.*;
////import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@WebServlet("/EmployeeLogin")
//public class EmployeeLogin extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//	private String username;
//	private String password;
//    public EmployeeLogin() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//	/**
//	 * @throws IOException 
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
//		// TODO Auto-generated method stub
//		PrintWriter writer = response.getWriter();
//		username = request.getParameter("username");
//		password = request.getParameter("password");
//		String retriveQuery = "select * from employee";
//		if(username.equals("motivity") && password.equals("root"))
//		{
//			try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/motivity_labs", "root", "Cherry$9821");
//			Statement st = connection.createStatement();
//			ResultSet result1 = st.executeQuery(retriveQuery);
//			writer.println("The data in the employee table is:");
//			 while (result1.next()) {
//	                int id = result1.getInt("eid");
//	                String name = result1.getString("ename");
//	                String email = result1.getString("email");
//	                String department = result1.getString("department");
//	                writer.println(id + "   " + name
//	                                   + "   " + email + "   " + department);
//			 }
//		} catch(Exception e) {
//			e.printStackTrace();
//		}	
//		}
//		else
//			response.sendRedirect("EmployeeData.jsp");
//	}
//}


package com.employeedata;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmployeeLogin")
public class EmployeeLogin extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private String email;
    private String password;

    public EmployeeLogin() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();
        email = request.getParameter("email");
        password = request.getParameter("password");

        // Validate username and password from the database
        boolean isValidCredentials = validateCredentials(email, password);

        if (isValidCredentials) {
            // Authentication successful
            writer.println("Login successful");

            // Perform further actions after successful login
            // For example, you can retrieve and display employee data
            retrieveEmployeeData(writer);
        } else {
            // Authentication failed
            response.sendRedirect("EmployeeData.jsp");
        }
    }

    private boolean validateCredentials(String username, String password) {
        // Retrieve username and password from the database
        String dbEmail = null;
        String dbPassword = null;

        String retrieveQuery = "SELECT * FROM employee WHERE email = ?";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/motivity_labs", "root", "Cherry$9821");
            PreparedStatement preparedStatement = connection.prepareStatement(retrieveQuery);
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                dbEmail = resultSet.getString("email");
                dbPassword = resultSet.getString("password");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return username.equals(dbEmail) && password.equals(dbPassword);
    }

    private void retrieveEmployeeData(PrintWriter writer) {
        String retrieveQuery = "SELECT * FROM employee";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/motivity_labs", "root", "Cherry$9821");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(retrieveQuery);

            writer.println("The data in the employee table is:");
            while (resultSet.next()) {
                int id = resultSet.getInt("eid");
                String name = resultSet.getString("ename");
                String email = resultSet.getString("email");
                String department = resultSet.getString("department");
                writer.println(id + "   " + name + "   " + email + "   " + department);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

