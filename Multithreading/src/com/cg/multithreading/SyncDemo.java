package com.cg.multithreading;

public class SyncDemo {
	public static void main(String[] args) throws Exception {
	Counter c = new Counter();
	Thread t1 = new Thread(new Runnable() {
	public void run() {
	for (int i=1;i<=1000;i++) {
	c.increment();

	}
	}
	});
	t1.start();
	t1.join();
	Thread t2 = new Thread(new Runnable() {
	public void run() {
	for (int i=1;i<=1000;i++) {
	c.increment();

	}
	}
	});
	t2.start();
	t2.join();
	System.out.println("count" +c.count);


}

}

