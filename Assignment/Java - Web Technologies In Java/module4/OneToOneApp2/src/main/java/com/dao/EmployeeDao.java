package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.Employee;
import com.bean.EmployeeInfo;
import com.util.EmployeeUtil;

public class EmployeeDao {
	
	public static void insertEmployeeInfo(EmployeeInfo e)
	{
		Session session=EmployeeUtil.createSession();
		Transaction tr=session.beginTransaction();
		session.saveOrUpdate(e);
		tr.commit();
		session.close();
	}
	public static void insertEmployee(Employee e)
	{
		Session session=EmployeeUtil.createSession();
		Transaction tr=session.beginTransaction();
		session.saveOrUpdate(e);
		tr.commit();
		session.close();
	}
   public static List<EmployeeInfo> getAllEmployeeInfo()
   {
	   Session session=EmployeeUtil.createSession();
	   List<EmployeeInfo> list=session.createQuery("from EmployeeInfo").list();
	   session.close();
	   return list;
   }
  
   public static EmployeeInfo getEmployeeInfo(int epid)
   {
	   Session session=EmployeeUtil.createSession();
	   Transaction tr=session.beginTransaction();
	   EmployeeInfo epid1=session.get(EmployeeInfo.class,epid);
	   session.close();
	   return epid1;
   }
   public static Employee getEmployee(int eid)
   {
	   Session session=EmployeeUtil.createSession();
	   Transaction tr=session.beginTransaction();
	   Employee epid1=session.get(Employee.class,eid);
	   session.close();
	   return epid1;
   }
   
}
