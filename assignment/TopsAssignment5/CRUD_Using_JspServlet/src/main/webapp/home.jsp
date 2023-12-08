<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 style="color: red;" align="center">Tops Technology</h2>
<h3 style="color: blue;" align="center">Student Details</h3><br><br>
<table  align="center"   border="1">

<tr>
        <th>Userid</th>
         <th>FirstName</th>
         <th>LastName</th>
          <th>Email</th>
         <th>Mobile</th>
         <th>Gender</th>
         <th>Username</th>
         <th>Password</th>
 </tr>
 
<tr>
    <td>${model.userid}</td>
     <td>${model.fname}</td>
    <td>${model.lname}</td>
    <td>${model.email}</td>
    <td>${model.mobile}</td>
    <td>${model.gender}</td>
    <td>${model.username}</td>
    <td>${model.password}</td>
    <td><a href="HomeController.do?action=edituser&userid=${model.userid }">Edit</a></td>
    <td><a href="HomeController.do?action=deleteuser&userid=${model.userid }">Delete</a></td>
    
</tr>

</table>
<br><br><br>
<c:if test="${hmodel.userid>0}">
<form method="post" action="HomeController.do">
<table>

<tr>
    <td>First Name : </td>
    <td><input type="text" name="fname" value="${hmodel.fname }"></td>
</tr>
<tr>
    <td>Last Name : </td>
    <td><input type="text" name="lname" value="${hmodel.lname }"></td>
</tr>
<tr>
    <td>Email : </td>
    <td><input type="email" name="email" value="${hmodel.email }"></td>
</tr>
<tr>
    <td>Mobile : </td>
    <td><input type="text" name="mobile" value="${hmodel.mobile}"></td>
</tr>
<tr>
    <td>Gender : </td>
    <td><input type="radio" name="gender" value="${hmodel.gender }"></td>
</tr>
<tr>
    <td>UserName : </td>
    <td><input type="text" name="username" value="${hmodel.username }"><input type="hidden" name="userid" value="${hmodel.userid }"></td>
</tr>
<tr>
    <td>Password : </td>
    <td><input type="password" name="password" value="${hmodel.password }"><input type="hidden" name="userid" value="${hmodel.userid }"></td>
</tr>
<tr>
    <td><input type="submit" name="Update"></td>
</tr>
</table>
</form>


</c:if>





</body>
</html>