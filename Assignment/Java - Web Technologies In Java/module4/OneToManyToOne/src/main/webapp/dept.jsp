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
<form name="dept" method="post" action="EmpController">
        <table>
                 <tr>
                 <td>Department Name</td>
                 <td><input type="text" name="dname"> </td>
                 </tr>
                 <tr>
                 <td>Location</td>
                 <td><input type="text" name="location"> </td>
                 </tr>
                 <tr>
                 <td>Job</td>
                 <td><input type="text" name="job"> </td>
                 </tr>
                 <tr>
                 <td colspan="2" align="center">
                 <input type="submit" name="action" value="Insert Dept" btn btn-danger >
                 </td>
                 </tr>
      </table>

</form>
<a href="empshow.jsp">Show All Department</a>
</body>
</html>