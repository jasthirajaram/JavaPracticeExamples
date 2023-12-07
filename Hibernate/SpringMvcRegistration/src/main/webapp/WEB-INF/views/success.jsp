<%@page import="com.motivity.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success page</title>
<style type="text/css">
h3 {
	text-align: center;
}
</style>
</head>
<body>
	<%
	/* String email = (String) request.getAttribute("email");
	String userName = (String) request.getAttribute("userName");
	String password = (String) request.getAttribute("password"); */
	User user = (User) request.getAttribute("user");
	String email = user.getEmail();
	String userName = user.getUserName();
	String password = user.getPassword();

	String header = (String) request.getAttribute("Header");
	String footer = (String) request.getAttribute("footer");
	%>
	<h1>Done with your registration</h1>
	<h1>Details of your Registration are :</h1>
	<h3>
		<%=header%>
	</h3>
	<h3>
		<%=footer%>
	</h3>
	<hr>
	<h3>
		User Name is
		<%=userName%></h3>
	<h3>
		User Password is
		<%=password%></h3>
	<h3>
		User Email Id is
		<%=email%></h3>

</body>
</html>