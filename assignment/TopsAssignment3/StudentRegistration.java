package com.TopsAssignment3;

import java.util.ArrayList;
import java.util.Scanner;


public class StudentRegistration {

	public static void main(String[] args) {
		
		   Scanner sc = new Scanner(System.in);
		   
		   Scanner sc1 = new Scanner(System.in);
			System.out.println("Welcome to student Registration process");
			System.out.println("-------------------------------");
			System.out.println("Enter your name          :");
			String name = sc.nextLine();
			System.out.println("Enter your Age");
			int age = sc.nextInt();
			System.out.println("Enter your email id       :");
			String email = sc1.nextLine();
			//System.out.println();
			System.out.println("Enter your Address        :");
			String addr = sc1.nextLine();
			System.out.println("Enter your course:");
			String course = sc1.nextLine();
			System.out.println("Enter your Qualification   :");
			String qual = sc1.nextLine();
		   System.out.println("Enter your class duration   :");
		   int time = sc1.nextInt();
		   if(time >= 4) {
			   System.out.println("Your Certificate Genreate Suceesfully...");
			   System.out.println("  :Student Certificate : ");
				  System.out.println("--------------------------------");
				 
				  
				System.out.println("Student Name        :"+name);
				System.out.println("Student Address     :"+addr);
		        System.out.println("Student Age         :"+age);
				System.out.println("Student Emaild      :"+email);
				System.out.println("Student Course      :"+course);
		   }
		   else  {
			   System.out.println("Your course is Incomplete......Please complete your course");
		   }
		  
	}

}
