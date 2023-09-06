package com.TopsAssignment3;

abstract class Parents
{
	public void message() {
		
	}
}
class FirstChild extends Parents
{

	@Override
	public void message() {
		System.out.println("This is First Subclass...");
		super.message();
	}
	
	
}
class SecondChild extends Parents
{

	@Override
	public void message() {
	  System.out.println("This is Second Subclass...");
		super.message();
	}
	
}


public class AbstractionQue {

	public static void main(String[] args) {
		FirstChild fc = new FirstChild();
		fc.message();
		SecondChild sc = new SecondChild();
		sc.message();
	}

}
