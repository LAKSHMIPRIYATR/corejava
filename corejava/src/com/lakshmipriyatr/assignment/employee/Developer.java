package com.lakshmipriyatr.assignment.employee;

public class Developer extends Employee {
	private String progLang;
    
	public Developer(String name, int empid, double salary, String progLang) {
        super(name, empid, salary);
        this.progLang = progLang;
	}
	
	public String getProgLang() {
		return progLang;
	}

	public void setProgLang(String progLang) {
		this.progLang = progLang;
	}
	

}
