package com.demo.thread;

public class ThreadCreation {

	public static void main(String[] args) {
		
		MyThread r=new MyThread();
		Thread thread = new Thread(r);
		thread.start();
		
		
	//	r.start();
	
		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
		}
	}
}

class MyThread extends Thread{
	
	public void run(){
		
		for(int i=0;i<10;i++){
			//Thread.yield();
			System.out.println("Child Thread");
			
		}
		
	}
}
