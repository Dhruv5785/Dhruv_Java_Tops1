package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ElectroUtil {
   public static Connection createConnection() {
	   
	   Connection conn=null;
	   try {
		   Class.forName("com.mysql.jdbc.Driver");
		 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/electro","root","");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return conn;
   }
}
