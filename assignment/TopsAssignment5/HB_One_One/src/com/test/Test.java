package com.test;

import com.dao.HBDao;
import com.model.Employee;
import com.model.ProfileDetails;

public class Test 
{
	public static void main(String[] args) 
	{
		HBDao dao=new HBDao();
		
		ProfileDetails p=new ProfileDetails();
		p.setAddress("Kalol");
		p.setState("Gujarat");
		p.setCity("Vadodara");
		
		dao.addProfile(p);
		
		Employee e =new Employee();
		e.setEname("Vyomesh");
		e.setPd(p);
		e.setDesg("Sr.Devloper");
		
		dao.addEmployee(e);
	}
}
