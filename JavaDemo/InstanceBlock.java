class Test2
{
	static int a;
	int b;
	{
		a++;
		b++;
     System.out.println("Inside Instance Block");
	 System.out.println("A value Inside Instance Block "+a);
	 System.out.println("b value Inside Instance Block "+b);
	}
	
	void dis()
	{
		a++;
		b++;
     System.out.println("Inside Instance Method");
	 System.out.println("A value Inside Instance Method "+a);
	 System.out.println("b value Inside Instance Method "+b);
	}
	Test2()
	{
		a++;
		b++;
     System.out.println("Inside Constructor ");
	 System.out.println("A value Inside Constructor "+a);
	 System.out.println("b value Inside Constructor "+b);
	}
}
	class InstanceBlock
	{
		public static void main(String[] args) 
	{
		
     System.out.println("**** Object-1 ****");
	 
		Test2 ob1 = new Test2();
		ob1.dis();
		System.out.println("**** Object-2****");
        Test2 ob2 = new Test2();
		ob2.dis();
		
	}

	}
	
