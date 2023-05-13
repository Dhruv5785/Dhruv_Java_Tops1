package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Dept;
import com.bean.Emp;
import com.dao.EmpDao;

public class EmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
		String action=request.getParameter("action");
		
		if(action.equalsIgnoreCase("insert dept"))
		{
			Dept d=new Dept();
			d.setDname(request.getParameter("dname"));
			d.setLocation(request.getParameter("location"));
			d.setJob(request.getParameter("job"));
			EmpDao.insertDept(d);
			response.sendRedirect("dept.jsp");
		}
		else if(action.equalsIgnoreCase("insert Emp"))
		{
			Emp e=new Emp();
			int eid=Integer.parseInt(request.getParameter("dept"));
			Dept d=EmpDao.getDept(eid);
			e.setDept(d);
			e.setEname(request.getParameter("ename"));
			e.setEmail(request.getParameter("email"));
			e.setMobile(request.getParameter("mobile"));
			EmpDao.insertEmp(e);
			response.sendRedirect("emp.jsp");
		}
		else if (action.equalsIgnoreCase("edit"))
		{
			int eid=Integer.parseInt(request.getParameter("eid"));
			Emp e=EmpDao.getEmp(eid);
			request.setAttribute("e", e);
			request.getRequestDispatcher("empupdate.jsp").forward(request, response);
		}
		else if (action.equalsIgnoreCase("update"))
		{
			Emp e=new Emp();
			int eid=Integer.parseInt(request.getParameter("eid"));
			Dept d=EmpDao.getDept(eid);
			e.setDept(d);
			e.setEid(Integer.parseInt(request.getParameter("eid")));
			e.setEname(request.getParameter("ename"));
			e.setEmail(request.getParameter("email"));
			e.setMobile(request.getParameter("mobile"));
			EmpDao.insertEmp(e);
			response.sendRedirect("emp.jsp");
			
		}
		else if (action.equalsIgnoreCase("edit"))
		{
			int eid=Integer.parseInt(request.getParameter("eid"));
			Dept d=EmpDao.getDept(eid);
			request.setAttribute("d", d);
			request.getRequestDispatcher("updatedept.jsp").forward(request, response);
		}
		
		if(action.equalsIgnoreCase("update"))
		{
			Dept d=new Dept();
			int eid=Integer.parseInt(request.getParameter("eid"));
			 Emp e= EmpDao.getEmp(eid);
			 e.setEid(eid);
			 d.setEid(Integer.parseInt(request.getParameter("eid")));
			d.setDname(request.getParameter("dname"));
			d.setLocation(request.getParameter("location"));
			d.setJob(request.getParameter("job"));
			EmpDao.insertDept(d);
			response.sendRedirect("dept.jsp");
		}
		
		else if (action.equalsIgnoreCase("delete"))
		{
			int eid=Integer.parseInt(request.getParameter("eid"));
			EmpDao.deleteEmp(eid);
			response.sendRedirect("empshow.jsp");
		}
		else if (action.equalsIgnoreCase("delete"))
		{
			int eid=Integer.parseInt(request.getParameter("eid"));
			EmpDao.deleteDept(eid);
			response.sendRedirect("deptshow.jsp");
		}
		
		}
}


