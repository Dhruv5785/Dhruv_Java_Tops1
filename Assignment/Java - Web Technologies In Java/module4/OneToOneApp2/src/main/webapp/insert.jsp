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
<form name="insert" method="post" action="EmployeeController">
<table>
<tr>
<td>First Name</td>
<td><input type="text" name="fname"></td>
</tr>
<tr>
<td>Last Name</td>
<td><input type="text" name="lname"></td>
</tr>
<tr>s
<td>Mobile</td>
<td><input type="text" name="mobile"></td>
</tr>
<tr>
<td>Address</td>
<td><textarea rows="3" cols="22" name="address"></textarea></td>
</tr>
<tr>
<tr>
<td>User Name</td>
<td><input type="text" name="uname"></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="password"></td>
</tr>
<tr>
<td colspan="2" align="center">
<input type="submit" name="action" value="Insert" class="btn btn-primary">
</td>
</tr>
</table>
</form>
<a href="show.jsp">Show All Employee</a>

</body>
</html>