package com.TopsAssignment3;

import java.util.Scanner;

class AtmLowBalanceException extends  Exception{
	
	double amount;

	public AtmLowBalanceException(double amount) {
		super();
		this.amount = amount;
	}
}
class ATM 
{
	double balance;
	public void deposit(double amount)
	{
		balance=balance+amount;
		System.out.println(amount+" Rs is Deposited.....");
	}
	public void withdrawl(double amount) throws AtmLowBalanceException
	{
		if(amount <= balance)
		{
			balance=balance-amount;
			System.out.println(amount+" Rs withdrawl Successfully...");
		}
		else
		{
			double needs=amount-balance;
			throw new AtmLowBalanceException(needs);
		}
	}
}

public class CustomException {

	public static void main(String[] args) {
		ATM atm= new ATM();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount For Deposit..");
		double amount=sc.nextDouble();
		atm.deposit(amount);
		System.out.println("Enter Amount For Withdrawl..");
		 amount=sc.nextDouble();
		 try {
			atm.withdrawl(amount);
		} catch (AtmLowBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Sorry, insufficient balance, you need more "+e.amount+" To perform this transaction.");
		}
	}

}
