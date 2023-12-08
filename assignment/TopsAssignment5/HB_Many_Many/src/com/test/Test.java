package com.test;

import java.util.Collection;
import java.util.HashSet;

import com.dao.HBDao;
import com.model.Student;
import com.model.Subject;



public class Test 
{
	public static void main(String[] args) 
	{
		HBDao dao=new HBDao();
		
		Collection<Subject> subject = new HashSet<Subject>();
		
		Subject ss= new Subject();
		ss.setSubname("Java");
		ss.setDuration("4.5 month");
		dao.addSubject(ss);
		
		Subject ss1 = new Subject();
		ss1.setSubname("St");
		ss1.setDuration("3 month");
		dao.addSubject(ss1);
		
		subject.add(ss);
		subject.add(ss1);
		
		Student s1 = new Student();
		s1.setSname("Rahul");
		s1.setCity("S.nagar");
		s1.setSubject(subject);
		dao.addStudent(s1);
		
		Student s2 = new Student();
		s2.setSname("Vyomesh");
		s2.setCity("Baroda");
		s2.setSubject(subject);
		dao.addStudent(s2);
	
		
	}
}
