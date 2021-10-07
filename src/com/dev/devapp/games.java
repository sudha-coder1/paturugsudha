package com.dev.devapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class games {
public static void main(String[] args) {
	Connection connection = null;
	Statement statement = null;
	String readMultipleRecordQuery = "select * from games";
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/schema?user=root&password=sudha123456");
		statement = connection.createStatement();
		// statement.executeUpdate("insert into games values(1,'badminton',2,'digital','10 levels')");
		ResultSet resultSet=statement.executeQuery(readMultipleRecordQuery);
		while (resultSet.next()) { 
		System.out.print("id " +resultSet.getInt(1));
		System.out.print("name " +resultSet.getString(2));
		System.out.print("players " +resultSet.getInt(3));
		System.out.print("type " +resultSet.getString(4));
		System.out.print("levels " +resultSet.getString(5));
		}
	
	} catch (Exception exception) {
		System.out.println(exception.getMessage());
		exception.printStackTrace();
	}
	finally {
		if(statement!=null || connection!=null) {
			try {
				statement.close();
				connection.close();
			}
			catch(SQLException e){
				e.printStackTrace();

			}
		}
	}
	
	
	
}
}


