<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <section class="why_section layout_padding">
       <div class="container">

  <div class="row">
               <div class="col-lg-8 offset-lg-2">
                  <div class="full">
                     <form action="RegisterServlet" method="post">
                        <fieldset>
                           <input type="text" placeholder="Enter your User name" name="user_name" required />
                           <input type="email" placeholder="Enter your email " name="user_email" required />
                           <input type="password" placeholder="Enter Password" name="user_password" required />
                           <input type="text" placeholder="Enter your Mobile " name="user_phone" required />
                           <textarea placeholder="Enter your Address" name="user_address" required></textarea>
                           <input type="submit" value="Submit" />
                        </fieldset>
                     </form>
                  </div>
               </div>
              
            </div>
              </div>
      </section>
</body>
</html>