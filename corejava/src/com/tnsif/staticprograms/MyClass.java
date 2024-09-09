package com.tnsif.staticprograms;

public class MyClass {
	
	
	private int section;// instance
	static int srNo;// static variable
	
	static {
		System.out.println("-----static block-----");
		srNo = 1000;
		
	}

	public MyClass() {
		super();
		
		System.out.println("--- Default consttructor-----");
	}
	static void display() {
		System.out.println("-----static method-----");
		System.out.println(" the serial no is " +srNo ++);
		
	}
	@Override
	public String toString() {
		return "Myclass [section=" + section + "]";// cannot add inside a method 
	}
	


}
