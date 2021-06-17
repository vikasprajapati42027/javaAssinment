package com.phoneix.designpatterns.singleton;
/*
 * Author : vikas.prajapati@stltech.in
 * Creation Date : 16-jun-2021
 * version : 5.0
 * Copyright : Sterlite technologies Ltd.
 */
public class PrimeMinister {

	public static PrimeMinister ob2;
	public PrimeMinister()
	{
		System.out.println("Default constructor primeMinister object is created");
		
	}
	
	public static PrimeMinister getInstacne()
	{
		
		if(ob2==null)
		{
			ob2=new PrimeMinister();
		}
		return ob2;
	}
	public void serveNation()
	{
		System.out.println("primeMinister is called");
	}

}
