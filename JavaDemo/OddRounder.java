import java.util.Scanner;

class OddRounder 
{
   
   int oddRounder(int num)
	{
	   if(num>0)
		{
        if(num%2==0)
		{
			return num;
         }
		
		else
		{
           int mul = ((num/10)+1)*10;
			return mul;
        } 
		}
	   else if(num<0)
		{
           return -1;
		}
		else
		{
			return -2;
		}
		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		OddRounder od = new OddRounder();
		int round = od.oddRounder(num);
        System.out.println("even number "+round);

	}
}
