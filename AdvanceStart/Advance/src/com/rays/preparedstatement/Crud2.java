package com.rays.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Crud2 {
	public static void main(String[] args) throws Exception {
		update();
		}
	
	private static void update() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");
		PreparedStatement ps= conn.prepareStatement("update marksheet  set name = ? where physics = ?");
		ps.setNString(1, "Abhay");
		ps.setInt(2,78);
	
		int i = ps.executeUpdate();
		
		System.out.println(i);
		
		ps.close();
		conn.close();
		
	}
}
