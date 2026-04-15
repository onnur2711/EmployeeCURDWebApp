package com.emp.util;

	
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeeUtil {
	public static Connection establishConnection() throws ClassNotFoundException, SQLException {
		//load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//estalish Connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/CSRDB","root","Onnur@2811");
			return connection;
		}

	}


