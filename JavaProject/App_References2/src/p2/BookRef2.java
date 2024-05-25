package p2;
import p1.*;
import java.util.Scanner;
public class BookRef2 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BookDetails bc = new BookDetails();
		
		ReadBookDetails rbd = new ReadBookDetails(sc,bc);
		rbd.read();
		DisplayBookDetails dbd = new DisplayBookDetails(bc);
		dbd.display();
		//bc.getBookDetails();
		sc.close();
	}
	
}
