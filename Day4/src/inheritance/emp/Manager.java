/*
 * Author : vikas.prajapati@stltech.in
 * Creation Date : 11-jun-2021
 * version : 4.0
 * Copyright : Sterlite technologies Ltd.
 */
package inheritance.emp;

//This class Represent Employee inherite Manager Functionality
public class Manager extends Employee{

	//Data Members
	private double incentives;
	
	
	//default Constructor
	public Manager()
	{
		super(102,"satish",15000.00);
		incentives=6000.00;
	}

	//Parameter Constructor
	public Manager(double incentives)
	{
		super(103,"aakash",18000.00);
		this.incentives = incentives;
	}

	//Parameter Constructor
	public Manager(int empId , String name , double salary ,double incentives) {
		super(empId,name,salary);
		
		this.incentives = incentives;
	}
	
	
	//creating showIncentives() method
	public void showIncentives() {
		System.out.println("Incentives : "+incentives);
	}
	
	//print display() method
	public void display() {
		showIncentives();
		super.display();
	 
	 }

	//Creating toString() method
	@Override
	public String toString() {
		return "Manager [incentives=" + incentives + "]";
	}
	
	
	
	
}
