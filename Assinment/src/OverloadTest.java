/*
 * Author : vikas.prajapati@stltech.in
 * Creation Date : 8-jun-2021
 * version : 1.0
 * Copyright : Sterlite technologies Ltd.
 */
public class OverloadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating object of MathEngine Class
		MathEngine obj=new MathEngine();
	    System.out.println("Number int & int : " +obj.multiplay(2, 3));
	    System.out.print("Number int & int & int  : ");
	    obj.multiplay(4, 5, 6);
	    System.out.println("Number float & int  : "+ obj.multiplay(4.0F, 6));
	    System.out.println("Number int & float  : "+obj.multiplay(6, 7.4F));

	}

}
