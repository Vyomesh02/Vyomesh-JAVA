package com.TopsAssignment3;

import java.util.Scanner;

public class Exception_ArithmaticVote {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your Age  : ");
			int age= sc.nextInt();
			if(age < 18 ) 
			{
				throw new ArithmeticException("Invalid Age....");
			}
			else
			{
				System.out.println("Welcome To Vote .......");
			}
			
		} catch (ArithmeticException e) {
			
			System.out.println(e);
		}
	}

}
