<%@page import="com.bean.Dept"%>
<%@page import="com.bean.Emp"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.EmpDao"%>
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
<table border="2" width="100%" >
    <tr>
    <td>EId</td>
    <td>Employee Name</td>
    <td>Email</td>
    <td>Mobile</td>
    <td>EDIT</td>
    <td>DELETE</td>
    </tr>
    <%
           List<Emp> list=EmpDao.getAllEmp();
           for(Emp e:list)
           {
    %>
    <tr>
        <td><%=e.getEid() %></td>
        <td><%=e.getEname() %></td>
        <td><%=e.getEmail() %></td>
        <td><%=e.getMobile()%></td>
        <td>
             <form name="edit" method="post" action="EmpController">
              <input type="hidden" name="eid" value="<%=e.getEid()%>">
             <input type="submit" name="action" value="EDIT" class="btn btn-primary">
              </form>
        </td>
        <td>
             <form name="delete" method="post" action="EmpController">
              <input type="hidden" name="eid" value="<%=e.getEid()%>">
             <input type="submit" name="action" value="DELETE" class="btn btn-danger">
              </form>
        </td>
    </tr>
    <%
        }
    %>
</table>
<a href="emp.jsp">Add New Employee</a>
<table border="2" width="100%" >
          <tr>
                 <td>Department Id</td>
                 <td>Department Name</td>
                 <td>Location</td>
                 <td>Job</td>
                 <td>EDIT</td>
                 <td>DELETE</td>
          </tr>
        <%
          List<Dept> list1=EmpDao.getAllDept();
           for(Dept d:list1)
           {
        
        %>
                <tr>
                <td><%=d.getEid() %></td> 
                <td><%=d.getDname() %></td> 
                <td><%=d.getLocation() %></td> 
                <td><%=d.getJob() %></td> 
                <td>
                   <form name="edit" method="post" action="EmpController">
                   <input type="hidden" name="eid" value="<%=d.getEid()%>">
                   <input type="submit" name="action" value="EDIT" class="btn btn-primary">
                    </form>
              </td>
        <td>
                  <form name="delete" method="post" action="EmpController">
                   <input type="hidden" name="eid" value="<%=d.getEid()%>">
                   <input type="submit" name="action" value="DELETE" class="btn btn-danger">
                   </form>
        </td>
        </tr>
        <%
           }
        %> 

</table>
<a href="dept.jsp">Add New Department</a>

</body>
</html>