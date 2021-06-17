package com.phoneix.designpatterns.factory;
/*
 * Author : vikas.prajapati@stltech.in
 * Creation Date : 16-jun-2021
 * version : 5.0
 * Copyright : Sterlite technologies Ltd.
 */
public class CarFactory {

	public static Car newCar(String carType)
	{
		
		if(carType.equals("sedan"))
			return new SedanCar();
		else if(carType.equals("couple"))
			return new CoupleCar();
		else if(carType.equals("sport"))
			return new SportCar();
		else if(carType.equals("luxury"))
			return new LuxuryCar();
		return null;
	}
}
