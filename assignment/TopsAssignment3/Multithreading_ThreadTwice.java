package com.TopsAssignment3;

class ThreadTwice extends Thread
{
	public void run()
	{
		System.out.println("Thread Started.....");
	}
}

public class Multithreading_ThreadTwice {

	public static void main(String[] args) {

		ThreadTwice t1 = new ThreadTwice();
		
		t1.start();
		t1.start();
		
	}

}
