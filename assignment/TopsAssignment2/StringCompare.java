//Compare two string: Comparing topsint.com and topsint.com: true Comparing Topsint.com and topsint.com: false 
package com.TopsAssignment2;

import java.util.Scanner;

public class StringCompare {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String  : ");
		String str1 = sc.nextLine();
		System.out.println("Enter Second String  : ");
        String str2 = sc.nextLine();
		
		System.out.println(str1.equals(str2));;
	}

}
