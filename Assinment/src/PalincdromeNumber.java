/*
 * Author : vikas.prajapati@stltech.in
 * Creation Date : 8-jun-2021
 * version : 1.0
 * Copyright : Sterlite technologies Ltd.
 */
import java.util.*;
public class PalincdromeNumber {
    public static String reverse(String str)
    {
    	String rev="";
    	for(int i=str.length()-1;i>=0;i--)
    	{
    		rev+=str.charAt(i);
    	}
    	return rev;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String str=sc.nextLine();
		if(str.equals(reverse(str)))
		{
			System.out.println("String is palindrome ");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}

	}

}
