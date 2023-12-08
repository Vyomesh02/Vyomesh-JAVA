package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.RegistrationDao;
import com.model.StudentModel;



@WebServlet("/RegistrationController")
public class RegistrationController extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentModel smodel=new StudentModel();
		smodel.setFname(request.getParameter("fname"));
		smodel.setLname(request.getParameter("lname"));
		smodel.setEmail(request.getParameter("email"));
		smodel.setMobile(request.getParameter("mobile"));
		smodel.setGender(request.getParameter("gender"));
		smodel.setUsername(request.getParameter("username"));
		smodel.setPassword(request.getParameter("password"));
	    int x= new RegistrationDao().doRegistration(smodel);
		
		if(x>0)
		{
			request.setAttribute("msg", "Record inserted");
			request.getRequestDispatcher("home.jsp").forward(request, response);
		}
			
		else {
			request.setAttribute("msg","record not inserted");
			request.getRequestDispatcher("registration.jsp").forward(request, response);

		}
		
		
		
	}

}
