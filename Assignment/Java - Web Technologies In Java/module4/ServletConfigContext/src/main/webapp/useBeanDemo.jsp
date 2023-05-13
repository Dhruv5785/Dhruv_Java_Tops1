<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="test" class="com.bean.Student"/>
<jsp:setProperty property="id" name="test" value="1"/>
<jsp:setProperty property="sname" name="test" value="jigar"/>
<h1>Get Data</h1>
<jsp:getProperty property="id" name="test"/>
<jsp:getProperty property="sname" name="test"/>
</body>
</html>