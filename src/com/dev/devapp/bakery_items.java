package com.dev.devapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class bakery_items {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id");
		int bakery_id = sc.nextInt();
		System.out.println("Enter the bakery name");
		String bakery_name = sc.next();
		System.out.println("Enter the no.of items");
		int Bakery_noOfItems = sc.nextInt();
		System.out.println("Enter the bakery area");
		String Bakery_area = sc.next();
		System.out.println("Enter the Rating");
		double Bakery_Rating = sc.nextDouble();
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String query = "insert into bakery_items values(?,?,?,?,?)";
		//String query = "select * from bakery_items";
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/games","root","sudha123456");
				preparedStatement = connection.prepareStatement(query);
				
				preparedStatement.setInt(1, bakery_id);
				preparedStatement.setString(2, bakery_name);
				preparedStatement.setInt(3,Bakery_noOfItems);
				preparedStatement.setString(4, Bakery_area);
				preparedStatement.setDouble(5, Bakery_Rating);
				
				int noOfRowsAffected = preparedStatement.executeUpdate();
				System.out.println(noOfRowsAffected);
				
				
				resultSet = preparedStatement.executeQuery();
				while(resultSet.next())
				{
				 
					//String id = resultSet.getString("idbakery_id");
					System.out.println(bakery_id);
					String name = resultSet.getString(2);
					System.out.println(name);
					String ratings = resultSet.getString(2);
					System.out.println(ratings);
				}
				
				
				  
				
			} catch (SQLException | ClassNotFoundException e) {
			
				e.printStackTrace();
			}
			finally {
				if(preparedStatement != null || connection != null) {
					try {
						preparedStatement.close();
						connection.close();
					}
					catch(SQLException e) {
						e.printStackTrace();
					}
					
				}
						
						
			}
		} 
	}


