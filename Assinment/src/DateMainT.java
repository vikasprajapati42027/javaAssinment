
public class DateMainT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating the object using MyDateT class
		MyDateT obj1=new MyDateT();
		System.out.println("Dedault Constructer : ");
		obj1.printDateT();
		
		//Creating the object using MyDateT class
       MyDateT obj=new MyDateT(8,7,2021);
      System.out.println("Parameter Constructer : ");
       obj.printDateT();
	}

}
