package com.rays.exceptionhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExceptionnH {
	public static void main(String[] args) throws Exception {
		
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");
	conn.setAutoCommit(false);
	Statement stmt=conn.createStatement();
	try {
		int i=stmt.executeUpdate("insert into marksheet values(10,10,'arun',90,90,90)");
		i=stmt.executeUpdate("insert into marksheet values(11,10,'arun',90,90,90)");
		i=stmt.executeUpdate("insert into marksheet values(11,10,'arun',90,90,90)");
		conn.commit();
		
	} catch (SQLException e1) {
		conn.rollback();
		System.out.println("Error");
	
	}
	
	}
}
