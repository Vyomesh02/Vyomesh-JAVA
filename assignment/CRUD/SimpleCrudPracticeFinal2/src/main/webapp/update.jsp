<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Edit Form</h1>
${msg }
	<form name="register" method="post" action="HomeController">
	
		<table>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name" value="${m.name }"></td>
			</tr>
			<tr>
				<td>Mobile</td>
				<td><input type="text" name="mobile" value="${m.mobile }"></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="email" name="email" value="${m.email }"></td>
			</tr>
	
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" value="${m.password }">
				<input type="hidden" name="id" value="${m.id }"></td>
			</tr>
			<tr>
				<td><input type="submit" name="action" value="Update"></td>
			</tr>
		</table>
	</form>

</body>
</html>