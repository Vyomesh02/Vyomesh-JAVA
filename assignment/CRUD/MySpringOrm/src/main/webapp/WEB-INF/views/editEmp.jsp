<%@page import="com.model.Emp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Emp Form</h1>
<%
Emp e=(Emp)request.getAttribute("emp");
%>
<form method="post" action="/ORM/update">
<table>
<tr>
<td>Name:</td>
<td><input type="text" name="name" value="<%=e.getName() %>"></td>
</tr>
<tr>
<td>Mobile:</td>
<td><input type="text" name="mobile" value="<%=e.getMobile() %>"></td>
</tr>
<tr>
<td>Email:</td>
<td><input type="email" name="email" value="<%=e.getEmail() %>"></td>
</tr>

<tr>
<td>Address:</td>
<td><input type="text" name="address" value="<%=e.getAddress() %>">
<input type="hidden" name="id" value="<%=e.getId() %>"></td>
</tr>
<tr>
<td><input type="submit" value="Update"></td>
</tr>
</table>

</form>
</body>
</html>