<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
<h1>Hello Home page</h1>
<% 
 	String name=(String)request.getAttribute("name");
	Integer rollNo = (Integer)request.getAttribute("id");
%>

<h1>The Details of Student is</h1>
<h3>Name is : <%= name %></h3>
<h3>Roll Number is : <%= rollNo%></h3>
</body>
</html>