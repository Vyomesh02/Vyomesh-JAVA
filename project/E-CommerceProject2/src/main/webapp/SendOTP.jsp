<%@page import="com.learn.mycart.entities.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<head>
      <!-- Basic -->
      <meta charset="utf-8" />
      <meta http-equiv="X-UA-Compatible" content="IE=edge" />
      <!-- Mobile Metas -->
      <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
      <!-- Site Metas -->
      <meta name="keywords" content="" />
      <meta name="description" content="" />
      <meta name="author" content="" />
      <link rel="shortcut icon" href="images/favicon.png" type="">
     
      <!-- bootstrap core css -->
      <link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
      <!-- font awesome style -->
      <link href="css/font-awesome.min.css" rel="stylesheet" />
      <!-- Custom styles for this template -->
      <link href="css/style.css" rel="stylesheet" />
      <!-- responsive style -->
      <link href="css/responsive.css" rel="stylesheet" />
   </head>
<body>
<%@ include file="header.jsp" %>

<%
String email=null;
if(session.getAttribute("otp")==null) 
{
response.sendRedirect("forgotpassword.jsp");
}
else	
{
	User f=(User)session.getAttribute("UserData");
	email=f.getUserEmail();
}
%>
	<!--================Login Box Area =================-->
	<section class="login_box_area section_gap">
		<div class="container">
			<div class="row">
			${notmatch}
				<div class="col-lg-6">
					<div class="login_form_inner">
						<h3>OTP Page</h3>
						<form class="row login_form" action="ForgotController" method="post" id="contactForm" novalidate="novalidate">
							<div class="col-md-12 form-group">
							<label>Email Send On Email Address &emsp;<%=email%></label>
								<input type="text" class="form-control" id="name" name="EnterOTP" placeholder="OTP" onfocus="this.placeholder = ''" onblur="this.placeholder = 'OTP'">
							</div>
							
							
							<div class="col-md-12 form-group">
								<button type="submit" name="action" value="verify" class="primary-btn">Verify</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</section>








<%@ include file="footer.jsp" %>


</body>
</html>