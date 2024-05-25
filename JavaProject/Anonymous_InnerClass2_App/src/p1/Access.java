package p1;

public class Access {

	public ITest getRef()
	{
		ITest ob = new ITest()
		{
			public void dis1(int a)
			{
				System.out.println("***Implemented method dis1()***");
				System.out.println("The value of a is "+a);
				
			}
			public void dis3(int c)
			{
				System.out.println("*** method dis3()***");
				System.out.println("The value of c is "+c);
				
			}
		};
		return ob;
	}
}
