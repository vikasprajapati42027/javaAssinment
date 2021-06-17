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
public class Planet implements Movable,Rotatable,Revolvable {

	private int noOfMoons;
	
	
	public int getNoOfMoons() {
		return noOfMoons;
	}

	public void setNoOfMoons(int noOfMoons) {
		this.noOfMoons = noOfMoons;
	}

	public void move()
	{
		System.out.println("Planet Move...");
	}
	
	public void rotate()
	{
		System.out.println("planet Rotate...");
	}
	
	public void revolve()
	{
		System.out.println("planet Revolva...");
		
	}

	@Override
	public String toString() {
		return "Planet [noOfMoons=" + noOfMoons + "]";
	}
	
	
	
	
}
