<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User login</title>
</head>
<body>
	<form action="UserLogin" method="get">

		Enter Username:<input name="username" type="text" ><br>
		Enter password:<input name="password" type="password" ><br>
		Select choice <select name="choice">
			<option value="Updation">Updation</option>
			<option value="Deletion">Deletion</option>
			<option value="Read">Read</option>
		</select> <input type="submit" value="Login" />

	</form>
</body>
</html>