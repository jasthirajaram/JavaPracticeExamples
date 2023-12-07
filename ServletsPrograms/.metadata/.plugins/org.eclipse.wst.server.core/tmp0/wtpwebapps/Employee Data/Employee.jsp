<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee data</title>
</head>
<style>
</style>
<body>
	<form action="EmployeeRegister" method="post">

		<h1 style="font: bold; font-size: x-large;">Employee Details</h1>
		<table>
			<tr>
				<td>Employee id:</td>
				<td><input type="text" name="eid"></td>
			</tr>
			<tr>
				<td>Employee name:</td>
				<td><input type="text" name="ename"></td>
			</tr>
			<tr>
				<td>Email id:</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td>Department:</td>
				<td><input type="text" name="department"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" name="Update"></td>
			</tr>
		</table>

	</form>
</body>
</html>