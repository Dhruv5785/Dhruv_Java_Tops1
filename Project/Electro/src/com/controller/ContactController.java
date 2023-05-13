package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Contact;
import com.dao.ContactDao;

@WebServlet("/ContactController")
public class ContactController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		
		if(action.equalsIgnoreCase("submit")) {
			Contact a=new Contact();
			a.setFname(request.getParameter("fname"));
			a.setLname(request.getParameter("lname"));
			a.setEmail(request.getParameter("email"));
			a.setSuggestions(request.getParameter("suggestions"));
			ContactDao.insertUser(a);
			response.sendRedirect("index.jsp");
			
		}
	}

}
