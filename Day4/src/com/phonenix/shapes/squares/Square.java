/*
 * Author : vikas.prajapati@stltech.in
 * Creation Date : 11-jun-2021
 * version : 4.0
 * Copyright : Sterlite technologies Ltd.
 */
package com.phonenix.shapes.squares;

import com.phonenix.shapes.Shape;

//This class Represent Square Functionality
public class Square extends Shape {

	//Data Members
	private int side;
	
	//Default Constructor
	public Square()
	{
		
	}

	//Parameter Constructor
	public Square(int side) {
	
		this.side = side;
	}
	
	
	//Creating calculateArea() method
	public  void calculateArea() {
		System.out.println("Area of Square is : "+ side*side);
	}
	
	
	//Creating calculatePerimater() method
	public  void calculatePerimater() {
		System.out.println("Parimeter of Square is : "+ 4*(side) );
		
	}
	
	
}
