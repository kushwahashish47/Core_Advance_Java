package com.rays.jdbcdatasourcee;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	public static void main(String[] args) throws Exception {

		for (int i = 0; i < 60; i++) {
			System.out.println("DB pool Connection" + i);
			System.out.println("----------------------------");

			String sql = "select id ,roll_no, name from marksheet;";
			Connection conn = JdbcDataSource.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			System.out.println("id\tname\troll_no");
//	 System.out.println("roll_no");

			while (rs.next()) {
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.println(rs.getInt(2) + "\t");
			}
		}
	}
}