/*
 * Author : vikas.prajapati@stltech.in
 * Creation Date : 11-jun-2021
 * version : 4.0
 * Copyright : Sterlite technologies Ltd.
 */
package inheritance.covariant;

import inheritance.emp.Employee;

import inheritance.emp.EmployeeData;
import inheritance.emp.Manager;
import inheritance.emp.ManagerData;
import inheritance.emp.WageEmp;
import inheritance.emp.WageEmpData;

//This class Represent ConvariantMain Functionality
public class CovariantMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating object using class EmployeeData
		EmployeeData ed=new EmployeeData();
		Employee e=ed.getEmployee();
		e.display();
		
		
		//Creating object using class ManagerData
		ManagerData md=new ManagerData();
		Manager m=md.getEmployee();
		m.display();
		
		
		//Creating object using class WageEMpData
	    WageEmpData wd=new WageEmpData();
	    WageEmp w=new WageEmp();
	    w.display();
		

	}

}
