/*
 * Author : vikas.prajapati@stltech.in
 * Creation Date : 8-jun-2021
 * version : 1.0
 * Copyright : Sterlite technologies Ltd.
 */
public class MyDateC {
	//Data Members
   private int dd;
   private int mm;
   private int year;
   
   //Default Constructor or No Argument 
   MyDateC()
   {
	   dd=8;
	   mm=6;
	   year=2021;
   }
   //printDat() method is used to print the date
   public void printDat()
   {
	   System.out.println("Date is :  \n"+dd+" "+mm+" "+year);
   }
}
