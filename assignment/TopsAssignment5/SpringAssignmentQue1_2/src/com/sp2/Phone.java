package com.sp2;

public class Phone {

	String phno;

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}
	
	public void callPhone()
	{
		System.out.println("Call Phone is "+phno);
	}
}
