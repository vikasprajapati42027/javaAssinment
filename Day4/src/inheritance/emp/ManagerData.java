/*
 * Author : vikas.prajapati@stltech.in
 * Creation Date : 11-jun-2021
 * version : 4.0
 * Copyright : Sterlite technologies Ltd.
 */
package inheritance.emp;

//This class Represent ManagerData Functionality
public class ManagerData extends EmployeeData {

	
	//Creating Manager getEmployee() method
	public Manager getEmployee() {
		return new Manager();
	}
}
