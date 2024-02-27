<%@page import="java.util.List"%>
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

<table border="1">
<tr>
<th>Id</th>
<th>Name</th>
<th>Mobile</th>
<th>Email</th>
<th>Address</th>
<th colspan="2">Action</th>

</tr>
<%
List<Emp> emp=(List<Emp>)request.getAttribute("emp");
for(Emp e: emp)
{
%>

<tr>
<td><%=e.getId() %></td>
<td><%=e.getName() %></td>
<td><%=e.getMobile() %></td>
<td><%=e.getEmail() %></td>
<td><%=e.getAddress() %></td>

<td>
<a href="edit/<%=e.getId() %>">Edit</a>
</td>
<td>
<a href="delete/<%=e.getId() %>">Delete</a>
</td>
</tr>
<%} %>
</table>
<br>
<a href="empform">Add New Emp</a>
</body>
</html>