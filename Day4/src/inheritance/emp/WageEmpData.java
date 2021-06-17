/*
 * Author : vikas.prajapati@stltech.in
 * Creation Date : 11-jun-2021
 * version : 4.0
 * Copyright : Sterlite technologies Ltd.
 */
package inheritance.emp;

//This class Represent WageEmpData Functionality
public class WageEmpData extends EmployeeData {

	
	//Creating WageEmp getEmployee() method
	public WageEmp getEmployee()
	{
		return new WageEmp();
	}
}
