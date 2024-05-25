package p1;

public class DisplayBookDetails 
{
	public BookDetails bc;
	public DisplayBookDetails(BookDetails bc)
	{
		this.bc=bc;
	}
	public void display()
	{
		bc.getBookDetails();
	}
}
