package p2;
import p1.*;
public class DemoMain 
{
	public static void main(String[] args) {
		IClass obj = new IClass();
		obj.m1(20);
		obj.m3(40);
		ITest.m2(20);
	}

}
