<%@page import="com.learn.mycart.entities.User"%>
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
      <title>Famms - Fashion HTML Template</title>
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


<%
    User user1 = (User) session.getAttribute("current-user");

%>
<!-- header section strats -->
         <header class="header_section">
            <div class="container">
               <nav class="navbar navbar-expand-lg custom_nav-container ">
                  <a class="navbar-brand" href="index.html"><img width="250" src="images/logo.png" alt="#" /></a>
                  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                  <span class=""> </span>
                  </button>
                  <div class="collapse navbar-collapse" id="navbarSupportedContent">
                     <ul class="navbar-nav">
                        <li class="nav-item active">
                           <a class="nav-link" href="normal.jsp">Home <span class="sr-only">(current)</span></a>
                        </li>
                      
                    
                        <li class="nav-item">
                           <a class="nav-link" href="product.jsp">Products</a>
                        </li>
                        
                           <li class="nav-item dropdown">
                           <a class="nav-link dropdown-toggle" href="<%=  user1.getUserType().equals("admin") ? "admin.jsp" : "normal.jsp"%>" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="true"> <span class="nav-label"><%= user1.getUserName()%><span class="caret"></span></a>
                           <ul class="dropdown-menu">
                              <li> <a  href="LogoutServlet">Logout </a></li>
                           </ul>
                        </li>
                    <!--     <li class="nav-item">
                           <a class="nav-link" href="blog_list.jsp">Blog</a>
                        </li> -->
                       <!--  <li class="nav-item">
                           <a class="nav-link" href="contact.jsp">Contact</a>
                        </li> -->
                        
                        
                        
                    <%--       <li class="nav-item">
                          
                           <a class="nav-link" href="<%=  user1.getUserType().equals("admin") ? "admin.jsp" : "normal.jsp"%>"><%= user1.getUserName()%> </a>
                          
                          </li>
                            <li class="nav-item">
                          
                           <a class="nav-link" href="LogoutServlet">Logout </a>
                          
                          </li> --%>
                        
                        
                        
                        <li  class="nav-item">
                        
                          <a  class="nav-link" href="">MyCart</a>
        <button class="navbar-toggler" type="button" data-toggle="modal" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
                        </li>
                        <li style="margin-left: -30px;" class="nav-item">
                        <a class="nav-link" href="#!" data-toggle="modal" data-target="#cart">  <i class="fa fa-cart-plus"  style="font-size: 20px;"></i> <span class="ml-0 cart-items">(0)</span>  </a>
                        
                        </li>
       
                        

                     </ul>
                  </div>
               </nav>
            </div>
         </header>
         <!-- end header section 
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