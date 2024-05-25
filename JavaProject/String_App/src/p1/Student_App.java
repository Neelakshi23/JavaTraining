package p1;

import java.util.Scanner;

public class Student_App 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try(sc;)
		{
			System.out.println("Enter no of Strings");
			int n = Integer.parseInt(sc.nextLine());
			 
			System.out.println("Enter "+n+" Strings");
		}
	}

}
