package com.rays.basiccrudoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
	public static void main(String[] args) throws Exception {
		insert();	
	}
	    private static void insert() throws Exception {
	    	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");
		Statement stmt =conn.createStatement();
		
		int i = stmt.executeUpdate("Insert into marksheet values(13,71,'ANSH',75,76,null)");  // be aware of inverted commas
		System.out.println(i +"RecordInserted");	
	}
}
