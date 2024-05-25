package p1;

public class EmpData 
{
public String id, name, desg;
public EmpContact ec = new EmpContact();
public EmpSalary es = new EmpSalary();

public void getEmpData()
{
	System.out.println("***Employee Data***");
    System.out.println("EmpId "+id);
    System.out.println("Emp-Name "+name);
    System.out.println("Emp-Des "+desg);
}
	
}
