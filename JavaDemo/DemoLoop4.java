import java.util.Scanner;

class DemoLoop4
{
	int number;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n Value");
		int n = sc.nextInt();
	
		int a =n;
		int sum =0;
				System.out.println("a is "+a);
		while(n>0)
		{
				int k=n%10;
                sum =(sum*10)+k;
				n=n/10;
				
				}
		System.out.println("Sum is "+sum);	
		if(a==sum)
		{
           System.out.println("Palindrome");
		}
		else
		{
                System.out.println(" Not a Palindrome");
		}
	}
	 
		
	 
	
}
