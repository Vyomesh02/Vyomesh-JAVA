package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Employee;
import com.util.HBUtil;

public class HBDao {
	
	Session session =null;
	Transaction tx=null;
	
	public void addEmployee(Employee e)
	{
		session=new HBUtil().getConnectionData();
		tx=session.beginTransaction();
		session.save(e);
		tx.commit();
		session.close();
		System.out.println("Employee Record inserted");
	}
	public void updateEmployee(Employee e)
	{
		session=new HBUtil().getConnectionData();
		tx=session.beginTransaction();
		session.update(e);
		tx.commit();
		session.close();
		System.out.println("Employee Record updated");
	}
	public void deleteEmployee(Employee e)
	{
		session=new HBUtil().getConnectionData();
		tx=session.beginTransaction();
		session.delete(e);
		tx.commit();
		session.close();
		System.out.println("Employee Record Deleted");
	}

}
