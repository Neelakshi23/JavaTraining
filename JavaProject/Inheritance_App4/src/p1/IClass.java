package p1;

public class IClass implements ITest
{

	@Override
	public void m1(int a) {
		System.out.println("Inside Implementation class Method");
		System.out.println("Value of a is "+a);
		
	}
	
	

}
