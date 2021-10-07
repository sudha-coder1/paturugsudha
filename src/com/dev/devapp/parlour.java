package com.dev.devapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class parlour {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the parlour id");
		int parlour_id = sc.nextInt();
		System.out.println("Enter the parlour name");
		String parlour_name = sc.next();
		System.out.println("Enter the parlour type");
		String parlour_type = sc.next();
		System.out.println("Enter no of Employees");
		int parlour_noOfEmployees = sc.nextInt();
		System.out.println("Enter the Parlour Rating");
		double parlour_rating = sc.nextDouble();
		
		System.out.println("Enter the parlour id");
		int parlour_id1 = sc.nextInt();
		System.out.println("Enter the parlour name");
		String parlour_name1 = sc.next();
		System.out.println("Enter the parlour type");
		String parlour_type1 = sc.next();
		System.out.println("Enter no of Employees");
		int parlour_noOfEmployees1 = sc.nextInt();
		System.out.println("Enter the Parlour Rating");
		double parlour_rating1 = sc.nextDouble();
		
		
		Connection connection;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		String query = "insert into values(?,?,?,?,?)";
		String query1 = "insert into values(?,?,?,?,?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/games","root","sudha123456");
			preparedStatement.setInt(1,parlour_id );
			preparedStatement.setString(2,parlour_name);
			preparedStatement.setString(3, parlour_type);
			preparedStatement.setInt(4, parlour_noOfEmployees);
			preparedStatement.setDouble(5, parlour_rating);
			
			preparedStatement.setInt(1,parlour_id1 );
			preparedStatement.setString(2,parlour_name1);
			preparedStatement.setString(3, parlour_type1);
			preparedStatement.setInt(4, parlour_noOfEmployees1);
			preparedStatement.setDouble(5, parlour_rating1);
			
			resultSet=preparedStatement.executeQuery(query + query1);
			
			
			
			
			
		
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	
}
