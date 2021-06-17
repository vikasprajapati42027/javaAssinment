/*
 * Author : vikas.prajapati@stltech.in
 * Creation Date : 8-jun-2021
 * version : 1.0
 * Copyright : Sterlite technologies Ltd.
 */

//This class Represent MyDateT Functionality
public class MyDateT {
	//Date member
	 private int dd;
	   private int mm;
	   private int  yy;
	   //Default Constructor
	  public  MyDateT()
	   {
		   dd=8;
		   mm=6;
		   yy=2021;
	   }
	  
	  //Parameter constructor
	public MyDateT(int dd, int mm, int yy) {
		
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
     //printDatet() method used to print the Date
	  public void printDateT()
	  {
		  System.out.println("Date is : "+dd+"/"+mm+"/"+yy);
	  }
}
