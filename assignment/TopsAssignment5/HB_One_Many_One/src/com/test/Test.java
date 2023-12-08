package com.test;

import com.dao.HBDao;
import com.model.Department;
import com.model.Employee;



public class Test 
{
	public static void main(String[] args) 
	{
		HBDao dao=new HBDao();
		
		Department d = new Department();
		d.setDname("Computer");
		dao.addDepartment(d);
		
		Employee e= new Employee();
		e.setEname("Rahul");
		e.setDesg("Sr.Dev");
		e.setDept(d);
		
		dao.addEmployee(e);
		
		Employee e1= new Employee();
		e1.setEname("Vyomesh");
		e1.setDesg("Jr.Dev");
		e1.setDept(d);
		
		dao.addEmployee(e1);
	
		
	}
}
