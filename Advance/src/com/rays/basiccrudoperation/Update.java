package com.rays.basiccrudoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update {
public static void main(String[] args) throws Exception {
		update();
}
public static void update() throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");
		Statement stmt =conn.createStatement();
		
		int i = stmt.executeUpdate("update marksheet  set name= 'Ask' where name = 'Gopalk'");
		System.out.println(i +"RecordInserted");		
	}
}
