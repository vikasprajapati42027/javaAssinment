/*
 * Author : vikas.prajapati@stltech.in
 * Creation Date : 8-jun-2021
 * version : 1.0
 * Copyright : Sterlite technologies Ltd.
 */

class Account
{
	//private non-static data member
	private int accNo;
	private String ownerName;
	private double balance;
	private double durationYears;
	
	//private static data members
	
	private static double interestRate;
	private static int count;
	
	//static block for updating interestRate
	static {
		Account.interestRate=0.05F;
	}
	
	//default constructor
	public Account()
	{
		accNo=101;
		ownerName="vikas prajapati";
		balance=50000.00;
		durationYears=1.5f;
		count++;
	}
	
	//parameterized constructor
	public Account(int accNo,String ownerName,double balance,double durationYears)
	{
		this.accNo=accNo;
		this.ownerName=ownerName;
		this.balance=balance;
		this.durationYears=durationYears;
		count++;
	}
	
	
	//getter method for AccNo
	
	public int getAccNo() {
		return accNo;
	}
	
	//setter method for AccNo
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
   
	//getter method for ownerName
	public String getOwnerName() {
		return ownerName;
	}

	//setter method for ownerName
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	//getter method for balance
	public double getBalance() {
		return balance;
	}

	//setter method for balance
	public void setBalance(double balance) {
		this.balance = balance;
	}

	//getter method for durationYears
	public double getDurationYears() {
		return durationYears;
	}

	//setter method for durationYears
	public void setDurationYears(double durationYears) {
		this.durationYears = durationYears;
	}

	
	
	
	////getter method for interestRate
	public  static double getInterestRate()
	{
		return Account.interestRate;
	}
	
	//getter method for count
	
	public static int getCount()
	{
		return Account.count;
	}
	
	//calculating simple interest
	public void calculateInterest()
	{
		System.out.println("Simple interest is: "+balance*durationYears*interestRate);
	}
	
	//printing  details to the console
	public void printDetails()
	{
		System.out.println("Account No: "+accNo+"\n Name: "+ownerName+"\nBalance: "+
	                     balance+"\nDuration Years : "+durationYears);
	}
	
	
	
	
}
