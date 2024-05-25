package p1;

public class PClass {

	public static int a=10;
	public int b=20;
	public PClass()
	{
		System.out.println("***From PCLass Constructor***");
		System.out.println("A value is "+a);
		System.out.println("B value is "+b);
	}
	public void p1()
	{
		System.out.println("****From PCLass P1()****");
		System.out.println("A value is "+a);
		System.out.println("B value is "+b);
	}
	public void m1(int a) {
		System.out.println("***Parameterised Pclass constructor***");
		System.out.println("A value is "+a);
		System.out.println("B value is "+b);
		
	}
}
