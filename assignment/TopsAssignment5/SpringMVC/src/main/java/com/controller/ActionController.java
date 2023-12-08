package com.controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.dao.EmpDao;
import com.model.Employee;
/*@WebServlet("/ActionController")*/
public class ActionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    ApplicationContext a=new ClassPathXmlApplicationContext("Beans.xml");
	EmpDao dao=(EmpDao)a.getBean("dao");
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("Add"))
		{
			Employee e=new Employee();
			e.setName(request.getParameter("name"));
			e.setSalary(Integer.parseInt(request.getParameter("salary")));
			e.setDesg(request.getParameter("desg"));
			
			dao.save(e);
			response.sendRedirect("showemp.jsp");
		}
		else if(action.equalsIgnoreCase("Edit"))
		{
			int id=Integer.parseInt(request.getParameter("id"));
			Employee e=dao.getEmpById(id);
			request.setAttribute("e", e);
			request.getRequestDispatcher("updateemp.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("Update"))
		{
			Employee e=new Employee();
			e.setId(Integer.parseInt(request.getParameter("id")));
			e.setName(request.getParameter("name"));
			e.setSalary(Integer.parseInt(request.getParameter("salary")));
			e.setDesg(request.getParameter("desg"));
			int x=dao.update(e);
			response.sendRedirect("showemp.jsp");
		}
		else if(action.equalsIgnoreCase("Delete"))
		{
			int id=Integer.parseInt(request.getParameter("id"));
			int x=dao.delete(id);
			response.sendRedirect("showemp.jsp");
		}
	}
}