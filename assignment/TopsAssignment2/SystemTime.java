package com.TopsAssignment2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SystemTime {

	public static void main(String[] args) 
	{
		Date d1 = new Date();
		System.out.println(d1);
		
		SimpleDateFormat s1 = new SimpleDateFormat("dd/mm/yyyy");
		System.out.println("Today Date is : "+s1.format(d1));
	}

}
