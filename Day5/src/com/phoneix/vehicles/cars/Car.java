package com.phoneix.vehicles.cars;

import com.phoneix.interfaces.Movable;
import com.phoneix.interfaces.Runnable;
import com.phoneix.vehicles.Vehicle;;

/*
 * Author : vikas.prajapati@stltech.in
 * Creation Date : 16-jun-2021
 * version : 5.0
 * Copyright : Sterlite technologies Ltd.
 */
public class Car extends Vehicle implements Movable,Runnable {

	public void move()
	{
		System.out.println("car Move...");
	}
	
	public void run()
	{
		System.out.println("car run...");
	}
}
