package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.Result;

import com.bean.Student;
import com.util.StudentUtil;

public class StudentDao {
	
	public static void insertStudent(Student s)
	{
		try
		{
			Connection conn=StudentUtil.createConnection();
			String sql="insert into stud(fname,lname,email,mobile,address,gender)values(?,?,?,?,?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1,s.getFname());
			pst.setString(2,s.getLname());
			pst.setString(3,s.getEmail());
			pst.setString(4,s.getMobile());
			pst.setString(5,s.getAddress());
			pst.setString(6,s.getGender());
			pst.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static List<Student> getAllStudent()
	{
		List<Student> list=new ArrayList<Student>();
		try
		{
			Connection conn=StudentUtil.createConnection();
			String sql="select * from stud";
			PreparedStatement pst=conn.prepareStatement(sql);
			ResultSet  rs=pst.executeQuery();
			while(rs.next())
			{
				Student s=new Student();
				s.setId(rs.getInt("id"));
				s.setFname(rs.getString("fname"));
				s.setLname(rs.getString("lname"));
				s.setEmail(rs.getString("email"));
				s.setMobile(rs.getString("mobile"));
				s.setAddress(rs.getString("address"));
				s.setGender(rs.getString("gender"));
				list.add(s);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
	public static Student getStudent(int id)
	{
		Student s=null;
		try
		{
			s=new Student();
			Connection conn=StudentUtil.createConnection();
			String sql="select * from stud where id=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet  rs=pst.executeQuery();
			while(rs.next())
			{
				s.setId(rs.getInt("id"));
				s.setFname(rs.getString("fname"));
				s.setLname(rs.getString("lname"));
				s.setEmail(rs.getString("email"));
				s.setMobile(rs.getString("mobile"));
				s.setAddress(rs.getString("address"));
				s.setGender(rs.getString("gender"));
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return s;
	}
	public static void updateStudent(Student s)		
	{
		try
		{
			Connection conn=StudentUtil.createConnection();
			String sql="update stud set fname=?,lname=?,email=?,mobile=?,address=?,gender=? where id=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1,s.getFname());
			pst.setString(2,s.getLname());
			pst.setString(3,s.getEmail());
			pst.setString(4,s.getMobile());
			pst.setString(5,s.getAddress());
			pst.setString(6,s.getGender());
			pst.setInt(7, s.getId());
			//pst.executeUpdate();
			pst.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void deleteStudent(int id)
	{
		try
		{
			Connection conn=StudentUtil.createConnection();
			String sql="delete from stud where id=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, id);
			pst.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
		
	}



	



