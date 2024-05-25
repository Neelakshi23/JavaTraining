package p1;

public class IClass implements ITest2
{

	@Override
	public void m1(int b) {
	System.out.println("Inside Implementation class m2()");
	System.out.println("The value of B is "+b);
		
	}
	public void m2(int a) {
		System.out.println("Inside Implementation class m1()");	
		System.out.println("The value of A is "+a);
	}

}
