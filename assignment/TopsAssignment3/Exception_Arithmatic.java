package com.TopsAssignment3;

import java.util.Scanner;

public class Exception_Arithmatic {

	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter First Number : ");
			int n1=sc.nextInt();
			System.out.print("Enter Second Number : ");
			int n2=sc.nextInt();
			int div = n1/n2;
			
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Divide by zero not allowed....");
			
			
		}finally {
			System.out.println("Programm is completed ......");
		}
		
		
	}

}
