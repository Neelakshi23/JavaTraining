package p1;

public class CClass extends PClass
{
	public static int x=10;
	public int y=20;
	public CClass()
	{
		System.out.println("***From ChildCLass Constructor***");
		System.out.println("A value is "+a);
		System.out.println("B value is "+b);
		System.out.println("X value is "+x);
		System.out.println("Y value is "+y);
	}
	public void p1()
	{
		super.p1();
		System.out.println("****From CCLass p1()****");
		System.out.println("A value is "+a);
		System.out.println("B value is "+b);
		System.out.println("X value is "+x);
		System.out.println("Y value is "+y);
	}
	@Override
	public void m1(int a) {
		super.m1(20);
		System.out.println("***Parameterised child constructor***");
		System.out.println("A value is "+a);
		System.out.println("B value is "+b);
		System.out.println("X value is "+x);
		System.out.println("Y value is "+y);
	}
	
}
