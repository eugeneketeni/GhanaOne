package com.wrox;

import java.sql.*;

public class MySqlCon {

	public String getUserDetails(String userID) {
		String password = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customersupport", "root",
					"Password@100");
			// System.out.println("Inside get user details");
			// here customer support is database name, root is user name and
			// password
			PreparedStatement stmt = con.prepareStatement("select password from user where userid=?");
			stmt.setString(1, userID);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				password = rs.getString(1);

			}
		} catch (

		Exception e) {
			System.out.println("exception " + e);
			System.out.println("exception " + e.getMessage());
		}
		return password;
	}

	public void insertUserDetails(String UserID, String Email, String Firstname, String Lastname, String password) {
		// Insert statement to database

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customersupport", "root",
					"Password@100");

			PreparedStatement stmtInsert = con.prepareStatement("insert into user values(?,?,?,?,?)");
			stmtInsert.setString(1, UserID);
			stmtInsert.setString(2, Email);
			stmtInsert.setString(3, Firstname);
			stmtInsert.setString(4, Lastname);
			stmtInsert.setString(5, password);
			int rsInsert = stmtInsert.executeUpdate();

		} catch (

		Exception e) {
			System.out.println("exception " + e);
			System.out.println("exception " + e.getMessage());
		}

	}
	
	public void forgotPassword (String UserId, String password){
		
	}

}
