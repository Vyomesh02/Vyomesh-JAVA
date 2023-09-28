<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- Mobile Specific Meta -->
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<!-- Favicon-->
	<link rel="shortcut icon" href="img/fav.png">
	<!-- Author Meta -->
	<meta name="author" content="CodePixar">
	<!-- Meta Description -->
	<meta name="description" content="">
	<!-- Meta Keyword -->
	<meta name="keywords" content="">
	<!-- meta character set -->
	<meta charset="UTF-8">
	<!-- Site Title -->
	<title>Tops Technology</title>
	<!--
		CSS
		============================================= -->
	<link rel="stylesheet" href="css/linearicons.css">
	<link rel="stylesheet" href="css/font-awesome.min.css">
	<link rel="stylesheet" href="css/themify-icons.css">
	<link rel="stylesheet" href="css/bootstrap.css">
	<link rel="stylesheet" href="css/owl.carousel.css">
	<link rel="stylesheet" href="css/nice-select.css">
	<link rel="stylesheet" href="css/nouislider.min.css">
	<link rel="stylesheet" href="css/ion.rangeSlider.css" />
	<link rel="stylesheet" href="css/ion.rangeSlider.skinFlat.css" />
	<link rel="stylesheet" href="css/magnific-popup.css">
	<link rel="stylesheet" href="css/main.css">
</head>
<body>

<%@ include file="header.jsp" %>

	<!-- Start Banner Area -->
	<section class="banner-area organic-breadcrumb">
		<div class="container">
			<div class="breadcrumb-banner d-flex flex-wrap align-items-center justify-content-end">
				<div class="col-first">
					<h1 style="color:black">Login/Register</h1>
					<nav class="d-flex align-items-center">
						<a href="index.jsp">Home<span class="lnr lnr-arrow-right"></span></a>
						<a href="login.jsp"  >Login/Register</a>
					</nav>
				</div>
			</div>
		</div>
	</section>
	<!-- End Banner Area -->

	<!--================Login Box Area =================-->
	<section class="login_box_area section_gap">
		<div class="container">
			
				<div class="col-lg-6">
					<div class="login_form_inner">
						<h3 >Customer Registration Form</h3>
						<br><br>
				<form class="row login_form" action="CustomerController" method="post" id="contactForm" novalidate="novalidate">
							<div class="col-md-12 form-group">
								<input type="text" class="form-control" id="name" name="firstname" placeholder="Firstrname" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Firstname'">
							</div>
							<div class="col-md-12 form-group">
								<input type="text" class="form-control" id="name" name="lastname" placeholder="Lastname" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Lastname'">
							</div>
							<div class="col-md-12 form-group">
							<tr><td>Student Gender</td>&nbsp;
								<td><input type="radio" class="" id="name" name="gender" value="Male" placeholder="Gender" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Gender'" >Male
								<input type="radio" class="" id="name" name="gender" value="Female" placeholder="Gender" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Gender'" >Female
								</td>
							</tr>
							</div>
							<div class="col-md-12 form-group">
								<input type="text" class="form-control" id="name" name="mobno" placeholder="Mobileno" onfocus="this.placeholder = ''" onblur="this.placeholder = 'MobileNo'">
							</div>
							<div class="col-md-12 form-group">
								<textarea rows="5" cols="30" class="form-control" id="name" name="address" placeholder="Address" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Address'"></textarea>
							</div>
						
							<div class="col-md-12 form-group">
								<input type="email" class="form-control" id="name" name="email" placeholder="Email" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Username'">
							</div>
							<div class="col-md-12 form-group">
								<input type="password" class="form-control" id="name" name="password" placeholder="Password" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Password'">
							</div>
						     <div class="col-md-12 form-group">
								<input type="password" class="form-control" id="name" name="confpw" placeholder="Confirm Password" onfocus="this.placeholder = ''" onblur="this.placeholder = 'confirm Password'">
							</div>
							<div class="col-md-12 form-group">
								<button type="submit" name="action" value="register" class="primary-btn">Register</button>
								<br>
								<button type="submit" name="action" value="register" class="primary-btn">Cancel</button>
								
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--================End Login Box Area =================-->

<%@ include file="footer.jsp" %>


	<script src="js/vendor/jquery-2.2.4.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4"
	 crossorigin="anonymous"></script>
	<script src="js/vendor/bootstrap.min.js"></script>
	<script src="js/jquery.ajaxchimp.min.js"></script>
	<script src="js/jquery.nice-select.min.js"></script>
	<script src="js/jquery.sticky.js"></script>
	<script src="js/nouislider.min.js"></script>
	<script src="js/countdown.js"></script>
	<script src="js/jquery.magnific-popup.min.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<!--gmaps Js-->
	<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCjCGmQ0Uq4exrzdcL6rvxywDDOvfAu6eE"></script>
	<script src="js/gmaps.min.js"></script>
	<script src="js/main.js"></script>


</body>
</html>