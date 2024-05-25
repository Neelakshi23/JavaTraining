import java.util.Scanner;

class EmployeeSalary
{
	int String = name;
	float calculate(int bSal, float hra, float da){
     float total = bSal+hra+da;
	 return total;

	}
	void getName(String name)
	{
		System.out.println("name is  "+bSal);
	}
}
class DemoEmployee 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Basic Salary");
		int bSal = sc.nextInt();
        float hra = (0.93F)*bSal;
        float da = (0.61F)*bSal;
	    EmployeeSalary eSal = new EmployeeSalary();
		System.out.println("Your Basic Salary is "+bSal);
        S
		System.out.println("Your House Rent Allocate Salary is "+hra);
		System.out.println("Your DirectAllovance Salary is "+da);
		float res = eSal.calculate(bSal,hra,da);
        System.out.println("Your Total Salary is "+res);

	}
}
