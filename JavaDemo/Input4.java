import java.util.Scanner;

class Input4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		if(num%7==0)
		{
        System.out.printf("%d is divisible by 7", num);
		}
		else
		{
        System.out.printf("%d is not divisible by 7", num);
		}

	}
}
