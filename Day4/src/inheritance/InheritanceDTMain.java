/*
 * Author : vikas.prajapati@stltech.in
 * Creation Date : 11-jun-2021
 * version : 4.0
 * Copyright : Sterlite technologies Ltd.
 */
package inheritance;

import inheritance.emp.Employee;
import inheritance.emp.WageEmp;
import inheritance.emp.Manager;


//This class Represent InheritanceDTMain Functionality
public class InheritanceDTMain {

	public static void main(String[] args)
	{
		//Creating object using class Employee
		Employee ob;
		ob=new Manager();
		ob.display();
		
		((Manager)ob).showIncentives();
		
		
		ob=new WageEmp();
		ob.display();
		((WageEmp)ob).calculateWage();
		}
}
