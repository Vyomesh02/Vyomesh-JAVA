package com.TopsAssignment;

import java.util.Scanner;

public class AsciiValueOfChar {

	public static void main(String[] args) {
       System.out.println("Enter a any character   :");
       Scanner sc = new Scanner (System.in);
       String str = sc.next();
       char ch = str.charAt(0);
       int chAscii = (int)ch;
       if(str.length() > 1) {
    	   System.out.println("Error...Enter value is not a Character....");
       }
       else {
       System.out.println("Entered character is          :  "+ch);
       System.out.println("ASCII Value of character is   :  "+chAscii);
       }  
	}

}
