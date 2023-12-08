<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add New Student Details</h1>
<form method="post" action="RegistrationController">
<table>
  <tr>
    <td>FirstName:</td>
    <td><input type="text" name="fname"/></td>
 </tr>
  <tr>
    <td>LastName:</td>
    <td><input type="text" name="lname"/></td>
 </tr>
  <tr>
    <td>Email</td>
    <td><input type="email" name="email"/></td>
 </tr>
  <tr>
    <td>Mobile</td>
    <td><input type="text" name="mobile"/></td>
 </tr>
  <tr>
    <td>Gender</td>
    <td><input type="radio" value="Male" name="gender"/>Male</td>
     <td><input type="radio" value="Female" name="gender"/>Female</td>
 </tr>
 <tr>
    <td>User Name : </td>
    <td><input type="text" name="username"></td>
</tr>
 <tr>
   <td>Password:</td><td>
   <input type="password" name="password"/></td>
 </tr>

<tr><td colspan="2"><input type="submit" value="Add Student"/></td></tr>
</table>
</form>
<br/>
<a href="home.jsp">view Student</a>

</body>
</html>