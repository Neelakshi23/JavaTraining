package p1;

import java.util.Scanner;

public class maccess {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Object ob[] = new Object[5];
		ob[0] = new String("Neelakshi");
		ob[1] = new Float(87.1);
		ob[2] = new Boolean(true);
		ob[3] = new Character('A');
		ob[4] = new Integer(98);
		System.out.println("------Display from Object Array-------");
		for(Object k : ob) {
			System.out.println("Object : "+k.toString());	
		}
		Scanner sc = new Scanner(System.in);
		try(sc;){
			try
			{
				Integer a[][] = new Integer[3][3];
				System.out.println("Enter 3*3 Matrix ");
				for(int i = 0; i<=2;i++) {
					for(int j=0;j<=2;j++) {
						a[i][j] = new Integer(sc.nextInt());
						
					}
					}
					System.out.println("Display from for Loop : ");
					for(int i=0;i<=2;i++)
					{
						for(int j=0;j<=2;j++)
						{
							System.out.println("  "+a[i][j].toString());
							
						}
						System.out.println();
					}
				}
			catch(Exception e)
			{
				System.out.println(e.toString());
			}
			}
		
		}
		
	}
	

