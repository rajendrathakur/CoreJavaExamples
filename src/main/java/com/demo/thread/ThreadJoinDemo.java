package com.demo.thread;

public class ThreadJoinDemo {

	public static void main(String[] args) throws InterruptedException {

		MyThreadJoin t=new MyThreadJoin();
		t.start();
		t.join();	//--->1
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread");
		}
	}

}

class MyThreadJoin extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Child Thread");
			try
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException e){}
		}
	}
}