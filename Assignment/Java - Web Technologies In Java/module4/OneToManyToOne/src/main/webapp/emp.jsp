<%@page import="com.bean.Dept"%>
<%@page import="com.dao.EmpDao"%>
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
<form name="emp" method="post" action="EmpController">
        <table>
        <tr>
        <td>Select Department</td>
        <td>
            <select name="dept">
            <option>---Select Department---</option>
            <%
              List<Dept> list=EmpDao.getAllDept();
             for(Dept d:list)
             {
                %>
                    <option  value="<%=d.getEid()%>"><%=d.getDname()%></option> 
                <% 
             }
            
            %>
            </select>
        </td>
        </tr>
                 <tr>
                 <td>Employee Name</td>
                 <td><input type="text" name="ename"> </td>
                 </tr>
                 <tr>
                 <td>Email</td>
                 <td><input type="text" name="email"> </td>
                 </tr>
                 <tr>
                 <td>Mobile</td>
                 <td><input type="text" name="mobile"> </td>
                 </tr>
                 <tr>
                 <td colspan="2" align="center">
                 <input type="submit" name="action" value="Insert Emp" class="btn btn-primary">
                 </td>
                 </tr>
      </table>
   <a href="empshow.jsp">Show All Employee</a>
</form>
</body>
</html>