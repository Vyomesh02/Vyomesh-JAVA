package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil 
{
	Connection cn=null;
	public Connection getConnection()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/vyom_practice", "root", "root");
			System.out.println("Connection successful...");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return cn;
	}
}
