package com.phoneix.designpatterns.singleton;
/*
 * Author : vikas.prajapati@stltech.in
 * Creation Date : 16-jun-2021
 * version : 5.0
 * Copyright : Sterlite technologies Ltd.
 */
public class Sun {

	public static Sun ob;
	
	public Sun()
	{
		System.out.println("Default constructor Sun object is created");
		
	}
	
	public static Sun getInstance()
	{
		
		if(ob==null)
		{
			ob=new Sun();
		}
		return ob;
	}
	public void giveLigth()
	{
		System.out.println("sun is called");
	}
	
	
}
