package p1;
public class EmpData 
{
	public String id,name,desg;
	public EmpContact emc=new EmpContact();
	public EmpSalary ems= new EmpSalary();
	
	
	public void getEmpData() {
		
		System.out.println("My Id is "+id);
	    System.out.println("My Name is "+name);
	    System.out.println("My Desg is "+desg);
         emc.getEmpContact();
         ems.getEmpSalary();
	}
	

}
