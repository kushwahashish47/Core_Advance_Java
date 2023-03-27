package com.rays.callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class CallPrepareProceduree {
	public static void main(String[] args) throws Exception {
		
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");
	CallableStatement callStmt = conn.prepareCall("{Call new_procedure(?)}");
	callStmt.registerOutParameter(1, Types.INTEGER);
	callStmt.execute();
	int count = callStmt.getInt(1);
	System.out.println("count"+count);
	
	}
}
