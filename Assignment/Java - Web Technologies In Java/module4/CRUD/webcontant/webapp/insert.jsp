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

<b style="color:blue;">
<%
       if(request.getAttribute("msg")!=null)
       {
    	   out.println(request.getAttribute("msg"));
       }
%>
</b>
<form name="insert" method="post" action="StudentController">
       <table>
       <tr>
       <td>First Name</td>
       <td><input type="text" name="fname" ></td>
       </tr>
        <tr>
       <td>Last Name</td>
       <td><input type="text" name="lname"></td>
        <tr>
       <td>Email Id</td>
       <td><input type="text" name="email" ></td>
       </tr>
       <tr>
       <td>Mobile</td>
       <td><input type="text" name="mobile" ></td>
       </tr>
       <tr>
       <td>Address</td>
       <td><textarea rows-"5"  cols="15" name=address></textarea></td>
       </tr>
       <tr>
       <td>Gender</td>
       <td>
       <input type="radio" name="gender" value="male">Male
       <input type="radio" name="gender" value="female">FeMale
       </td>
       </tr>
       <tr>
       <td colspan="2" align="center">
       <input type="submit" name="action" value="INSERT">
       </td>
       </tr>
</table>
</form>
<a href="show.jsp">Show All Student</a>
</body>
</html>