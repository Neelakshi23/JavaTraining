import java.util.Scanner;

class PositiveReturns
{
	 static int findSign(int a)
	{
       if(a<0)
		{
		   return -1;
		}
		else if(a>0)
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
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number"); 
		int num = sc.nextInt();
       int sign = PositiveReturns.findSign(num);
	   System.out.println("returns " +sign);
	}
}
