package com.demo.thread;

public class RunnableUsageDemo {

	public static void main(String[] args) {
		
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);//here r is a Target Runnable
		t.run();
	
		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
		}
	}
}

class MyRunnable implements Runnable{
	
	public void run(){
		
		for(int i=0;i<10;i++){
			System.out.println("Child Thread");
		}
		
	}
}

