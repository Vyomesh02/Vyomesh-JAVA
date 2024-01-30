<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
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
      <title>Password Reset Page</title>
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
 <!-- inner page section -->
      <section class="inner_page_head">
         <div class="container_fuild">
            <div class="row">
               <div class="col-md-12">
                  <div class="full">
                     <h3>!! Reset password Here !!</h3>
                  </div>
               </div>
            </div>
         </div>
      </section>
      <!-- end inner page section -->
      <!-- why section -->
      
      	
 
      
      
    <!--   forgot password box  -->
      
	<section class="login_box_area section_gap">
		<div class="container">
			<div class="row">
			${invalidemail }
				<div class="col-lg-6">
					<div class="login_form_inner">
						<h3>Reset Password Page</h3>
						<%if(request.getAttribute("Otpmatch")!=null) {%>
						<form class="row login_form" action="ForgotController" method="post" id="contactForm" novalidate="novalidate">
							<div class="col-md-12 form-group">
								<input type="password" class="form-control" id="name" name="newpassword" placeholder="New Password" onfocus="this.placeholder = ''" onblur="this.placeholder = 'NewPassword'">
							</div>
							<div class="col-md-12 form-group">
								<input type="password" class="form-control" id="name" name="Cpassword">
							</div>
							
							
							<div class="col-md-12 form-group">
								<button type="submit" name="action" value="confirm" class="primary-btn">Confirm</button>
							</div>
						</form>
						<%}
else
{
	response.sendRedirect("SendOTP.jsp");
}
%>
					</div>
				</div>
			</div>
		</div>
	</section>
      
   <!--    forgot pasword box end -->
      <!-- end why section -->
      <!-- arrival section -->
      <section class="arrival_section">
         <div class="container">
            <div class="box">
               <div class="arrival_bg_box">
                  <img src="images/arrival-bg.png" alt="">
               </div>
               <div class="row">
                  <div class="col-md-6 ml-auto">
                     <div class="heading_container remove_line_bt">
                        <h2>
                           #NewArrivals
                        </h2>
                     </div>
                     <p style="margin-top: 20px;margin-bottom: 30px;">
                        Vitae fugiat laboriosam officia perferendis provident aliquid voluptatibus dolorem, fugit ullam sit earum id eaque nisi hic? Tenetur commodi, nisi rem vel, ea eaque ab ipsa, autem similique ex unde!
                     </p>
                     <a href="product.jsp">
                     Shop Now
                     </a>
                  </div>
               </div>
            </div>
         </div>
      </section>
      <!-- end arrival section -->
      <%@ include file="footer.jsp" %>
       
        <!-- jQery -->
      <script src="js/jquery-3.4.1.min.js"></script>
      <!-- popper js -->
      <script src="js/popper.min.js"></script>
      <!-- bootstrap js -->
      <script src="js/bootstrap.js"></script>
      <!-- custom js -->
      <script src="js/custom.js"></script>
</body>
</html>