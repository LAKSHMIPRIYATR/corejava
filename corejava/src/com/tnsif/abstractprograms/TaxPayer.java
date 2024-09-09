package com.tnsif.abstractprograms;
// Non concrete class
public  abstract class TaxPayer {
	protected double salary; // instance variable 
	public abstract double  calTax(); // abstract method 
	public void display() {
		System.out.println("the tax payed is " + calTax());
	
	}
	public TaxPayer(double salary) {// para constructor 
		super();
		this.salary = salary;
	}

}