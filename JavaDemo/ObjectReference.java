import java.util.Scanner;

class Test
{
	String name;
	void getName()
	{
		System.out.println("Your name is "+name);
	}
}


class ObjectReference
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");

		Test t = new Test();
         t.name=sc.nextLine();
		 
		t.getName();

	}
	
}
