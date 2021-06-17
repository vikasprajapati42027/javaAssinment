/*
 * Author : vikas.prajapati@stltech.in
 * Creation Date : 11-jun-2021
 * version : 4.0
 * Copyright : Sterlite technologies Ltd.
 */
package inheritance.emp;

//This class Represent WageEmp Functionality
public class WageEmp extends Employee {

	//Data member 
	private int noOfHour;
	private float ratePerHour;
	
	
	//Default Constructor
	public WageEmp()
	{
		noOfHour=8;
		ratePerHour=200.0F;
	}

	//Parameter Constructor
	public WageEmp(int empId, String name ,double salary ,int noOfHour,float ratePerHour) {
		super(empId,name,salary);
	     this.noOfHour = noOfHour;
		this.ratePerHour = ratePerHour;
	}
	
	//print display() method
	public void display() {
		
		System.out.println("Hours : "+noOfHour+"\tRate Per Hour : "+ratePerHour);
	}
	
	
	//Creating calculateWage() method
	public void calculateWage() {
		float wage=noOfHour+ratePerHour;
		System.out.println("WageEmp  is :: " + wage);
	}

	
	//Creating toString() method
	@Override
	public String toString() {
		return "WageEmp [noOfHour=" + noOfHour + ", ratePerHour=" + ratePerHour + "]";
	}
	
	
	
}
