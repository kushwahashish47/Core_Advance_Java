package com.rays.basiccrudoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Crud {
	public static void main(String[] args) throws Exception {
		search();	
	}
	private static void search()  throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");
		Statement stmt =conn.createStatement();
		ResultSet rs =stmt.executeQuery("select * from marksheet");
		
		System.out.println("  "+"\tid\troll_no\tname\tphysics\tchemistry\tmaths");
		
	while(rs.next()) {
		System.out.print("\t   "+rs.getInt(1));
		System.out.print("\t   "+rs.getInt(2));
		System.out.print("\t   "+rs.getString(3));
		System.out.print("\t   "+rs.getInt(4));
		System.out.print("\t   "+rs.getInt(5));
		System.out.println("\t  "+rs.getInt(6));	
	}
	
	stmt.close();
	conn.close();
}
}
