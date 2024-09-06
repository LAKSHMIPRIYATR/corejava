package com.tnsif.threads;

public class SecondWay implements Runnable {
	public static void main(String[] args)
	{
		SecondWay t=new SecondWay();
		Thread th=new Thread();
		th.start();
		//th.start();
		//th.run();
		
	}
	public void run()
	{
		System.out.println("creation of thread by extending thread class");
	}
}
