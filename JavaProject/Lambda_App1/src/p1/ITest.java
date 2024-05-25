package p1;

public interface ITest 
{
	public abstract void m1(int a);
	public default void m2(int b) 
	{
		System.out.println("***Default Method m2(b)***");
		System.out.println("Value of b is :"+b);
	}

}
