package com.cg.multithreading;

public class Counter {
	int count;
	public synchronized void increment() {
	count++; //count =count+1
	}

}
