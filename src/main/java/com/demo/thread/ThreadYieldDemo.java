package com.demo.thread;

public class ThreadYieldDemo {

	public static void main(String[] args) {
		MyThread t=new MyThread();
		t.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("main thread");
		}
	}
}


