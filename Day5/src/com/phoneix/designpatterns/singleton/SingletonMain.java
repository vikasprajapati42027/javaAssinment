package com.phoneix.designpatterns.singleton;
/*
 * Author : vikas.prajapati@stltech.in
 * Creation Date : 16-jun-2021
 * version : 5.0
 * Copyright : Sterlite technologies Ltd.
 */
public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sun ob= Sun.getInstance();
		        ob.giveLigth();
		        System.out.println("\n");
		
		Earth ob1=Earth.getInstance();
		        ob1.createLife();
	          	System.out.println("\n");
		
		PrimeMinister ob2= PrimeMinister.getInstacne();
				ob2.serveNation();
				System.out.println("\n");
		
		President ob3 = President.getInstance();
				ob3.representNation();
				System.out.println("\n");
				
	}

}
