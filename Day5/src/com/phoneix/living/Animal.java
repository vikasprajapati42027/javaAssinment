package com.phoneix.living;

import com.phoneix.interfaces.Jumpable;
import com.phoneix.interfaces.Movable;
import com.phoneix.interfaces.Walkable;
/*
 * Author : vikas.prajapati@stltech.in
 * Creation Date : 16-jun-2021
 * version : 5.0
 * Copyright : Sterlite technologies Ltd.
 */
public class Animal implements Walkable,Jumpable,Runnable {

	 public void walk()
	 {
		 System.out.println("Tiger is Walking..");
	 }
	 
	 //overridden jump method
	 public void jump()
	 {
		 System.out.println("Tiger is Jumping..");
	 }
	 
	 //overridden run method
	 public void run()
	 {
		 System.out.println("Tiger is running..");
	 }
}
