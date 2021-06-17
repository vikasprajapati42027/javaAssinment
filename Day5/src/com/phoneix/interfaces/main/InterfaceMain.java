package com.phoneix.interfaces.main;
import com.phoneix.interfaces.*;
import com.phoneix.living.*;
import com.phoneix.living.pet.*;
import com.phoneix.living.wild.*;
import com.phoneix.living.Animal;
import com.phoneix.machines.*;
import com.phoneix.planets.*;
import com.phoneix.vehicles.*;
import com.phoneix.vehicles.cars.*;
/*
 * Author : vikas.prajapati@stltech.in
 * Creation Date : 16-jun-2021
 * version : 5.0
 * Copyright : Sterlite technologies Ltd.
 */
public class InterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   Movable move,obj1,obj2;
		   
		   System.out.println("Earth ....");
		   move=new Earth();
		   ((Earth)move).setNoOfMoons(11);
		   
		   System.out.println(((Earth)move).toString());
		   ((Earth)move).rotate();
		   ((Earth)move).move();
		   ((Earth)move).revolve();
		   ((Earth)move).supportsLife();
		    System.out.println("\n");
		   
		   System.out.println("Jupiter ");
		   move=new Jupiter();
		   ((Jupiter)move).setNoOfMoons(13);
		   System.out.println(((Jupiter)move).toString());
		   ((Jupiter)move).move();
		   ((Jupiter)move).revolve();
		   ((Jupiter)move).rotate();
		   ((Jupiter)move).supportsLife();
		   System.out.println("\n");
		   
		   
		   System.out.println("Tiger.. ");
		   Animal obj;
		   obj=new Tiger();
		   ((Tiger)obj).run();
		   ((Tiger)obj).jump();
		   ((Tiger)obj).walk();
		   System.out.println("\n");
		   
		   
		   System.out.println("Cat.. ");
		   obj=(Animal) new Cat();
		   ((Cat)obj).jump();
		   ((Cat)obj).run();
		   ((Cat)obj).walk();
		   System.out.println("\n");
		   
		   
		   System.out.println("Car.. ");
		     obj1=new Car();
		   ((Car)obj1).start();
		   ((Car)obj1).run();
		   ((Car)obj1).move();
		   ((Car)obj1).stop();
		   System.out.println("\n");
		 
		   
		   System.out.println("Robot.. ");
		    obj2=new HumanRobot();
		   ((HumanRobot)obj2).processData();
		   ((HumanRobot)obj2).senseInfo();
		   ((HumanRobot)obj2).useArtificialIntelligence();
		   ((HumanRobot)obj2).run();
		   ((HumanRobot)obj2).jump();
		   ((HumanRobot)obj2).move();
		   ((HumanRobot)obj2).walk();
		
	}

}
