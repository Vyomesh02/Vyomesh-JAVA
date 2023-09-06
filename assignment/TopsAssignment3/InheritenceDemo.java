package com.TopsAssignment3;

class A{
	  public void a1() {
		  System.out.println("This is parents class...");
	  }
	  
}
class B extends A{
	public void b1() {
		System.out.println("This is child class...");
	}
}

public class InheritenceDemo {

	public static void main(String[] args) {
		A a = new A();
		a.a1();
		B b = new B();
		b.b1();
		b.a1();

	}

}
