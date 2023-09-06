package com.TopsAssignment3;

import java.util.Scanner;

class PrintNumber
{
	public void printn(int n)
	{
		System.out.println("Integer prints..."+n);
	}
	public void printn(float n)
	{
		System.out.println("Float Type no prints..."+n);
	}
   public void printn(double n)
	{
		System.out.println("Double type number prints..."+n);
	}
   public void printn(long n)
  	{
  		System.out.println("Long type number prints..."+n);
  	}
}
public class PrintAllNumberUsingMethodOverride {

	public static void main(String[] args) {
		
		PrintNumber printNo = new PrintNumber();
		printNo.printn(11);
		printNo.printn(33.33f);
		printNo.printn(1234d);
		printNo.printn(1234577777777l);
		}
}


