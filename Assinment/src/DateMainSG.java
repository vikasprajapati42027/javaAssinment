
public class DateMainSG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating the object using MyDateSG class
		MyDateSG obj1=new MyDateSG();
		System.out.println("Dedault Constructer : ");
		obj1.printDateSG();
		obj1.setDd(12);
		obj1.setMm(5);
		obj1.setYy(2021);
		System.out.println("ALL Getter Date is :"+obj1.getDd()+"/"+obj1.getMm()+"/"+obj1.getYy());
		
		//Creating the object using MyDateSG class
       MyDateSG obj=new MyDateSG(8,7,2021);
      System.out.println("Parameter Constructer : ");
       obj.printDateSG();
	}

}
