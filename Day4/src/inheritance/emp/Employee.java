/*
 * Author : vikas.prajapati@stltech.in
 * Creation Date : 11-jun-2021
 * version : 4.0
 * Copyright : Sterlite technologies Ltd.
 */
package inheritance.emp;

//This class Represent Employee Functionality
public class Employee {
	
	//Data Members
   private int empId;
   private  String name;
   private double salary;
   
   
   //Default Constructor
   public Employee()
   {
	   empId=101;
	   name="vikas";
	   salary=28000.00;
   }

   
   //Parameter Constructor
    public Employee(int empId, String name) {
	       this.empId = empId;
	       this.name = name;
    }

    //Parameter Constructor
	public Employee(int empId, String name, double salary)
    {
	    this.empId = empId;
	    this.name = name;
	    this.salary = salary;
     }
	
	
	//Creating print display() method
	 public void display() {
	 	System.out.println("EmpId : "+empId+"\nName : "+name+"\nSalary"+salary+"\n");
	 }


	 
	 //Creating toString() method
	@Override
	public String toString() {
		return "EmpId : " + empId + "\nName: " + name + "\nSalary=" + salary ;
	}
	 
	 
     
     
   
   
   
}
