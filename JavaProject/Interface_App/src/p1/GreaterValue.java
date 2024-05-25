package p1;

public class GreaterValue implements IComparable
{

	@Override
	public int compare(int a, int b) {
		if(a>b)
		{
			System.out.printf("Greater value is %d",a);
			System.out.println();
			return a;
		}
		
		else
		{
			System.out.printf("Greater value is %d",b);
			System.out.println();
			return b;
		}
		
		
	}

}
