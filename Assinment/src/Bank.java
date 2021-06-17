/*
 * Author : vikas.prajapati@stltech.in
 * Creation Date : 8-jun-2021
 * version : 1.0
 * Copyright : Sterlite technologies Ltd.
 */
public class Bank {
	public static void main(String[]args)
	{
		//Creating object of Account Class
		
		
		System.out.println("InterestRate is : "+Account.getInterestRate());
		
		//Creating object of Account Class
		Account obj1=new Account();
		
		
		
		obj1.setAccNo(103);
		obj1.setOwnerName("vikas prajapati");
		obj1.setBalance(25000.00F);
		obj1.setDurationYears(1.5F);
		
		
		System.out.println("Acc No:"+obj1.getAccNo());
		System.out.println("Name: "+obj1.getOwnerName());
		System.out.println("Balance: "+obj1.getBalance());
		System.out.println("DurationYears: "+obj1.getDurationYears());
		
		System.out.println("\n");
		//Creating object of Account Class
		Account obj2=new Account(104,"ajay prajapati",27000.04F,1.5f);
		obj2.printDetails();
		
		obj2.calculateInterest();
		System.out.println("Total count is  : "+Account.getCount());
	}

}