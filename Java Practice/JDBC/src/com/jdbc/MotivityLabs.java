package com.jdbc;

import java.sql.*;

public class MotivityLabs {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/motivity_labs", "root", "Cherry$9821");
            System.out.println("Connection establishment successful");
			Statement st = connection.createStatement();
			//String databaseQuery = "create database motivity_labs";
//			//String tableQuery = "create table employee"
//					+ "(eid int auto_increment,"
//					+ "ename varchar(40) not null,"
//					+ "email varchar(40) unique,"
//					+ "department varchar(40),"
//					+ "primary key(eid))";
			
//			String insertQuery1 = "INSERT INTO employee (ename, email, department)"
//					+ "VALUES ('Rajaram', 'rajaram@motivitylabs.com', '1088')";
//			
//			String insertQuery2 = "INSERT INTO employee (ename, email, department)"
//					+ "VALUES ('Abhilash', 'abhilash@motivitylabs.com', '1089')";
//			
//			String insertQuery3 = "INSERT INTO employee (ename, email, department)"
//					+ "VALUES ('Jayanth', 'jayanth@motivitylabs.com', '1090')";
//			
//			String insertQuery4 = "INSERT INTO employee (ename, email, department)"
//					+ "VALUES ('Prudhvi', 'prudhvi@motivitylabs.com', '1091')";
			
		    //st.execute(databaseQuery);
		   // st.execute(tableQuery);
//		    st.execute(insertQuery1);
//		    st.execute(insertQuery2);
//		    st.execute(insertQuery3);
//		    st.execute(insertQuery4);
			
			String updateOuery = "UPDATE employee SET department = 'development' WHERE eid > 0";
			
			int result = st.executeUpdate(updateOuery);
			System.out.println(result);
			
			String retriveQuery = "select * from employee";
			ResultSet result1 = st.executeQuery(retriveQuery);
			System.out.println("The data in the employee table is:");
			 while (result1.next()) {

	                int id = result1.getInt("eid");
	                String name = result1.getString("ename");
	                String email = result1.getString("email");
	                String department = result1.getString("department");
	                System.out.println(id + "   " + name
	                                   + "   " + email + "   " + department);
			 }
		    System.out.println("Queries executed");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
