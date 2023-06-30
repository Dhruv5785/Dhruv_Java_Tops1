package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.Employee;
import com.util.EmpUtil;

public class EmployeeDao {

	public static void insertEmp(Employee e)
	{
		Session session = EmpUtil.createSession();
		Transaction tr  = session.beginTransaction();
		session.saveOrUpdate(e);
		tr.commit();
		session.close();
	}
	
	public static List<Employee> getAllEmployee()
	{
		Session session = EmpUtil.createSession();		
		List<Employee> list = session.createQuery("from Employee").list();
		session.close();
		return list;
	}
	
	public static Employee getEmployeeById(int id)
	{
		Session session = EmpUtil.createSession();
		Employee e = session.get(Employee.class, id);
		session.close();
		return e;
	}
	
	public static void deleteEmployee(int id)
	{
		Session session = EmpUtil.createSession();
		Transaction tr = session.beginTransaction();
		Employee e = session.get(Employee.class, id);
		session.delete(e);
		tr.commit();
		session.close();
	}
	
}
