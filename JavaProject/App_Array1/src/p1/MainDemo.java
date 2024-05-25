package p1;

import java.util.Scanner;

public class MainDemo {
	public static void main(String[] args) {
		
		ProductDetails pd[]=new ProductDetails[2];
		for(int i=0;i<pd.length;i++)
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter code");
			String c=sc.nextLine();
			System.out.println("Enter Name");
			String n=sc.nextLine();
			System.out.println("Enter qty");
			Integer q=sc.nextInt();
			System.out.println("Enter price");
			float p=sc.nextFloat();
			pd[i]=new ProductDetails(c, n, q, p);
			System.out.println(pd[i].toString());
		}
		
		
		System.out.println("----Using Old for loop-----");
				for(int i=0;i<pd.length;i++)
				{
				System.out.println(pd[i].toString());
				}//end of loop
				System.out.println("-----Using Extened for(Java5)-----");
				for(ProductDetails k : pd)
				{
				System.out.println(k.toString());
				}//end of loop
				
				
	}

}
