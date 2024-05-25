package p1;

public class BookDetails 
{
	int bCode;
	String bName, bAuthor;
	float price;
	int qty;
	public void getBookDetails()
	{
		System.out.println("Book code is : "+bCode);
		System.out.println("Book Name is : "+bName);
		System.out.println("Book Author is : "+bAuthor);
		System.out.println("Book price is : "+price);
		System.out.println("Book quantity is : "+qty);
	}

}
