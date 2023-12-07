<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>About page</title>
</head>
<body>
<h1>Hello world from about</h1>
<h1> <%
		String s=(String)request.getAttribute("name");
		%>
		<h1>name is <%= s  %></h1>
</h1>
</body>
</html>