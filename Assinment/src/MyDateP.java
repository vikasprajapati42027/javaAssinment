/*
 * Author : vikas.prajapati@stltech.in
 * Creation Date : 8-jun-2021
 * version : 1.0
 * Copyright : Sterlite technologies Ltd.
 */
public class MyDateP {
	
	//Data member
	   private int dd;
	   private int mm;
	   private int  yy;
	   
	 //Default Constructor
	   public  MyDateP()
	   {
		   dd=8;
		   mm=6;
		   yy=2021;
	   }
	   //Parameter constructor 
	public MyDateP(int dd, int mm, int yy) {
		
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
  
	//getter method for day
	  public int getDd() {
		return dd;
	}
	  
	//setter method for day
	public void setDd(int dd) {
		this.dd = dd;
	}
	
	//getter method for month
	public int getMm() {
		return mm;
	}
	
	//setter method for month
	public void setMm(int mm) {
		this.mm = mm;
	}
	
	//getter method for year
	public int getYy() {
		return yy;
	}
	
	//setter method for year
	public void setYy(int yy) {
		this.yy = yy;
	}
	
	//printDateSG() method print for date
	public void printDateP()
	  {
		  System.out.println("Date is : "+dd+"/"+mm+"/"+yy);
	  }
   
}
