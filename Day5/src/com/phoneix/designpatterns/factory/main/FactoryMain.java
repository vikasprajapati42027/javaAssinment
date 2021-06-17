package com.phoneix.designpatterns.factory.main;
/*
 * Author : vikas.prajapati@stltech.in
 * Creation Date : 16-jun-2021
 * version : 5.0
 * Copyright : Sterlite technologies Ltd.
 */
import com.phoneix.designpatterns.factory.*;
public class FactoryMain {
	
	public static void main(String[] args)
	{
		Car car1=CarFactory.newCar("sedan");
		car1.start();
		car1.run();
		car1.stop();
		System.out.println("\n");
		
		Car car2=CarFactory.newCar("couple");
		car2.start();
		car2.run();
		car2.stop();
		System.out.println("\n");
		
		Car car3=CarFactory.newCar("sport");
		car3.start();
		car3.run();
		car3.stop();
		System.out.println("\n");
		
		Car car4=CarFactory.newCar("luxury");
		car4.start();
		car4.run();
		car4.stop();
	}

}
