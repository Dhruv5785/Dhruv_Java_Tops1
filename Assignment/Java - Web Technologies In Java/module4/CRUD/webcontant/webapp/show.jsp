<%@page import="com.bean.Student"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.StudentDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<%
    List<Student> list =StudentDao.getAllStudent();
%>
<table boder="1" width="100px" cellpadding="10px" cellspacing="10px">
<tr>
<th>Id</th>
<th>FIRST NAME</th>
<th>LAST NAME</th>
<th>EMAIL</th>
<th>MOBILE</th>
<th>ADDRESS</th>
<th>GENDER</th>
<th>EDIT</th>
<th>DELETE</th>
</tr>
<%
    for(Student s:list)
    {
  %>
  <tr>
  <td><%=s.getId()%></td>
  <td><%=s.getFname() %></td>
  <td><%=s.getLname() %></td>
  <td><%=s.getEmail() %></td>
  <td><%=s.getMobile() %></td>
  <td><%=s.getAddress() %></td>
  <td><%=s.getGender() %></td>
  <td>
  <form name="edit" method="post" action="StudentController">
  <input type="hidden" name="id" value="<%=s.getId()%>">
  <input type="submit" name="action" value="EDIT" class="btn btn-primary">
  </form>
  </td>
  <td>
  <form name="DELETE" method="post" action="StudentController">
  <input type="hidden" name="id" value="<%=s.getId()%>">
  <input type="submit" name="action" value="DELETE" class="btn btn-danger">
  </form>
  </td>
  </tr>
  <% 
    } 
%>
</table>
</body>
<a href="insert.jsp">Add New Student</a>
</html>