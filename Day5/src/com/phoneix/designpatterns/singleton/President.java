package com.phoneix.designpatterns.singleton;
/*
 * Author : vikas.prajapati@stltech.in
 * Creation Date : 16-jun-2021
 * version : 5.0
 * Copyright : Sterlite technologies Ltd.
 */
public class President {

	public static President ob3;
	public President()
	{
		System.out.println("Default constructor President object is created");
		
	}
	
	public static President getInstance()
	{
	
		if(ob3==null)
		{
			ob3=new President();
		}
		return ob3;
	}
	public void representNation()
	{
		System.out.println("President is called");
	}
}
