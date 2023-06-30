<%@page import="com.dao.EmpDao"%>
<%@page import="com.bean.Dept"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>

<br>
<h3 align="center">Add Employee</h3>
<hr>
<form name="emp" method="post" action="EmpController">
<table align="center">
<tr>
	<td>Employee Name : </td>
	<td><input type="text" name="ename"></td>
</tr>



<tr>
	<td>Department Name : </td>
	<td>
		<select name="dept">
			<option>------Select-------</option>
			<%
				List<Dept> list = EmpDao.getAllDept();
				for(Dept d : list)
				{
			%>
				<option value="<%=d.getDid()%>"><%=d.getDname()%></option>
			<%		
				}
			%>
		</select>
	</td>
</tr>

<tr>
	<td>Job :  </td>
	<td><input type="text" name="job"></td>
</tr>


<tr>
	<td> </td>
	<td><input type="submit" name="action" value="Add Employee" class="btn btn-danger"></td>
</tr>

</table>

</form>


</body>
</html>