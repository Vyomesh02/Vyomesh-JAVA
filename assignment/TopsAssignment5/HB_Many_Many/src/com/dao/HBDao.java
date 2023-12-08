package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Student;
import com.model.Subject;
import com.util.HBUtil;

public class HBDao 
{
	Session session=null;
	Transaction tx=null;
	
	
	public void addStudent(Student s)
	{
		session = new HBUtil().getConnectionData();
		tx=session.beginTransaction();
		session.save(s);
		tx.commit();
		session.close();
		System.out.println("Student Record Inserted.. ");
	
	}
	
		public void addSubject(Subject ss) 
		{
			session = new HBUtil().getConnectionData();
			tx=session.beginTransaction();
			session.save(ss);
			tx.commit();
			session.close();
			System.out.println("Subject Record Inserted.. ");
		
	}

}