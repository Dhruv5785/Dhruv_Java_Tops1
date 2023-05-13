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

</head>
<body>
<%
   Student s=(Student)request.getAttribute("s");
%>
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
       <td><input type="hidden" name="id" value="<%=s.getId()%>"></td>
       <tr>
       <td>First Name</td>
       <td><input type="text" name="fname" value="<%=s.getFname() %>" ></td>
       </tr>
        <tr>
       <td>Last Name</td>
       <td><input type="text" name="lname" value="<%=s.getLname() %>"></td>
        <tr>
       <td>Email Id</td>
       <td><input type="text" name="email" value="<%=s.getEmail() %>"></td>
       </tr>
       <tr>
       <td>Mobile</td>
       <td><input type="text" name="mobile" value="<%=s.getMobile() %>"></td>
       </tr>
       <tr>
       <td>Address</td>
       <td><textarea rows-"5"  cols="15" name=address><%=s.getAddress() %></textarea></td>
       </tr>
       <tr>
       <td>Gender</td>
       <td>
       <%
       if(s.getGender().equalsIgnoreCase("male"))
       {
    	%>
    	   <input type="radio" name="gender" value="male" checked="checked">Male
          <input type="radio" name="gender" value="female">FeMale
    	<%   
       }
       else if(s.getGender().equalsIgnoreCase("female"))
       {
    	   %>
    	       <input type="radio" name="gender" value="male">Male
               <input type="radio" name="gender" value="female" checked="checked">FeMale
    	   <%  
       }
       else
       {
    	   %>
    	       <input type="radio" name="gender" value="male">Male
               <input type="radio" name="gender" value="female">FeMale
    	   <% 
       }
       %>
       </td>
       </tr>
       <tr>
       <td colspan="2" align="center">
       <input type="submit" name="action" value="UPDATE">
       </td>
       </tr>
</table>
</form>
<a href="show.jsp">Show All Student</a>
</body>
</html>