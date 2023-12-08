package com.test;

import com.dao.HBDao;
import com.model.Employee;

public class Test 
{

	public static void main(String[] args)
	{
		HBDao dao= new HBDao();
		
		Employee e= new Employee();
		e.setEid(1);
		e.setEname("Rahul");
		e.setCity("Rahul");
		e.setDesg("IT");
		
	   dao.addEmployee(e);
	  // dao.updateEmployee(e);
	  // dao.deleteEmployee(e);
		
	}
}
