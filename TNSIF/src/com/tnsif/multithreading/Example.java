package com.tnsif.multithreading;
//to demonstrate synchronization
public class Example {
	
synchronized void display() {
		Thread q=Thread.currentThread();
		for(int i=0;i<5;i++) {
			try {
			Thread.sleep(1000);
			System.out.println(q.getName()+" "+i);
		} catch (Exception e) {
			
		}
	}

	}
}
