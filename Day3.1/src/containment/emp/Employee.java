/*
 * Author : vikas.prajapati@stltech.in
 * Creation Date : 9-jun-2021
 * version : 2.0
 * Copyright : Sterlite technologies Ltd.
 */

//This class Represent Employee Functionality
package containment.emp;

import containment.date.MyDate;

public class Employee {
    
	//Data Memebers
	  private int empId;
	  private String name;
	  private MyDate birthDate;
	  
	  //Default Constructor
	  public Employee()
	  {
		  empId=101;
		  name="satish prajapati";
		  birthDate = new MyDate();
		  
	  }

	  //Parameter Constructor
	public Employee(int empId, String name, MyDate birthDate) {
		
		this.empId = empId;
		this.name = name;
		this.birthDate = birthDate;
	}

	//getter method for EmpId
	public int getEmpId() {
		return empId;
	}

	//setter method for EmpId
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	//getter method for Name
	public String getName() {
		return name;
	}

	//setter method for Name
	public void setName(String name) {
		this.name = name;
	}

	//getter method for BirthDate
	public MyDate getBirthDate() {
		return birthDate;
	}

	//setter method for BirthDate
	public void setBirthDate(MyDate birthDate) {
		this.birthDate = birthDate;
	}
	
	//Print Edisplay() method
	public void Edisplay() {
		System.out.println("Emp ID : "+empId+"\nName : "+name+"\nBirth Date :  "+birthDate);
		}

	//toString() method
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", birthDate=" + birthDate + "]";
	}
	
	  
	  
}

