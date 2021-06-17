/*
 * Author : vikas.prajapati@stltech.in
 * Creation Date : 11-jun-2021
 * version : 4.0
 * Copyright : Sterlite technologies Ltd.
 */
package com.phonenix.shapes.main;
import com.phonenix.shapes.Shape;
import com.phonenix.shapes.circles.Circle;
import com.phonenix.shapes.rectangle.Rectangle;
import com.phonenix.shapes.squares.Square;

//This class Represent AbstractMain Functionality
public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Shape obj;
		 //Circle for base reference
		 obj=new Circle(4.5f);
         obj.calculateArea();
         obj.calculatePerimater();
         
         System.out.println();
         
        
         //Rectangle for base reference
         obj=new Rectangle(5,6);
         obj.calculateArea();
         obj.calculatePerimater();
         
         System.out.println();
         
         //square for base reference
         obj=new Square(3);
         obj.calculateArea();
         obj.calculatePerimater();
      
      
        
	}

}
