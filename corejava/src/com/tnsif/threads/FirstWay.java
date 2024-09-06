package com.tnsif.threads;

public class FirstWay  extends Thread {
	public void run()
	{
		System.out.println("creation of thread by extending thread class");
	}
	public static void main(String[] args) {
		
	
	FirstWay ob =new FirstWay();
	//ob.stop();
	ob.start();//runnable
	ob.stop();
	ob.start();
	
	}
}
