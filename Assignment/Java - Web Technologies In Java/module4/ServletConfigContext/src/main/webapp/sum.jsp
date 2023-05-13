<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page errorPage="error.jsp"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="sum" method="post" action="welcome.jsp">
<input type="text" name="num1" placeholder="Enter Number 1">
<br>
<input type="text" name="num2" placeholder="Enter Number 2">
<br>
<input type="submit" name="action" value="SUBMIT">
</form>
<%
    if(request.getParameter("num1")!=null)
    {
    int num1=Integer.parseInt(request.getParameter("num1"));
    int num2=Integer.parseInt(request.getParameter("num2"));
    int x=num1/num2;
    out.println("Division:"+x);
    }
%>
</body>
</html>