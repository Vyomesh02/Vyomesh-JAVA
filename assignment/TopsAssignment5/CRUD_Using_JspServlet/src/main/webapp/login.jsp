<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 style="color: red;" align="center">Tops Technology</h2>
<h3 style="color: blue;" align="center">Login Form</h3><br>
<form method="post"  action="LoginController">
<table>
<tr>
    <td>User Name : </td>
    <td><input type="text" name="username"></td>
</tr>
<tr>
    <td>Password : </td>
    <td><input type="password" name="password"></td>
</tr>
<tr>
    <td><input type="submit" name="Login"></td>
</tr>
</table>
</form>
</body>
</html>