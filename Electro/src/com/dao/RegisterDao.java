package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bean.Register;
import com.util.ElectroUtil;

public class RegisterDao {
	public static void registerUser(Register a) {
		
        try {
        	Connection conn=ElectroUtil.createConnection();
    		String sql="insert into register(fname,lname,email,mobile,password,cpassword,gender,address,usertype) values (?,?,?,?,?,?,?,?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, a.getFname());
			pst.setString(2, a.getLname());
			pst.setString(3, a.getEmail());
			pst.setLong(4, a.getMobile());
			pst.setString(5, a.getPassword());
			pst.setString(6, a.getCpassword());
			pst.setString(7, a.getGender());
			pst.setString(8, a.getAddress());
			pst.setString(9, a.getUsertype());
			pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
        
	}
	
	public static boolean checkEmail(String email) {
		
		boolean flag=false;
		try {
			Connection conn =ElectroUtil.createConnection();
			String sql="select * from register where email=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				flag=true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	public static Register checkLogin(String email,String password) {
		 
		Register u=null;
		try {
			Connection conn=ElectroUtil.createConnection();
			String sql="select * from register where email=? and password=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, email);
			pst.setString(2, password);
			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				u=new Register();
				
				u.setCno(rs.getInt("cno"));
				u.setFname(rs.getString("fname"));
				u.setLname(rs.getString("lname"));
				u.setEmail(rs.getString("email"));
				u.setMobile(rs.getLong("mobile"));
				u.setPassword(rs.getString("password"));
				u.setCpassword(rs.getString("cpassword"));
				u.setGender(rs.getString("gender"));
				u.setAddress(rs.getString("address"));
				u.setUsertype(rs.getString("usertype"));
			}
		}catch(Exception e) {
				e.printStackTrace();
			
		}
		return u;
	}
	
	public static void changePassword(String email,String password) {
	      
	      try {
	    	  Connection conn=ElectroUtil.createConnection();
		      String sql="update register set password=? where email=?";
			  PreparedStatement pst=conn.prepareStatement(sql);
			  pst.setString(1,password);
			  pst.setString(2,email);
			  pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }
	
	public static void updateProfile(Register u) {
		try {
		Connection conn=ElectroUtil.createConnection();
		String sql="update register set fname=?,lname=?,mobile=?,address=? where email=?";
		PreparedStatement pst=conn.prepareStatement(sql);
		
		pst.setString(1,u.getFname());
		pst.setString(2,u.getLname());
		pst.setLong(3, u.getMobile());
		pst.setString(4, u.getAddress());
		pst.setString(5, u.getEmail());
		pst.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
