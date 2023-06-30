package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Dept;
import com.bean.Emp;
import com.dao.EmpDao;


@WebServlet("/EmpController")
public class EmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		
		
		if(action.equalsIgnoreCase("add department"))
		{
			Dept d = new Dept();
			d.setDname(request.getParameter("dname"));
			d.setLoc(request.getParameter("dloc"));
			EmpDao.insertDept(d);
			response.sendRedirect("dept.jsp");
		}
		else if(action.equalsIgnoreCase("add employee"))
		{
			Emp e = new Emp();
			e.setEname(request.getParameter("ename"));
			e.setJob(request.getParameter("job"));
			int did = Integer.parseInt(request.getParameter("dept"));
			Dept d = EmpDao.getDeptById(did);
			e.setDept(d);
			EmpDao.insertEmp(e);
			response.sendRedirect("emp.jsp");
		}
		
	}

}
