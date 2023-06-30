package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Cart;
import com.dao.CartDao;

@WebServlet("/CartController")
public class CartController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int cid=Integer.parseInt(request.getParameter("cid"));
		int prod_qty=Integer.parseInt(request.getParameter("prod_qty"));
		
		Cart c=CartDao.getCartByCid(cid);
		c.setProd_qty(prod_qty);
		int total_price=(c.getProd_price()*prod_qty);
		c.setTotal_price(total_price);
		CartDao.updateCart(c);
		response.sendRedirect("mycart.jsp");
	}
}
