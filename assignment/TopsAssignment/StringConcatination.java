package com.TopsAssignment;

import java.util.Scanner;

public class StringConcatination {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String  : ");
		String str1 = sc.nextLine();
		System.out.println("Enter Second String  : ");
        String str2 = sc.nextLine();
        
       String str3= str1.concat(str2);
       System.out.println(str3);
	}

}
