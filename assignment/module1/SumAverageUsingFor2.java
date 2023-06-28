package com.TopsAssignment;

import java.util.Scanner;

public class SumAverageUsingFor2 {
	 
	public static void main(String[] args) {
		
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Five No which sum And Average You want : ");
	     for (int i = 0; i < 5; i++) {
			int num = sc.nextInt();
			sum = sum+num;
		}
	     
	    
	        int avg = sum/5;
	        System.out.println();
	   System.out.println("Sum of five No are : "+sum);
	   System.out.println("Average of Five Nos are :"+avg);
	}

}
