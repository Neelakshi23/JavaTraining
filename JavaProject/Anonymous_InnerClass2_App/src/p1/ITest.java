package p1;

public interface ITest {

	public abstract void dis1(int a);
	public default void dis2(int b)
	{
		System.out.println("***Default method in Interface***");
	System.out.println("The value of b is :"+b);
	}
}
