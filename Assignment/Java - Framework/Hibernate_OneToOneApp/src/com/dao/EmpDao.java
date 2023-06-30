package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.Emp;
import com.bean.EmpInfo;
import com.util.EmpUtil;

public class EmpDao {
	
	public static void insertEmpInfo(EmpInfo e1)
	{
		Session session = EmpUtil.createSession();
		Transaction tr = session.beginTransaction(); //insert/update/delete
		session.saveOrUpdate(e1);
		tr.commit();
		session.close();
	}
	
	public static void insertEmp(Emp e2)
	{
		Session session = EmpUtil.createSession();
		Transaction tr = session.beginTransaction();
		session.saveOrUpdate(e2);
		tr.commit();
		session.close();
	}
	
	public static List<Emp> getAllEmp()
	{
		Session session = EmpUtil.createSession();
		List<Emp> list = session.createQuery("from Emp").list();
		session.close();
		return list;
	}
	

}
