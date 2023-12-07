<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
	<h1>This is Help Page</h1>
	<%
	String name =(String) request.getAttribute("name");
	String id =(String) request.getAttribute("id");
	%>
	
	<h1>Name is <%= name %></h1>
	<h2>Employee Id is <%=id %></h2>
</body>
</html>