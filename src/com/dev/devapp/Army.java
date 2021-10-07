package com.dev.devapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Army {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		String sql = "insert into army_table values(1,'navy','kashmir','machinegun')";
		String insert = "insert into army_table values(2,'CRPF','Kashmir','RocketLauncher')";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/games?user=root&password=sudha123456");
			con.setAutoCommit(false);
			stmt = con.createStatement();
			stmt.addBatch(sql);
			stmt.addBatch(insert);
			int[] noOfOperations =  stmt.executeBatch();
			for(int i=0;i<noOfOperations.length;i++) {
				System.out.println(i);
			}
			con.commit();
			stmt.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
