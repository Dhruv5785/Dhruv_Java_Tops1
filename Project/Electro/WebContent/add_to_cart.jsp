<%@page import="com.dao.ProductDao"%>
<%@page import="java.util.List" %>
<%@page import="com.bean.Cart" %>
<%@page import="com.bean.Product" %>
<%@page import="com.dao.CartDao" %>

<% 
    int pid=Integer.parseInt(request.getParameter("pid"));
    Product p=ProductDao.getProductsById(pid);

    int cno=Integer.parseInt(request.getParameter("cno"));   
    Cart c=new Cart();
    c.setPid(pid);
    c.setCno(cno);
    c.setProd_price(p.getProd_price());
    c.setProd_qty(1);
    c.setTotal_price(p.getProd_price());
    CartDao.addToCart(c);
    
    List<Cart> c_list=CartDao.getCartByUser(cno);
	session.setAttribute("cart_count",c_list.size());
    response.sendRedirect("mycart.jsp");
%>