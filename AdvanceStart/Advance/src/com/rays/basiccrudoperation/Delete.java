package com.rays.basiccrudoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete {
public static void main(String[] args) throws Exception {
	
	delete();				
}
	private static void delete() throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");
	Statement stmt =conn.createStatement();
	
	int i = stmt.executeUpdate("delete from  marksheet where name = 'heyansh'");
	System.out.println(i +" RecordInserted");
	
}
}
