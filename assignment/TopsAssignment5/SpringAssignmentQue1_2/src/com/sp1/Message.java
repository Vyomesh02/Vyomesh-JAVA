package com.sp1;

public class Message {

	String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public void init()
	{
		System.out.println("Init is Initilized....");
	}
	public void destroy()
	{
		System.out.println("Destroy is processing....");
	}
	
}
