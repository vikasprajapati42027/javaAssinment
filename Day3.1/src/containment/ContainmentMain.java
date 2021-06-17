/*
 * Author : vikas.prajapati@stltech.in
 * Creation Date : 9-jun-2021
 * version : 2.0
 * Copyright : Sterlite technologies Ltd.
 */

//This class Represent ContainmentMain Functionality
package containment;

import containment.date.MyDate;
import containment.emp.Employee;

//This class Represent ContainmentMain Functionality
public class ContainmentMain {
	public static void main(String[] args)
	{
		
		
		
		//Creating the Object using Employee Class
	 Employee obj=new Employee();
	 
	 //Print the value using Edisplay() method
     obj.Edisplay();
     System.out.println();
  
     
     
     System.out.println("setter & getter method");
     //Set the value using setter method
     obj.setEmpId(102);
     obj.setName("vikas Prajapati");
     obj.setBirthDate(new MyDate(23,8,1996));
     
     //Print the value using getter method
     System.out.println("Emp ID : "+obj.getEmpId()+"\nName : "+obj.getName()+"\nBirth Date "+obj.getBirthDate());
	}

}
