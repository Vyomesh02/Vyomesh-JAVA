package com.TopsAssignment3;

import java.util.Scanner;

class Area
{
	 static double l;
	 static double b;
	public void displayArea(double l) {
		System.out.println("Area of Square are  : "+(l*l));
	}

	
	public void displayArea(double l,double b) {
		System.out.println("Area of Reactangle are  : "+(l*b));
	}
}

public class AreaOfReactSquare extends Area  {

	public static void main(String[] args) {
		Area a = new Area();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value of Length :"+l);
		 l = sc.nextDouble();
		System.out.println("Enter a value of Length :"+b);
		 b = sc.nextDouble();
		
		a.displayArea(l);
		a.displayArea(l,b);
	}

}
