package com.rays.transactionhandling;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.Statement;
public class Transaction {

public static void main(String[] args) throws Exception{
		  
		  insert();	
	}

	    private static void insert() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");
	    conn.setAutoCommit(false);
	    
	    Statement stmt = conn.createStatement();
	    
	     int i = stmt.executeUpdate("insert into marksheet values(10,14,'Ajeet',12,54,66)");
	      i = stmt.executeUpdate("insert into marksheet values(11,15,'Ajeet',12,54,66)");	 
	      i = stmt.executeUpdate("insert into marksheet values(11,16,'Ajeet',12,54,66)");		//because of this duplicate id  we will
	      i = stmt.executeUpdate("insert into marksheet values(13,16,'Ajeet',12,54,66)");		// unable to make any entry from id 10 to 13
	      																						//whole entries will be rejected.		
	     System.out.println(i+" Inserted");
	     conn.commit();
	     stmt.close();
	     conn.close();
	    
		
	}
	}
