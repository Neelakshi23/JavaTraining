import java.util.Scanner;	

class ReverseInteger 
{
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
         System.out.println(" Enter a number : ");
		 int num = sc.nextInt();
		 int n;
         System.out.println(" Enter a number1 : ");
         int num1 = sc.nextInt();
		int rev=0, sum =0;
		while(num>0)
	    {
          //num=123
		  int k = num%10; //k=3
		  rev = (rev *10)+k;//rev = 0+3==>3
		  num = num/10;

		}
		System.out.println(" Reverse number is : "+rev);
		if(num==rev)
		{
			System.out.println(" Palindrome number");

		}
		else
		{
			System.out.println("Not a palindrome");
		}

           while(num1>0)
	    {
          //num=123
		  int k = num1%10; //k=3
		  sum = sum +k;
          num1 = num1/10;

		}
        System.out.println(" Sum of a number is : "+sum);
    }
}
