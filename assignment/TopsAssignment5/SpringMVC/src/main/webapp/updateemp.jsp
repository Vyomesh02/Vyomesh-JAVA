<%@page import="com.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Employee e =(Employee)request.getAttribute("e");
%>
<form method="post" action="ActionController">
<table>
<tr>
	<td>Name : </td>
	<td><input type="text" name="name" value="<%= e.getName()%>"></td>
</tr>
<tr>
	<td>Salary : </td>
	<td><input type="text" name="salary" value="<%= e.getSalary()%>"></td>
</tr>
<tr>
	<td>Desg : </td>
	<td><input type="text" name="desg" value="<%= e.getDesg()%>"><input type="hidden" name="id" value="<%= e.getId()%>"></td>
</tr>
<tr>
	<td><input type="submit" name="action" value="Update"></td>
</tr>
</table>
</form>
</body>
</html>