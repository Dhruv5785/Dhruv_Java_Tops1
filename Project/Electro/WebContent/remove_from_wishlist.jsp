<%@page import="java.util.List" %>
<%@page import="com.bean.Wishlist" %>
<%@page import="com.dao.WishlistDao" %>

<% 
    int pid=Integer.parseInt(request.getParameter("pid"));
    int cno=Integer.parseInt(request.getParameter("cno"));
    Wishlist w=new Wishlist();
    w.setPid(pid);
    w.setCno(cno);
    WishlistDao.removeFromWishlist(cno, pid);
    List<Wishlist> w_list=WishlistDao.getWishlistByUser(cno);
	session.setAttribute("wishlist_count", w_list.size());
    response.sendRedirect("mywishlist.jsp");
%>