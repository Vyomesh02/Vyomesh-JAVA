package com.TopsAssignment3;

import java.util.Scanner;

class FactorialNo{
	public int Facto()  {
		System.out.println("Enter the number which Factoral you want : ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int fact=1;
		if(n==0) {
			fact=1;
		}
		else {
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
	}
		return fact;
	}
}

public class Factorial {

	public static void main(String[] args) {
		
		FactorialNo fn = new FactorialNo();
		int factorialValue=fn.Facto();
		System.out.println("factorial : "+factorialValue);
	}

}