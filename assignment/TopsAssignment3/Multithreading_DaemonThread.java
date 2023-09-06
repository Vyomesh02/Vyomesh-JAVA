package com.TopsAssignment3;

class TestDaemonThread extends Thread
{
	public void run()
	{
		if (Thread.currentThread().isDaemon()) {
			System.out.println("Daemon Thread is Running....");
		}
		else
		{
			System.out.println("User thread is Running...");
		}
	}
}

public class Multithreading_DaemonThread {

	public static void main(String[] args) {

		TestDaemonThread t1 = new TestDaemonThread();
		TestDaemonThread t2 = new TestDaemonThread();
		t1.start();
		t1.setDaemon(true);// will throw exception
		t2.start();
	}

}
