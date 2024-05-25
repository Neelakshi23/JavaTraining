package p1;

public class B extends A{
	
	public int x=100;
	public static int y=200;
	
	static
	{
		y++;
		System.out.println("***Child class Static block***");
		//System.out.println("A value is "+x);
		System.out.println("x value is "+y);
	}
	{
		x++;
		y++;
		System.out.println("***Child class Instance block***");
		System.out.println("x value is "+x);
		System.out.println("y value is "+y);
	}
	public B(){
		System.out.println("***Child class Constructor***");
		System.out.println("x value is "+x);
		System.out.println("y value is "+y);
	}
	
	public void dis1()
	{
		System.out.println("***Child class Instance Method***");
		System.out.println("x value is "+x);
		System.out.println("y value is "+y);
	}
	public static void dis2() {
		System.out.println("***Child class Static Method***");
		//System.out.println("A value is "+a);
		System.out.println("y value is "+y);
		
	}

}
