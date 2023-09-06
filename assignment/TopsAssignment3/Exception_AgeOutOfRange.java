package com.TopsAssignment3;

import java.util.jar.Attributes.Name;

class AgeNotWithinRangeException extends Exception
{
	
}
class NameNotValidException extends Exception
{
	
}
class Student
{
	int rollNo,age;
	String name,course;
	public Student(int rollNo, int age, String name, String course) {
		super();
		this.rollNo = rollNo;
		this.age = age;
		this.name = name;
		this.course = course;
	}
	public void displayStudentDetails()
	{
		System.out.println("Student Details  :");
		System.out.println("----------------------");
		System.out.println("Name     : "+name);
		System.out.println("Roll No  : "+rollNo);
		System.out.println("Age      : "+age);
		System.out.println("Course   : "+course);
	}
	
}

public class Exception_AgeOutOfRange {

	public static void main(String[] args) throws Exception {
		Student s1 = new Student(1, 10, "Vyomesh1","Java");
		int age=0;
		String name = null;
		for(int i=0;i<name.length();i++) 
		{
			if(Character.isDigit(name.charAt(i))) throw new NameNotValidException();
		}
	   if(age<15 || age>21) throw new AgeNotWithinRangeException();
	   else
	   s1.displayStudentDetails();
		
		
		

	}

}
