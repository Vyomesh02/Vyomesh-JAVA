package com.TopsAssignment2;

import java.util.Iterator;

public class StringFrequentChar {

	public static void main(String[] args) {
		String str = "successes";
		char[] ch = new char[str.length()];
		int cnt = 0;
		int cnt1=0,cnt2=0, cnt3=0,cnt4=0,cnt5=0,cnt6=0,cnt7=0,cnt8=0;
		//System.out.println(str.toCharArray());
		
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
			System.out.print(" "+ch[i]);
		   }
		for (int i = 0; i <ch.length; i++)
		{
			for (int j = 0; j < ch.length; j++)
			{   
				if(i==0)
				   {
				if(ch[i]==ch[j])
					cnt++;
				   }
				else if(i==1)
				   {
					if(ch[i]==ch[j])
						cnt1++;
					}
				else if(i==2)
				   {
					if(ch[i]==ch[j])
						cnt2++;
					}
				else if(i==3)
				   {
					if(ch[i]==ch[j])
						cnt3++;
					}
				else if(i==4)
				   {
					if(ch[i]==ch[j])
						cnt4++;
					}
			}
		}
		int max = Math.max(cnt,cnt1);
		System.out.println();
		System.out.println("Repeat of "+ch[0]+ " is :"+cnt);
		System.out.println("Repeat of "+ch[1]+ " is :"+cnt1);
		System.out.println("Repeat of "+ch[2]+ " is :"+cnt2);
	//	System.out.println("Repeat of "+ch[3]+ " is :"+cnt3);
		System.out.println("Repeat of "+ch[4]+ " is :"+cnt4);



	}

}
