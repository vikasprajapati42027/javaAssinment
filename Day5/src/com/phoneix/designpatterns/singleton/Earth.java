package com.phoneix.designpatterns.singleton;
/*
 * Author : vikas.prajapati@stltech.in
 * Creation Date : 16-jun-2021
 * version : 5.0
 * Copyright : Sterlite technologies Ltd.
 */
public class Earth {

public static Earth ob1;
	
	public Earth()
	{
		System.out.println("Default constructor Earth object is created");
		
	}
	
	public static Earth getInstance()
	{
		
		if(ob1==null)
		{
			ob1=new Earth();
		}
		return ob1;
	}
	public void createLife()
	{
		System.out.println("Earth is called");
	}
}
