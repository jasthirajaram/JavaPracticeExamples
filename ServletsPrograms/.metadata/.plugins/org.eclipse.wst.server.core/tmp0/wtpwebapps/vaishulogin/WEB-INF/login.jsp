<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>User Login</h2>
<form action="LoginServlet" method="POST">
<table>
<tr><td>Enter name</td><td><input type="text" name="userName"></td></tr>
<tr><td>Enter password</td><td><input type="password" name="userPassword"></td></tr>
<tr><td><input type="submit" value="login"> </td></tr>

</table>

</form>

</body>
</html>