package com.phoneix.planets;
import com.phoneix.interfaces.Movable;
import com.phoneix.interfaces.Rotatable;
import com.phoneix.interfaces.Revolvable;

/*
 * Author : vikas.prajapati@stltech.in
 * Creation Date : 16-jun-2021
 * version : 5.0
 * Copyright : Sterlite technologies Ltd.
 */
public class Jupiter extends Planet{

	//overridden abstract method with more visibility
			public void supportsLife()
			{
				System.out.println("Jupiter is ethereal..");
			}
			
			
			//overridden interfaces method
			public void move()
			{
				System.out.println("Jupiter is Moving..");
			}
			
			
			public void rotate()
			{
				System.out.println("Jupiter is Rotating..");
			}
			
			
			public void revolve()
			{
				System.out.println("Jupiter is Revolving....!");
			}
}
