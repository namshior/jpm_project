package com.tnsif.multithreading;

public class Tsync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Example ex=new Example();
T t1=new T(ex);
T t2=new T(ex);
T t3=new T(ex);

t1.start();
t2.start();
t3.start();

	}

}
