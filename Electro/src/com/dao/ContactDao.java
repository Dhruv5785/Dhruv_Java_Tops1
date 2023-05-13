package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bean.Contact;
import com.util.ElectroUtil;

public class ContactDao {
   public static void insertUser(Contact a) {
	  
	try {
		 Connection conn=ElectroUtil.createConnection();
		   String sql="insert into contact (fname,lname,email,suggestions) values (?,?,?,?)";
		   PreparedStatement pre = conn.prepareStatement(sql);		   
		   pre.setString(1, a.getFname());
		   pre.setString(2, a.getLname());
		   pre.setString(3, a.getEmail());
		   pre.setString(4, a.getSuggestions());		   
		   pre.executeUpdate();
	} catch (Exception e) {
		e.printStackTrace();
	}
  }
}
