package com.rays.callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class CallPrepareFunctionnn{
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");
		CallableStatement cstmt = conn.prepareCall("{?=Call partCount()}");
		cstmt.registerOutParameter(1, Types.INTEGER);
		cstmt.execute();
//		System.out.println(cstmt.getInt(1));
//		System.out.println(cstmt.registerOutParameter(1, Types.INTEGER));
		
		
		
	}
}
