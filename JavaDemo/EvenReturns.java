
import java.util.Scanner;

class EvenReturns 
{
   int isEven(int x)
   {
     if(x%2==0)
   {
    return 1;
   }
   else 
  {
	   return 0;
  }
   }
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter your number");
		int x=sc.nextInt();
		EvenReturns er = new EvenReturns();
		int even = er.isEven(x);
		System.out.println("returns "+even);
	}
}
