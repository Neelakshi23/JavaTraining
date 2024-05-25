package p1;

public class Access 
{
	public ITest getRef()
	{
		ITest ob = (int a)->
		{
			System.out.println("***Lambda Expression for m1() ***");
			System.out.println("Value of a is :"+a);
		};
		return ob;
	}
}
