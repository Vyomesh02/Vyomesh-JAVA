<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reset password</title>
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


     <section class="inner_page_head">
         <div class="container_fuild">
            <div class="row">
               <div class="col-md-12">
                  <div class="full">
                     <h3>!! Reset Password Here !!</h3>
                  </div>
               </div>
            </div>
         </div>
      </section>

  <section class="why_section layout_padding">
         <div class="container">
         
            <div class="row">
               <div class="col-lg-8 offset-lg-2">
                  <div class="form-group">
                   <%@include file="message.jsp" %>
                    <form class="form-group" action="ForgotController" method="post" >
							<div class="col-md-12 form-group">
								<input type="text" class="form-control" id="name" name="email" placeholder="Enter your Email" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Email'">
							</div>
						
							
						<div class="col-md-12 form-group">
								<button type="submit" name="action" value="submit" class="primary-btn">Submit</button>
							</div>
								
						
					</form>
                  </div>
               </div>
            </div>
         </div>
      </section>




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