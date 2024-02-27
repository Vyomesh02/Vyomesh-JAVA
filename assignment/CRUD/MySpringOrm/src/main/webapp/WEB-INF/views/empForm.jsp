<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div  align="center">
<h1>Employee Register  Form</h1>
<form method="post" action="save">
<table>
<tr>
<td>Name:</td>
<td><input type="text" name="name"></td>
</tr>
<tr>
<td>Mobile:</td>
<td><input type="text" name="mobile"></td>
</tr>
<tr>
<td>Email:</td>
<td><input type="email" name="email"></td>
</tr>
<tr>
<td>Address:</td>
<td><input type="text" name="address"></td>
</tr>
<tr>
<td><input type="submit" value="Add Employee"></td>
</tr>
</table>

</form>
</div>
</body>
</html>