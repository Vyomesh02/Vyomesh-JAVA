package com.TopsAssignment;

import java.util.Scanner;

public class ExpressionOfn {

	public static void main(String[] args) {
		
		System.out.print("Enter the value of n : ");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		int expVal = n +(n*n) + (n*n*n);
		System.out.println("Value of Expression (n +nn + nnn) is  : "+expVal);
		
	}

}
