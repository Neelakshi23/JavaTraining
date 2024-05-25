package p1;

import java.util.Scanner;

public class ReadBookDetails 
{
	public Scanner sc;
	public BookDetails bc;
	
	public ReadBookDetails(Scanner sc, BookDetails bc) {
		this.sc=sc;
		this.bc=bc;
	}
	
	public void read()
	{
		System.out.println("*****Enter Book Details****");
		System.out.println("Enter Book code");
		bc.bCode=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Book Name");
		bc.bName=sc.nextLine();
		System.out.println("Enter Book Author");
		bc.bAuthor=sc.nextLine();
		System.out.println("Enter Book price");
		bc.price=sc.nextFloat();
		System.out.println("Enter Book Quantity");
		bc.qty=sc.nextInt();
		
	}

}
