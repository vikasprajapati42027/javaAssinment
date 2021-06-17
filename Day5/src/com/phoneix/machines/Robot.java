package com.phoneix.machines;

import com.phoneix.interfaces.Movable;
/*
 * Author : vikas.prajapati@stltech.in
 * Creation Date : 16-jun-2021
 * version : 5.0
 * Copyright : Sterlite technologies Ltd.
 */
public class Robot implements Movable{

	//declared methods
		public void processData()
		{
			System.out.println("Processing functionality in Robot..");
		}
		
		public void senseInfo()
		{
			System.out.println("Robot senses data..");
		}
		
		public void useArtificialIntelligence()
		{
			System.out.println("Robot is embodiment for AI..");
		}
		
		
		//overridden method of interface
		public void move()
		{
			System.out.println("Robot is moving..");
		}
	
}
