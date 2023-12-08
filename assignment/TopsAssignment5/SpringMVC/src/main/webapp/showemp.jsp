<%@page import="com.model.Employee"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.EmpDao"%>
<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
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
	ApplicationContext a=new ClassPathXmlApplicationContext("Beans.xml");
	EmpDao studentDao=(EmpDao)a.getBean("dao");
	List<Employee> list=studentDao.getEmployees();
%>
<table border="1">
<tr>
	<th>Id</th>
	<th>Name</th>
	<th>Salary</th>
	<th>Desg</th>
</tr>
<%
	for(Employee e:list)
	{
%>
<tr>
	<td><%=e.getId() %></td>
	<td><%=e.getName() %></td>
	<td><%=e.getSalary() %></td>
	<td><%=e.getDesg() %></td>
	<td><form name="edit" method="post" action="ActionController">
				<input type="hidden" name="id" value="<%=e.getId()%>">
				<input type="submit" name="action" value="EDIT">
			</form></td>
	<td><form name="delete" method="post" action="ActionController">
				<input type="hidden" name="id" value="<%=e.getId()%>">
				<input type="submit" name="action" value="Delete">
			</form></td>
</tr>
<%
	}
%>
</table>
</body>
</html>