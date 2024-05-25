package p1;

import java.util.Scanner;

public class OuterClass //outerClass
{
 public int a;
 public static int b;
	public void show1(){
		System.out.println("OuterClass Method");
		System.out.println("The value of a is "+a);
		System.out.println("The value of a is "+b);
	}
	public static void m1()
	{
		System.out.println("OuterClass Static Method");
		System.out.println("The value of a is "+b);
	}
	public OuterClass(int a, int b)
	{
		System.out.println("OuterClass Constructor");
		
		this.a=a;
		OuterClass.b=b;
		System.out.println("a value"+a);
		System.out.println("b value"+b);
	}
	
	public OuterClass() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("OuterClass variables Reading");
		System.out.println("Enter a value");
		int a = sc.nextInt();
		System.out.println("Enter b value");
		int b = sc.nextInt();
		System.out.println("InnerClass variables Reading");
		System.out.println("Enter x value");
		int x = sc.nextInt();
		System.out.println("Enter y value");
		int y = sc.nextInt();
		System.out.println("OuterClass Main Method");
		OuterClass oc = new OuterClass(a,b);
		oc.show1();
		OuterClass.ClassA  ca = new OuterClass.ClassA(x,y);
		ca.show();//OuterClass methods
		OuterClass.m1();
		ClassA.m2();//InnerClass ClassA methods
		ClassC c = new OuterClass().new ClassC();
		c.nonStatic();//ClassC InnerClass methods
		ClassC.m3();
        }
	public static class ClassA//Static InnerClass
	{
		public int x;
		public static int y;
		public void show(){
			System.out.println("InnerClass Constructor");
			System.out.println("x value"+x);
			System.out.println("y value"+y);
		}
		public static void m2()
		{
			
			System.out.println("InnerClass Static Method");
			System.out.println("The value of X is "+y);
		}
		public ClassA(int x, int y)
		{
			this.x=x;
			this.y=y;
			System.out.println("InnerClass Instance Method");
			System.out.println("x value"+x);
			System.out.println("y value"+y);
		}
		public ClassA() {
			// TODO Auto-generated constructor stub
		}
	
	}
	public class ClassC{
		public int i;
		public static int j;
		
		public void nonStatic()
		{
		System.out.println("InnerClass NOn-Static Method from NonStatic class");
		System.out.println("The value of i "+i);
		System.out.println("The value of j "+j);
		System.out.println("The value of a is "+a);
		System.out.println("The value of a is "+b);
		/*
		 * System.out.println("x value"+x); System.out.println("y value"+y);
		 */
		}
		public static void m3()
		{
			System.out.println("InnerClass Static Method from NonStatic class");
			System.out.println("The value of j is "+j);
			System.out.println("The value of a is "+b);
		}
		ClassC c = new OuterClass().new ClassC();//To create obj of outerClass
		ClassA a = new ClassA(); //(we can create object directly of Innerclass in a Innerclass)
		
	}
	
	
}
 