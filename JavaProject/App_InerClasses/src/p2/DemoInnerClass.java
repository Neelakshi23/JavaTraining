package p2;

import p1.Access;
import p1.ITest;

public class DemoInnerClass 
{
	public static void main(String[] args) {
		System.out.println("Interface InnerClass");
		ITest.InnerClass ob1 = new ITest.InnerClass();
		ob1.m1(23);
		System.out.println("Abstract InnerClass");
		Access ob = new Access() {
			//Anonymous InnerClass without members
	
		};
		
		Access.SubClass2 ob2 = ob.new SubClass2();
		ob2.m2(12);
		Access.SubClass3 ob3 = new Access.SubClass3();
		ob3.m3(13);
		
		
	}

}
