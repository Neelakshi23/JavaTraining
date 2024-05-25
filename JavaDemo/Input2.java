import java.util.Scanner;

class Input2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the book code ");
                                    
		int code=Integer.parseInt(sc.nextLine()); 

	  //int code = sc.nextInt();
		System.out.println("Enter Book name ");
		String name=sc.nextLine();
		System.out.println("Enter Author Name ");
		String author=sc.nextLine();
		System.out.println("Enter price of the book");
		float price =sc.nextFloat();
		System.out.println("Enter quantity");
		int quantity = sc.nextInt();

        System.out.println("Book code " +code);
		System.out.println("Book name "+name);
		System.out.println("Author name "+author);
		System.out.println("price of the book "+price);
		System.out.println("Book quantity "+quantity);
	}
}
