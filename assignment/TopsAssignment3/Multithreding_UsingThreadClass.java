package com.TopsAssignment3;

class MyThread extends Thread
{
    public void run()
    {
    	System.out.println("Thread is Running....");
    }
}

public class Multithreding_UsingThreadClass {

	public static void main(String[] args) {

		MyThread mythread= new MyThread();
		mythread.start();
	}

}
