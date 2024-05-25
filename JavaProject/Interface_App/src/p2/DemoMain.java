package p2;
import p1.*;
import java.util.Scanner;
public class DemoMain 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A value");
		int a = sc.nextInt();
		System.out.println("Enter B value");
		int b = sc.nextInt();
		SmallerValue sv = new SmallerValue();
		sv.compare(a, b);
		GreaterValue gv = new GreaterValue();
		gv.compare(a,b);
		sc.close();
		
;	}

}
