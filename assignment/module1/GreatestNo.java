package com.TopsAssignment;

import java.util.Scanner;

public class GreatestNo {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a First No : ");
        int n1 = sc.nextInt();
        System.out.print("Enter a Second No : ");
        int n2 = sc.nextInt();
        System.out.print("Enter a Third No :" );
        int n3 = sc.nextInt();
        
        if (n1>n2 && n1>n3) {
        	System.out.print("Greatest no is : "+n1);
		 }
        if (n2>n1 && n2>n3) {
        	System.out.print("Greatest no is : "+n2);
		 }
        if (n3>n2 && n3>n1) {
        	System.out.print("Greatest no is : "+n3);
		 }
        
	}

}
