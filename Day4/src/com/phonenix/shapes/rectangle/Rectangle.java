/*
 * Author : vikas.prajapati@stltech.in
 * Creation Date : 11-jun-2021
 * version : 4.0
 * Copyright : Sterlite technologies Ltd.
 */
package com.phonenix.shapes.rectangle;

import com.phonenix.shapes.Shape;

//This class Represent Rectangle Functionality
public class Rectangle extends Shape{
  
	//Data Members
	private int length;
	private int breadth;
	
	//Default Constructor
	public Rectangle() {
		
	}

	
	//Parameter Constructor
	public Rectangle(int length, int breadth) {
		
		this.length = length;
		this.breadth = breadth;
	}
	
	
	//Creating calculateArea() method
	public  void calculateArea() {
		System.out.println("Area of Ractanlge is : "+ length*breadth);
	}
	
	//Creating CalculatePerimater() method 
	public  void calculatePerimater() {
		System.out.println("Parimeter of Rectangle is : "+ 2*(length+breadth) );
		
	}
	
	
}
