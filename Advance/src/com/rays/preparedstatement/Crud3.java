
package com.rays.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Crud3 {
	public static void main(String[] args) throws Exception {
		delete();
		
	}
	private static void delete() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");
		PreparedStatement ps= conn.prepareStatement("delete from marksheet where name = ?");
		ps.setNString(1, "Abhay");
		
	
		int i = ps.executeUpdate();
		
		System.out.println(i+ " deleted");
		
		ps.close();
		conn.close();	
	}
}
