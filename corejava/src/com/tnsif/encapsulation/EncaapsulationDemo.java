package com.tnsif.encapsulation;

public class EncaapsulationDemo {

	public static void main(String[] args) {
		Encapsulation ob=new Encapsulation();// object creation
	//ob.name="Priya";//calling variables
	//ob.serialNum=33;
	//ob.age=18;
		ob.setAge(18);
		ob.setSerialNum(33);
		ob.setName("Raj");
	System.out.println(ob);
	}

}
