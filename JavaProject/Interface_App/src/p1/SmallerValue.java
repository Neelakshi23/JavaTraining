package p1;

public class SmallerValue implements IComparable
{
	public int compare(int a, int b) {
		if(a<b)
		{
			System.out.printf("Smaller value is %d",a);
			System.out.println();
			return a;
		}
		else {
			System.out.printf("Smaller value is %d",b);
			System.out.println();
			return b;
		}
		
	}

}
