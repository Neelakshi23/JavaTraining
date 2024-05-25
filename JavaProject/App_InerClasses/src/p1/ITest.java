package p1;

public interface ITest 
{
	public static class InnerClass
	{
		public void m1(int a)
		{
			System.out.println("***Inside Interface Inner Class****");
			System.out.println("The value of a is :"+a);
		}
	}

}
