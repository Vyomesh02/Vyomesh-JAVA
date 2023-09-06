package com.TopsAssignment3;

abstract class Bank
{
	 abstract void getBalance();
}
class BankA extends Bank
{

	@Override
	void getBalance() {
		System.out.println("$100 deposited in BankA....");
	}
	
}
class BankB extends Bank
{

	@Override
	void getBalance() {
		System.out.println("$150 deposited in BankB ....");
		
	}
	
}
class BankC extends Bank
{

	@Override
	void getBalance() {
		System.out.println("$200 deposited in BankC....");
	}
	
}

public class BankAbstraction2 {

	public static void main(String[] args) {
		BankA bankA = new BankA();
		bankA.getBalance();
		BankB bankB = new BankB();
		bankB.getBalance();
		BankC bankC = new BankC();
		bankC.getBalance();
	}

}
