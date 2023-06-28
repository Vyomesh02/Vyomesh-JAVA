package com.TopsAssignment;

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

