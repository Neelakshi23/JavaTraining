package p2;

import p1.Access;
import p1.ITest;

public class MainDemo 
{
	public static void main(String[] args) {
		Access ac = new Access();
		ITest ob = ac.getRef();
		ob.m1(34);
		ob.m2(22);
	}

}
