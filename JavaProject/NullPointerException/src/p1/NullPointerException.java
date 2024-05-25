package p1;

import java.util.Scanner;

public class NullPointerException 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try(sc;)
		{
			try {
				System.out.println("Enter number 1: ");
				int a = Integer.parseInt(sc.nextLine());
				System.out.println("Enter number - 2 : ");
				int b = Integer.parseInt(sc.nextLine());
				Calculate c = new Calculate("");
				c.compareTo(a, b);
				
			
		}
}
	

}
