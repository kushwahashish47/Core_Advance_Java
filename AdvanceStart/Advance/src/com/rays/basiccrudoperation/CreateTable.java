package com.rays.basiccrudoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");
		Statement stmt =conn.createStatement();
		String sql = "Create table person(id int,name varchar(50),age int,Primary key(id))";
		stmt.executeUpdate(sql);
				
}

}
