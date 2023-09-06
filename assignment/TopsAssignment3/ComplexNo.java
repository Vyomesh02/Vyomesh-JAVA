package com.TopsAssignment3;

import java.util.Scanner;

class Complex
{
	double real1,real2;
	double img1,img2;
	
	public void ComplexNO1(double real1, double img1) {
		
		this.real1 = real1;
		this.img1 = img1;
		//System.out.println("First complex no is  :"+this.real1+"+ i"+this.img1);
	}
public void ComplexNO2(double real2, double img2)
   {
		
		this.real2 = real2;
		this.img2 = img2;
		System.out.println("First complex no is  :"+this.real1+"+ i"+this.img1);
		System.out.println("Second complex no is  :"+this.real2+"+ i"+this.img2);
	}
public void sum()
   {
	double sumReal = this.real1+this.real2;
	double sumImg = this.img1+this.img2;
	System.out.println("Sum of two complex no   :"+sumReal+" + i "+sumImg);
  }
public void product()
{
	double proReal = (this.real1*this.real2)-(this.img1*this.img2);
	double proImg = (this.real1*this.img2)+(this.img1*this.real2);
	System.out.println("Product of two complex no :"+proReal+" + i "+proImg);
	
}
}

public class ComplexNo {

	public static void main(String[] args) {
		Complex cmp = new Complex();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of First complex no :");
		cmp.ComplexNO1(sc.nextDouble(),sc.nextDouble());
		System.out.println("Enter value of second complex no :");
        cmp.ComplexNO2(sc.nextDouble(),sc.nextDouble());
		cmp.sum();
		cmp.product();
	}

}
