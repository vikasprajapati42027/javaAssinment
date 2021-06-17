/*
 * Author : vikas.prajapati@stltech.in
 * Creation Date : 11-jun-2021
 * version : 4.0
 * Copyright : Sterlite technologies Ltd.
 */
package com.phonenix.shapes.circles;

import com.phonenix.shapes.Shape;

//This class Represent Circle Functionality
public class Circle extends Shape{

	//Data members
	
	private float radius;
	
	
	//Creating default constructor 
	public Circle() {
		
	}
	
	
	//Creating default constructor 
	public Circle(float radius) {
	
		this.radius = radius;
	}
	
	
	//Creating calculateArea() method
	public  void calculateArea() {
		System.out.println("Area of Circle is : " + MATH_PI*(radius*radius));
	}
	
	
	//Creating calculatePerimater() method
	public  void calculatePerimater() {
		System.out.println("Parimeter of Circle is : " + (2*MATH_PI*radius));
	}
	
}
