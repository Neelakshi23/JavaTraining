import java.util.Scanner;

class Input1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter customer Name ");
		String name = sc.nextLine();
        System.out.println("Enter city ");
		String city=sc.nextLine();
        System.out.println("Enter MId ");
		String mid = sc.nextLine();
		System.out.println("Enter phone Number ");
		long phno = sc.nextLong();

		System.out.println("customer Name is "+name);
		System.out.println("customer city is "+city);
		System.out.println("customer MID is "+mid);
		System.out.println("customer Phone number is "+phno);


	}
}
