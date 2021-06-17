package containment;

public class ContainmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee obj=new Employee();
        obj.Edisplay();
        
        obj.setEmpId(102);
        obj.setName("vikas prajapati");
        obj.setBirthDate(new MyDate(23,8,1996));
        System.out.println("Emp ID : "+obj.getEmpId()+"\nName : "+obj.getName()+
        		"\nBirth Date "+obj.getBirthDate());
	}

}
