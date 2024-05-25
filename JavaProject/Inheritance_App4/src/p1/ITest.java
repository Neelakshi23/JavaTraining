package p1;

public interface ITest 
{
	public void m1(int a);
	public static void m2(int b)
	{
		System.out.println("Inside Static Concrete Method");
		System.out.println("Value of b is "+b);
		m5(95);
	}
	public default void m3(int c) 
	{
		
		System.out.println("Inside Default Concrete Method");
		System.out.println("Value of c is "+c);
		m5(29);
		m4(76);
	}
	private void m4(int d)
	{
		System.out.println("Inside private Concrete Method");
		System.out.println("Value of d is "+d);
	}
	
	private static void m5(int e) 
	{
		System.out.println("Inside Private static Concrete Method");
		System.out.println("Value of e is "+e);
	}
	

}
