/*
 * Author : vikas.prajapati@stltech.in
 * Creation Date : 8-jun-2021
 * version : 1.0
 * Copyright : Sterlite technologies Ltd.
 */
public class MyDate {
	
	//Data Members
    private int dd;
    private int mm;
    private int year;
    
    //Default Constructor
    public void initDate()
    {
    	dd=8;
    	mm=6;
    	year=2021;
    	
    }
    
    //printDate() method is used to print date
    public void printDate() {
    	System.out.println("Date is : "+dd+"/"+mm+"/"+year);
    }
	

}
