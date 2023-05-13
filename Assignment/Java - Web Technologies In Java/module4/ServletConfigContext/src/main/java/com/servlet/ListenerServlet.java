package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ListenerServlet")
public class ListenerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletContext context;
	@Override
	public void init(ServletConfig config) throws ServletException {
     this.context=config.getServletContext();
	}
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  response.setContentType("text/html");
	  PrintWriter out=response.getWriter();
	  int counter=1;
	  if(context.getAttribute("counter")!=null)
	  {
		  counter=Integer.parseInt(context.getAttribute("counter").toString());
		  counter++;
	  }
	  context.setAttribute("counter",counter);
	  out.println("You Are Visiting This Web Page"+counter+"Times");
	}


}
