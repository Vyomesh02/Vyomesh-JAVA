package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dao.HomeDao;
import com.model.StudentModel;


@WebServlet("/HomeController.do")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public HomeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		if(action.equals("showuser")) {
			int userid=Integer.parseInt(request.getParameter("userid"));
			StudentModel model=new HomeDao().verifyUser(userid);
			request.setAttribute("model", model);
			request.getRequestDispatcher("home.jsp").forward(request, response);
		}
		else if(action.equals("edituser"))
		{
			int userid=Integer.parseInt(request.getParameter("userid"));
			StudentModel hmodel=new HomeDao().verifyUser(userid);
			request.setAttribute("hmodel", hmodel);
			request.getRequestDispatcher("home.jsp").forward(request, response);
         }
		else if(action.equals("deleteuser"))
		{
			int userid=Integer.parseInt(request.getParameter("userid"));
			int x=new HomeDao().deleteUser(userid);
			request.setAttribute("msg","Record deleted...");
			request.getRequestDispatcher("home.jsp").forward(request, response);}
         }
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			StudentModel homemodel=new StudentModel();
			homemodel.setUserid(Integer.parseInt(request.getParameter("userid")));
			homemodel.setFname(request.getParameter("fname"));
			homemodel.setLname(request.getParameter("lname"));
			homemodel.setEmail(request.getParameter("email"));
			homemodel.setMobile(request.getParameter("mobile"));
			homemodel.setGender(request.getParameter("gender"));
			homemodel.setUsername(request.getParameter("username"));
			homemodel.setPassword(request.getParameter("password"));
		    int x=new HomeDao().updateUser(homemodel);
			
			if(x>0)
			{
				response.sendRedirect("HomeController.do?action=showuser&userid="+homemodel.getUserid());
			}
	
	
     }
}
