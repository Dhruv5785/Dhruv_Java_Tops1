package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.Dept;
import com.bean.Emp;
import com.util.EmpUtil;

public class EmpDao {
	
	public static void insertDept(Dept d)
	{
		Session session=EmpUtil.createSession();
		Transaction tr=session.beginTransaction();
		session.saveOrUpdate(d);
		tr.commit();
		session.close();
	}
	public static void insertEmp(Emp e)
	{
		Session session=EmpUtil.createSession();
		Transaction tr=session.beginTransaction();
		session.saveOrUpdate(e);
		tr.commit();
		session.close();
	}
	public static List<Dept> getAllDept()
	{
		Session session=EmpUtil.createSession();
		List<Dept> list=session.createQuery("from Dept").list();
		session.close();
		return list;
	}
	public static Dept getDept(int eid)
	{
		Session session=EmpUtil.createSession();
		Dept d=session.get(Dept.class, eid);
		session.close();
		return d;
	}
	public static List<Emp> getAllEmp()
	{
		Session session=EmpUtil.createSession();
		List<Emp> list=session.createQuery("from Emp").list();
		session.close();
		return list;
	}
	public static Emp getEmp(int eid)
	{
		Session session=EmpUtil.createSession();
		Emp e=session.get(Emp.class, eid);
		session.close();
		return e;
	}
	public static void deleteEmp(int eid)
	{
		Session session=EmpUtil.createSession();
		Transaction tr=session.beginTransaction();
		Emp e=session.get(Emp.class, eid);
        session.delete(e);
        tr.commit();
		session.close();
		
	}
	public static void deleteDept(int eid)
	{
		Session session=EmpUtil.createSession();
		Transaction tr=session.beginTransaction();
		Dept d=session.get(Dept.class, eid);
        session.delete(d);
        tr.commit();
		session.close();
		
	}
}
