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


//This class Represent RTTIMain Functionality
public class RTTIMain {
  public static void showEmpInfo(Employee emp)
  {
	  emp.display();
	  
	  if(emp instanceof Manager)
	  ((Manager)emp).showIncentives();
	  
	  if(emp instanceof WageEmp)
	  ((WageEmp)emp).calculateWage();
  }
  
  public static void main(String[] args)
  {
	  
	//Creating object using class Manager
	  Manager objM=new Manager(102,"vikas",5000,1000);
	  showEmpInfo(objM);
	  
	  
	//Creating object using class WageEmp
	  WageEmp objW=new WageEmp();
	  showEmpInfo(objW);
  }
}
