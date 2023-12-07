package com.jdbc;

import java.sql.*;
import java.util.Scanner;

public class JdbcOperations {
	public static String url = "jdbc:mysql://localhost:3306/motivity_labs";
	public static String user = "root";
	public static String password = "Cherry$9821";
	public static boolean flag;

	public void insertion(int eid, String ename, String email, String department) throws SQLException {
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("Connection establishment successful");
		String insertQuery = "INSERT INTO employee VALUES (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(insertQuery);
		ps.setInt(1, eid);
		ps.setString(2, ename);
		ps.setString(3, email);
		ps.setString(4, department);
		int n = ps.executeUpdate();
		System.out.println(n);
		con.close();
	}

	public void updation(int eid1, String ename1) throws SQLException {
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("Connection establishment successful");
		String updateQuery = "UPDATE employee SET ename = ?, eid = ?";
		PreparedStatement ps = con.prepareStatement(updateQuery);
		ps.setString(1, ename1);
		ps.setInt(2, eid1);
		int n = ps.executeUpdate();
		System.out.println(n);
		con.close();
	}

	public void delete() throws SQLException {
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("Connection establishment successful");
		String truncateQuery = "truncate table employee";
		Statement st = con.createStatement();
		st.execute(truncateQuery);
		System.out.println("Data cleared successfully");
		con.close();
	}

	public void read() throws SQLException {
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("Connection establishment successful");
		String readQuery = "select * from employee";
		Statement st = con.createStatement();
		ResultSet result1 = st.executeQuery(readQuery);
		// System.out.println("The data in the employee table is:");
		while (result1.next()) {
			System.out.println("entering loop");
			int eid = result1.getInt("eid");
			String ename = result1.getString("ename");
			String email = result1.getString("email");
			String department = result1.getString("department");

			System.out.println(eid + "   " + ename + "   " + email + "   " + department);
		}
	}

	public static void main(String[] args) throws SQLException {
		JdbcOperations j = new JdbcOperations();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Please enter your choice");
			System.out.println("Press 1 for Insertion of records");
			System.out.println("Press 2 for read the records");
			System.out.println("Press 3 for updation records");
			System.out.println("Press 4 for delete records");
			System.out.println("Press 0 for exit");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("enter employee id ");
				int eid = sc.nextInt();
				System.out.println("enter employee name ");
				String ename = sc.next();
				System.out.println("enter employee mail ");
				String email = sc.next();
				System.out.println("enter employee dept ");
				String department = sc.next();
				j.insertion(eid, ename, email, department);
				break;
			case 2:
				j.read();
				break;
			case 3:
				System.out.println("enter employee name ");
				String ename1 = sc.next();
				System.out.println("enter employee id ");
				int eid1 = sc.nextInt();
				j.updation(eid1, ename1);
				break;
			case 4:
				j.delete();
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
