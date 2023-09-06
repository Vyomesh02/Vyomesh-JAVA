// Write a Java program that reads a positive integer and count the number of digits of the number

package com.TopsAssignment2;

import java.util.Scanner;

public class CountNoOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt=0;
		System.out.println("Enter the Number.....:");
		int num = sc.nextInt();
		
		while(num!=0) {
			num = num/10;
			cnt++;
          } 
		System.out.println("Number of Digits is : "+cnt);
	}

}

