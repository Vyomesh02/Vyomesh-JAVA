package com.sp1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_Scope {

	public static void main(String[] args) 
	{
		
	
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
     Information i1 = (Information) context.getBean("i1");
	i1.setName("Vyomesh ");
	System.out.println(i1.getName());
	
	Information i2= (Information) context.getBean("i1");
	i2.setName("Parin");
	System.out.println(i2.getName());
	
	}
}
