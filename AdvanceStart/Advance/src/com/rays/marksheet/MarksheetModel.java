package com.rays.marksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MarksheetModel {													//we used insert(); instead of add();
	public Integer nextPK() throws Exception {																	//inserting values using or making primary key to setting method so that 
		Class.forName("com.mysql.cj.jdbc.Driver");																// automatically it select next id while inserting values.
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");   // using PK concept in insertion of values helps to avoid setting duplicate value. 
		PreparedStatement ps = conn.prepareStatement("select max(id) from marksheet");
		int pk=0;
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()) {
		pk=	rs.getInt(1);
		}
		 return pk+1;
	}	
	public void insert(MarksheetBean bean) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");
		PreparedStatement ps = conn.prepareStatement("insert into marksheet values (?,?,?,?,?,?)");
		ps.setInt(1, nextPK());																					//here we used PK concept.
		ps.setInt(2, bean.getRollNo());																			// for general case it will be ps.setInt(2, bean.getId());
		ps.setString(3, bean.getName());
		ps.setInt(4, bean.getPhysics());
		ps.setInt(5, bean.getChemistry());
		ps.setInt(6, bean.getMaths());

		int i = ps.executeUpdate();
		System.out.println(i + "record has been inserted");

	}
	public void update(MarksheetBean bean) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");
		PreparedStatement ps = conn.prepareStatement("update marksheet set roll_no=?,name=?, physics=?,chemistry=?,maths=? where id=?");
		ps.setInt(6, bean.getId());
		ps.setInt(1, bean.getRollNo());
		ps.setString(2, bean.getName());
		ps.setInt(3, bean.getPhysics());
		ps.setInt(4, bean.getChemistry());
		ps.setInt(5, bean.getMaths());

		int i = ps.executeUpdate();
		System.out.println(i + "record has been updated..");

	}

	public void delete(int i) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");
		PreparedStatement ps = conn.prepareStatement("delete from marksheet where id=? ");
		ps.setInt(1, i);
		int j = ps.executeUpdate();
		System.out.println(j + "record has been deleted");
	}

	public List search() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");
		PreparedStatement ps = conn.prepareStatement("select * from marksheet");
		ResultSet rs = ps.executeQuery();
		List list = new ArrayList();
		MarksheetBean bean = null;

		System.out.println("id\troll_no\tname\tphy\tche\tmaths");

		while (rs.next()) {
			bean = new MarksheetBean();
			bean.setId(rs.getInt(1));
			bean.setRollNo(rs.getInt(2));
			bean.setName(rs.getString(3));
			bean.setPhysics(rs.getInt(4));
			bean.setChemistry(rs.getInt(5));
			bean.setMaths(rs.getInt(6));
			list.add(bean);
		}

		return list;

	}

	public MarksheetBean findById(int id) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");
		PreparedStatement ps = conn.prepareStatement("select * from marksheet where id=?");
		ps.setInt(1, id);

		ResultSet rs = ps.executeQuery();

		System.out.println("id\troll_no\tname\tphy\tche\tmaths");

		MarksheetBean bean = null;
		while (rs.next()) {
			bean = new MarksheetBean();
			
			bean.setId(rs.getInt(1));
			bean.setRollNo(rs.getInt(2));
			bean.setName(rs.getString(3));
			bean.setPhysics(rs.getInt(4));
			bean.setChemistry(rs.getInt(5));
			bean.setMaths(rs.getInt(6));
		}
		return bean;

	}

}
