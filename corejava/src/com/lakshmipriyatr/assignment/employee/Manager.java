package com.lakshmipriyatr.assignment.employee;

public class Manager extends Employee {
	private String dept;
	
	public Manager(String name, int empid, double salary, String dept) {
        super(name, empid, salary); // Call to Employee constructor
        this.dept = dept;
	}
	
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}


}
