package p1;

public class EmpSalary 
{
	public int sal;
	public float totaSal;
	public void getEmpSalary()
	{
	System.out.println("***Emp Salary***");
	
	totaSal = sal+(0.61F*sal)+(0.93F*sal);
	System.out.println("***Emp Salary***"+totaSal);
	
	}

}
