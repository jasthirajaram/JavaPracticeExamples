package com.student.crud;

import java.sql.*;
import java.util.Scanner;

public class StudentCRUD {
	public static String url = "jdbc:mysql://localhost:3306/motivity_labs";
	public static String user = "root";
	public static String password = "Cherry$9821";
	public static boolean flag;

	public void insertion(int rollno, String name, String course, String phoneno) throws SQLException {
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("Connection establishment successful");
		String insertQuery = "INSERT INTO student VALUES (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(insertQuery);
		ps.setInt(1, rollno);
		ps.setString(2, name);
		ps.setString(3, course);
		ps.setString(4, phoneno);
		int n = ps.executeUpdate();
		System.out.println(n);
		con.close();
	}

	public void read() throws SQLException {
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("Connection establishment successful");
		String readQuery = "select * from student";
		Statement st = con.createStatement();
		ResultSet result1 = st.executeQuery(readQuery);
		// System.out.println("The data in the employee table is:");
		while (result1.next()) {
			// System.out.println("entering loop");
			int rollno = result1.getInt("rollno");
			String name = result1.getString("name");
			String course = result1.getString("course");
			String phoneno = result1.getString("phoneno");

			System.out.println(rollno + "   " + name + "   " + course + "   " + phoneno);
		}
	}

	public static void main(String[] args) throws SQLException {
		StudentCRUD j = new StudentCRUD();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Please enter your choice");
			System.out.println("Press 1 for Insertion of records");
			System.out.println("Press 2 for read the records");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("enter student rollno ");
				int rollno = sc.nextInt();
				System.out.println("enter student name ");
				String name = sc.next();
				System.out.println("enter student course ");
				String course = sc.next();
				System.out.println("enter student phone number ");
				String phoneno = sc.next();
				j.insertion(rollno, name, course, phoneno);
				break;
			case 2:
				j.read();
				break;
			case 0:
				System.out.println("Thanks for using my JDBC Connection");
				flag = false;
				break;
			default:
				System.out.println("please enter valid choice");
				break;
			}
		} while (flag);

		sc.close();
	}
}
