package com.rays.singleoperationex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MarksheetModel {

public static void insert(MarksheetBean bean) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");
		PreparedStatement ps= conn.prepareStatement("insert into marksheet values(?,?,?,?,?,?)");
		
		ps.setInt(1, bean.getId());
		ps.setInt(2, bean.getRollNo());							         			//making connectivity to database and getting values
		ps.setString(3, bean.getName());
		ps.setInt(4, bean.getPhysics());
		ps.setInt(5, bean.getChemistry());
		ps.setInt(6, bean.getMaths());
		
		int i =ps.executeUpdate();	
	}
	
}
