/*
 * Author : vikas.prajapati@stltech.in
 * Creation Date : 8-jun-2021
 * version : 1.0
 * Copyright : Sterlite technologies Ltd.
 */
public class DateMainP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating object using MyDateP Class
		MyDateP obj1=new MyDateP();
		System.out.println("Dedault Constructer : ");
		obj1.printDateP();
		
		//Creating object using MyDateP Class
       MyDateP obj=new MyDateP(8,7,2021);
      System.out.println("Parameter Constructer : ");
       obj.printDateP();
      
       
	}

}
