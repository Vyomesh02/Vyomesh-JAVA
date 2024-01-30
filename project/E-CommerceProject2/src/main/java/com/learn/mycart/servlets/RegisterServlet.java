package com.learn.mycart.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.tagext.TryCatchFinally;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.learn.mycart.entities.User;
import com.learn.mycart.helper.FactoryProvider;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/*
	 * protected void processRequest(HttpServletRequest request,HttpServletResponse
	 * response) { response.setContentType("text/html;charset=UTF-8");
	 * 
	 * }
	 */

	public RegisterServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		/*
		 * try { String userName=request.getParameter("user_name"); String
		 * userEmail=request.getParameter("user_email"); String
		 * userPassword=request.getParameter("user_password"); String
		 * userPhone=request.getParameter("user_phone"); String
		 * userAddress=request.getParameter("user_address");
		 * 
		 * 
		 * Server side validation use here
		 * 
		 * if(userName.isEmpty()) { out.println("Name is blank...") }
		 * 
		 * 
		 * creating user object to store data
		 * 
		 * User user=new User(userName, userEmail, userPassword, userPhone,
		 * "default.jpg", userAddress); Session hibernateSession=
		 * FactoryProvider.getFactory().openSession(); Transaction tx=
		 * hibernateSession.beginTransaction(); int userId= (int)
		 * hibernateSession.save(user);
		 * 
		 * tx.commit(); hibernateSession.close(); PrintWriter out =
		 * response.getWriter(); out.println("successfully saved");
		 * out.println("<br> Userid is "+userId);
		 * 
		 * } catch (Exception e) { e.printStackTrace(); }
		 */

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			String userName=request.getParameter("user_name");
			String userEmail=request.getParameter("user_email");
			String userPassword=request.getParameter("user_password");
			String userPhone=request.getParameter("user_phone");
			String userAddress=request.getParameter("user_address");
			
			/*
			 * Server side validation use here
			 * 
			 * if(userName.isEmpty()) { out.println("Name is blank...") }
			 */
			
			/* creating user object to store data */
			
			User user=new User(userName, userEmail, userPassword, userPhone, "default.jpg", userAddress,"normal");
			Session hibernateSession= FactoryProvider.getFactory().openSession();
		   Transaction tx= hibernateSession.beginTransaction();
		   int userId= (int) hibernateSession.save(user);
		   
		   tx.commit();
		  hibernateSession.close();
		  
		  HttpSession htttpSession =request.getSession();
		  htttpSession.setAttribute("message", "Registration Successful !! User Id is :"+userId);
		  response.sendRedirect("registration.jsp");
		  return;
		  
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
