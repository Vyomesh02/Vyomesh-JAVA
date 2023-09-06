package com.TopsAssignment2;

import java.util.Scanner;

public class SumAverageUsingFor {
	 
	public static void main(String[] args) {
		int arr1[]= {0,0,0,0,0};
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Five No which sum And Average You want : ");
	     for (int i = 0; i < 5; i++) {
			arr1[i] = sc.nextInt();
		}
	     System.out.print("Entered five Nos are : ");
	    for (int i = 0; i < 5; i++) {
				System.out.print(arr1[i]+" ");
				 sum = sum + arr1[i];
			}
	        int avg = sum/5;
	        System.out.println();
	   System.out.println("Sum of five No are : "+sum);
	   System.out.println("Average of Five Nos are :"+avg);
	}

}
