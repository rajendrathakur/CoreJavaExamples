package com.demo.thread;

public class ThreadSynchronizationDemo {

	public static void main(String[] args) {

		Display d1 = new Display();
		MySync t1 = new MySync(d1, "dhoni");
		MySync t2 = new MySync(d1, "yuvaraj");
		t1.start();
		t2.start();
	}

}

class Display {
	public synchronized void wish(String name) {
		for (int i = 0; i < 5; i++) {
			System.out.print("good morning:");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name);
		}
	}
}

class MySync extends Thread {
	Display d;
	String name;

	MySync(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}
