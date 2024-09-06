package com.lakshmipriyatr.assignment.employee;

public class Employee {
	private String name;
	private int empid;
	private double salary;
	
	public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.empid = employeeId;
        this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
