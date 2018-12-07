package com.training.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetConnection {
	// connection variables
	static Connection connection;
	public PreparedStatement ps, ps1, ps2;
	public ResultSet rs, rs1;

	public static Connection getMySqlConnection() { // if u have static method u
													// can only access static
													// variable

		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/sdetdec", "root", "Hexaware@123");
			return connection;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	public Connection getOracleConnection() {
		return null;
	}

}
