/*
 * Author : vikas.prajapati@stltech.in
 * Creation Date : 11-jun-2021
 * version : 4.0
 * Copyright : Sterlite technologies Ltd.
 */
package inheritance;

import inheritance.emp.Employee;
import inheritance.emp.Manager;
import inheritance.emp.WageEmp;

//This class Represent InheritanceMain Functionality
public class InheritanceMain {
 
	public static void main(String[] args)
	{
		
		//Creating object using class Employee
	Employee obj=new Employee();
	obj.display();
	System.out.println(obj);
	System.out.println();
	
	
	//Creating object using class Manager
	Manager obj1 = new Manager(7001,"narayan",27000.00,75000);
	obj1.display();
	obj1.showIncentives();
	System.out.println(obj1);
	
	
	//Creating object using class WageEmp
	WageEmp wagObj=new WageEmp();
	System.out.println(wagObj);
	wagObj.display();
	}
	
	
	
}
