package com.sp2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_DI_SetGet {

	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
		Person p1 = (Person) context.getBean("p1");
		p1.callperson();
	}
}
