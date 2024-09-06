package com.lakshmipriyatr.assignment.utilities;

import com.lakshmipriyatr.assignment.employee.*;

public class EmployeeUtilities {

	  public void displayEmployeeDetails(Employee employee)
	  {
	        System.out.println("Name: " + employee.getName());
	        System.out.println("Employee ID: " + employee.getEmpid());
	        System.out.println("Salary: " + employee.getSalary());

	        if (employee instanceof Manager) 
	        {
	            System.out.println("Department: " + ((Manager) employee).getDept());
	        } 
	        else if (employee instanceof Developer) 
	        {
	            System.out.println("Programming Language: " + ((Developer) employee).getProgLang());
	        }
	    }
	    public void increaseSalary(Employee employee, double percentage)
	    {
	        double newSalary = employee.getSalary() + (employee.getSalary() * percentage / 100);
	        employee.setSalary(newSalary);
	        System.out.println("New salary: " + newSalary);
	    }
   

}
