import java.util.Scanner;

class DemoEmployee
{
	float employee(int bSal, float hRa, float da)
	{
     float total = bSal+hRa+da;
	 return total;
	}
}

class  Input7
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Basic Salary ");
		int bSal=sc.nextInt();
		float hRa = (0.93f)*bSal;
		float da = (0.61f)*bSal;

		DemoEmployee e = new DemoEmployee();
		float salary = e.employee(bSal,hRa,da);
		
		if(bSal<12000)
		{
         System.out.println("Invalid basic Salary ");
		}
		else
		{
         System.out.println("Basic Salary is " +bSal );
		 System.out.println("House rent Allovance is " +hRa );
		 System.out.println("Da Salary is " +da );
         System.out.println("Total Salary is " +salary );
		}
        

	}
}
