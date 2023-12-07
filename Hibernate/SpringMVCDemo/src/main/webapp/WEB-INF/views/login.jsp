<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<h1>Login</h1>
<% List<String> list = (List<String>)request.getAttribute("names"); %>
<% for(String s:list) {
%>
<h1>names are <%=s%></h1>
<%} %>
</body>
</html>