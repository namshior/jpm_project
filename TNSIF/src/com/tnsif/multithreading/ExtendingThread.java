package com.tnsif.multithreading;

public class ExtendingThread extends Thread{
@Override

//public void run() {//running state
public void run() {//running state
	System.out.println("welcome");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ExtendingThread e=new ExtendingThread();//new state
e.start();//runnable state

	}

}
