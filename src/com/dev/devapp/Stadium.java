package com.dev.devapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Stadium {
	public static String driverCLassName="com.mysql.cj.jdbc.Driver";
	public static String url = "jdbc:mysql://localhost:3306?user=root&password=sudha123456";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of row");
		int noOfRows = sc.nextInt();
		Connection connection=null;
		PreparedStatement preparedStatement = null;
		String query = "insert into games.Stadium values(?,?,?,?)";
		
		try {
			Class.forName(driverCLassName);
			connection = DriverManager.getConnection(url);
			connection.setAutoCommit(false);
			for(int i=0;i<=noOfRows;i++){
				preparedStatement = connection.prepareStatement(query);
			
			System.out.println("Enter the stadium  id");
			int stadium_id = sc.nextInt();
			System.out.println("Enter the stadium name");
			String stadium_name = sc.next();
			System.out.println("Enter the stadium location");
			String stadium_city = sc.next();
			System.out.println("enter the stadium type");
			String stadium_type = sc.next();
			
			preparedStatement.setInt(1, stadium_id);
			preparedStatement.setString(2,stadium_name );
			preparedStatement.setString(3,stadium_city );
			preparedStatement.setString(4, stadium_type);
			
			
			int noOfRowsAffected = preparedStatement.executeUpdate();
			System.out.println(noOfRowsAffected);
			}
		sc.close();
		connection.commit();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}
