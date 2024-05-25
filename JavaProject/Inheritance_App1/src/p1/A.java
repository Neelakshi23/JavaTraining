package p1;

public class A {
	
	public int a =10;
	public static int b=20;
	{
		a++;
		b++;
		System.out.println("***parent class Instance Block***");
		System.out.println("A value is "+a);
		System.out.println("B value is "+b);
	}
	static {
		b++;
		System.out.println("***parent class Static Block***");
		//System.out.println("A value is "+a);
		System.out.println("B value is "+b);
	}

	public A() {
		System.out.println("***parent Constructor***");
		System.out.println("A value is "+a);
		System.out.println("B value is "+b);
	}
	public void m1()
	{
		System.out.println("***P class Instance Method***");
		System.out.println("A value is "+a);
		System.out.println("B value is "+b);
	}
	public static void m2() {
		System.out.println("***P class Static Method***");
		//System.out.println("A value is "+a);
		System.out.println("B value is "+b);
		
	}
	

}
