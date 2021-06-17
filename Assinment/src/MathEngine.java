/*
 * Author : vikas.prajapati@stltech.in
 * Creation Date : 8-jun-2021
 * version : 1.0
 * Copyright : Sterlite technologies Ltd.
 */

//This class Represent arithmetic Functionality
public class MathEngine {
	
	//overloaded member methods int & int
    public static int multiplay(int a,int b)
    {
    	return a*b;
    }
    
  //overloaded member methods int & int & int
    public static void multiplay(int a,int b,int c)
    {
    	System.out.println(a*b*c);
    }
    
  //overloaded member methods float & int
    public static float multiplay(float a,int b)
    {
    	return a*b;
    }
  //overloaded member methods int & float
    public static float multiplay(int  a,float b)
    {
    	return a*b;
    }
}
