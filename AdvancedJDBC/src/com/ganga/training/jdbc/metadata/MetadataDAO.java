package com.ganga.training.jdbc.metadata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class MetadataDAO {
	public static void main(String[] args) {
		try(Connection con= DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","1234");
				Statement stmt=con.createStatement();
				){
			ResultSet resultSet = stmt.executeQuery("select * from account");
			ResultSetMetaData result = resultSet.getMetaData();
			int columnCount=result.getColumnCount();
			
			for(int i=1;i<=columnCount;i++) {
				System.out.println(result.getColumnName((i)));
				System.out.println(result.getColumnTypeName((i)));
				
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
