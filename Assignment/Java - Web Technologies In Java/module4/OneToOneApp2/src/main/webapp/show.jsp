<%@page import="com.dao.EmployeeDao"%>
<%@page import="com.bean.EmployeeInfo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
<form>
<table border="1" width="100%" cellpadding="10px" cellspacing="10px" >
          <tr>
              <td>EMPLOYEEINFO Id</td>
              <td>FIRST NAME</td>
              <td>LAST NAME</td>
              <td>MOBILE</td>
              <td>ADDRESS</td>
              <td>EDIT</td>
              <td>DELETE</td>
           </tr>
           <%
               List<EmployeeInfo> list1=EmployeeDao.getAllEmployeeInfo();
               for (EmployeeInfo epid:list1)
               {
            %>
               <tr>
   <td><%=epid.getEpid()%></td>
   <td><%=epid.getFname() %></td>
   <td><%=epid.getLname()%></td>
   <td><%=epid.getMobile()%></td>
   <td><%=epid.getAddress()%></td>
   <td>
   <form name="edit" method="post" action="StudentController">
   <input type="hidden" name="id" value="<%=epid.getEpid()%>">
   <input type="submit" name="action" value="EDIT" class="btn btn-primary">
   </form>
   </td>
   <td>
   <form name="DELETE" method="post" action="StudentController">
   <input type="hidden" name="id" value="<%=epid.getEpid()%>">
   <input type="submit" name="action" value="DELETE" class="btn btn-danger">
   </form>
   </td>
   </tr>
            <%
            	   
               }
           
           %>  


</table>
</form>
</body>
</html>