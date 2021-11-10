package com.ganga.training.jdbc.batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;

public class BatchDAO {
	public static void main(String[] args) {
		try(Connection con= DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","1234");
				Statement stmt=con.createStatement();
				){
			stmt.addBatch("insert into account values(1,'Clinton','Bill',10000)");
			stmt.addBatch("insert into account values(1,'Clinton','Love',30000)");
			
			int[] executeBatch = stmt.executeBatch();
			
			for (int i = 0; i < executeBatch.length; i++) {
				System.out.println(executeBatch[i]);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
