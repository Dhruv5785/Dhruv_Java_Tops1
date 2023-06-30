<%@page import="java.util.List" %>
<%@page import="com.bean.Cart" %>
<%@page import="com.dao.CartDao" %>

<% 
    int cno=Integer.parseInt(request.getParameter("cno"));   
    int pid=Integer.parseInt(request.getParameter("pid"));
    Cart c=new Cart();
    c.setCno(cno);
    c.setPid(pid);
    CartDao.removeFromCart(cno, pid);
    List<Cart> c_list=CartDao.getCartByUser(cno);
	session.setAttribute("cart_count",c_list.size());
    response.sendRedirect("mycart.jsp");
%>