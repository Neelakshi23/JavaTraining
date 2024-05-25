package p1;

public class DemoInnerInterface 
{
	public static void main(String[] args) {
		
		System.out.println("----Inner Interfaces in Class----");
		System.out.println("****m1(a)****");
		SubClass.ITest1 ob = (int a)->{
		System.out.println("The value of a is : "+a);
		};
		ob.m1(11);
		System.out.println("****m11(a1)****");
		SubClass.ITest2 ob1 = (int a1)->{
			System.out.println("The value of a1 is : "+a1);
		};
		ob1.m11(23);
        System.out.println("----Inner Interface in Interfaces Class------");
        System.out.println("****m2(b)****");
		ITest.ITest3 ob2 = (int b)->{
			System.out.println("The value of b is : "+b);
		};
		ob2.m2(23);
		System.out.println("----Inner Interface in abstract Class----");
		System.out.println("****m3(c)****");
		ATest.ATest1 ob3 = (int c)->{
		System.out.println("The value of c is : "+c);
		};
		ob3.m3(32);
		System.out.println("****m33(c1)****");
		ATest.ATest2 ob4 = (int c1)->{
			System.out.println("The value of C1 is : "+c1);
		};
		ob4.m33(45);
		
	}

}
