//Package to demonstrate encapsulation program
package com.tnsif.encapsulation;

public class Encapsulation {
     private String name;
     private int age;
    private int serialNum;
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}

	@Override
	public String toString() {
		return "Encapsulation [name=" + name + ", age=" + age + ", serialNum=" + serialNum + "]";
	}

	
}

