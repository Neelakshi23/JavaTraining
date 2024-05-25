package p1;

import java.util.Scanner;

public class DemoString2 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try(sc;)
		{
			System.out.println("Enter a String...");
			String str = sc.nextLine();
			System.out.println("String is.."+str);
			int len = str.length();
			System.out.println("Length of a string is.."+len);
			for(int i=0;i<len;i++) {
				char ch = str.charAt(i);
				//System.out.println("character of a string is.."+ch);
				switch(ch) {
				case 'a':
				case 'A':
					System.out.println(" "+ch);
					break;
				case 'e':
				case 'E':
					System.out.println(" "+ch);
					break;
				case 'o':
				case 'O':
					System.out.println(" "+ch);
					break;
					
				case 'i':
				case 'I':
					System.out.println(" "+ch);
					break;
				case 'u':
				case 'U':
					System.out.println(" "+ch);
					break;
					
				}
			}
			
		}
	}

}
