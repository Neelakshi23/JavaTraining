import java.util.Scanner;

class Input6 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your telugu marks");
		int telugu = sc.nextInt();
		System.out.println("Enter your english marks");
        int english = sc.nextInt();
		System.out.println("Enter your hindi marks");
		int hindi = sc.nextInt();
		System.out.println("Enter your maths marks");
		int maths = sc.nextInt();
		System.out.println("Enter your science marks");
		int science = sc.nextInt();
		System.out.println("Enter your social marks");
		int social = sc.nextInt();
		
        int total = telugu+english+maths+social+hindi+science;
        
		float result = total/6;
		if (total>0 && total<100)
		{
         
		 System.out.println("Invalid Marks");
		}
		else
		{
		System.out.println("Your Percentage is "+result);
		}
			
	}
}
