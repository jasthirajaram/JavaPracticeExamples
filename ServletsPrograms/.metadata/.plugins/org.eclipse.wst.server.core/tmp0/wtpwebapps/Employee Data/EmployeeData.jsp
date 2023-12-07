<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Data</title>
</head>
<body>
	<form action="EmployeeLogin" method="post">
	<h1 style="font-size: x-large;">Employee Login</h1>
		<table>
			<tr>
				<td>Username:</td>
				<td><input type="email" name="email"></td>
			</tr>	
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td><input type="submit" name="Login"></td>
			</tr>
		</table>
	</form>
</body>
</html>