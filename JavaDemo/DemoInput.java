import java.util.Scanner;

class DemoInput 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name ");
		String name = sc.nextLine();
        System.out.println("Enter your Age ");
		 int age = sc.nextInt();
		 System.out.println("Enter MId ");
		String mid = sc.next();

		System.out.println("My name is " + name);
        System.out.println("My age is " + age);
		System.out.println("My MailID is " + mid);

	}
}
