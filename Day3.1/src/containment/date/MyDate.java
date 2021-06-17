/*
 * Author : vikas.prajapati@stltech.in
 * Creation Date : 9-jun-2021
 * version : 2.0
 * Copyright : Sterlite technologies Ltd.
 */

//This class Represent MyDate Functionality
package containment.date;

//This class Represent MyDate Functionality
public class MyDate {
    
	//Data Members
	private int day;
	private int month;
	private int year;
	
	
	//Default Constructor
	public MyDate()
	{
		day=9;
		month=6;
		year=2021;
	}
    
	
	
	//Parameter Constructor
	public MyDate(int day, int month, int year) {
		
		this.day = day;
		this.month = month;
		this.year = year;
	}



	//getter method for day
	public int getDay() {
		return day;
	}

	//setter method for day
	public void setDay(int day) {
		this.day = day;
	}

	//getter method for Month
	public int getMonth() {
		return month;
	}

	//Setter method for day
	public void setMonth(int month) {
		this.month = month;
	}

	//getter method for Year
	public int getYear() {
		return year;
	}

	//setter method for Year
	public void setYear(int year) {
		this.year = year;
	}
	
	//Print the value using DprintDate() method
	public void DprintDate()
	{
		System.out.println("Date is : "+day+"/"+month+"/"+year);
	}




	//toString() method 
	@Override
	public String toString() {
		return   day + "-" + month + "-" + year ;
	}




	
	
	
}

