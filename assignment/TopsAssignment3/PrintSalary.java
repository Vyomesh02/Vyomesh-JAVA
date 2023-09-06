package com.TopsAssignment3;
class Members
{
	String name,addr;
	float age,sal;
	String mobNo;
	public void setData() 
	{
		name = "AAA";
		addr = "Ahmedabad";
		age = 25;
		sal = 50000;
		mobNo = "91-9999999999";
	}
	public void displayMembersData()
	{	
		System.out.println("Member Details : ");
	    System.out.println("----------------------------");
		System.out.println("Name       : "+name);
		System.out.println("Address    : "+addr);
		System.out.println("Age        : "+age);
		System.out.println("Mobile No  : "+mobNo);
}
	public void printSalary()
	{
		System.out.println("Salary     : "+sal);
	}
}

public class PrintSalary {

	public static void main(String[] args)
	{
		Members m1 = new Members();
		m1.setData();
		m1.displayMembersData();
		m1.printSalary();
	}

}
