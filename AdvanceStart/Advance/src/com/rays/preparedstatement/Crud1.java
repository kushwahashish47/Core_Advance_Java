package com.rays.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Crud1 {							
	public static void main(String[] args) throws Exception {
	insert();
	}
	private static void insert() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");
		PreparedStatement ps= conn.prepareStatement("insert into marksheet values(?,?,?,?,?,?)");
		ps.setInt(1,5);
		ps.setInt(2, 40);
		ps.setString(3, "ak");
		ps.setInt(4,78);
		ps.setInt(5, 79);
		ps.setInt(6, 95);
		
		int i = ps.executeUpdate();
		
		System.out.println(i);
		ps.close();
		conn.close();	
	}

}
