import java.util.Scanner;

class Input5
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int a =sc.nextInt();
		System.out.println("Enter b value");
		int b = sc.nextInt();
		System.out.println("Enter c value");
		int c = sc.nextInt();
		System.out.println("Enter d value");
		int d = sc.nextInt();
		if(a>b && a>c && a>d)
        System.out.printf("%d value is Greater",a);
		else if(b>a && b>c && b>d)
        System.out.printf("%d value is Greater",b);
		else if(c>a && c>b && c>d)
        System.out.printf("%d value is Greater",c);
		else if(d>a && d>b && d>c)
        System.out.printf("%d value is Greater",d);

	}
}
