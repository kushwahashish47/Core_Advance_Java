package com.rays.metadata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class Metadata {
	public static void main(String[] args) throws Exception {
		
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");
	PreparedStatement ps = conn.prepareStatement("select * from marksheet");
	ResultSet rs = ps.executeQuery();
	ResultSetMetaData rsmd =rs.getMetaData();
	
	
	System.out.println(rsmd.getTableName(1));
	System.out.println(rsmd.getColumnCount());
	System.out.println(rsmd.getColumnLabel(4));
	System.out.println(rsmd.getCatalogName(1));
	
}
}