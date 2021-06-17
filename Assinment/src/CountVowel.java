/*
 * Author : vikas.prajapati@stltech.in
 * Creation Date : 8-jun-2021
 * version : 1.0
 * Copyright : Sterlite technologies Ltd.
 */
import java.util.*;
//This is CountVowel Class Representing
public class CountVowel {

	//This is checkC() method declare
	public static int checkC(String str)
	{
		int c=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
				c++;
		}
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String str=sc.nextLine();
		System.out.println(checkC(str));
   
	}

}
