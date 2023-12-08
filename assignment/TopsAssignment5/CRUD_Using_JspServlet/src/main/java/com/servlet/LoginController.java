package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.LoginDao;
import com.model.StudentModel;



@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
       public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentModel lmodel= new StudentModel();
		lmodel.setUsername(request.getParameter("username"));
		lmodel.setPassword(request.getParameter("password"));
		
		StudentModel model = new LoginDao().getLogin(lmodel);
		if(model != null)
		{
			HttpSession session=request.getSession(true);
			session.setAttribute("model", model);
			session.setAttribute("userid", model.getUserid());
			session.setMaxInactiveInterval(120);
			response.sendRedirect("HomeController.do?action=showuser&userid="+model.getUserid());
		}
		else
		{
			request.setAttribute("msg", "Invalid username or password");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
		
		
	}

}
