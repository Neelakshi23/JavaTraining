class StaticBlock 
{
	static int a;
	{
		System.out.println("Instance Block");
		System.out.println("a inside nstance Block "+a);
	}
	static
	{
		System.out.println("Static Block");
		System.out.println("a inside Static Block "+a);
	}
	static void print()
	{
		System.out.println("Static Mathod");
		System.out.println("a inside Static Mathod "+a);
	}
    
	void instanceMethod()
	{
		int a=50;
		System.out.println("Inside Instance Method");
		System.out.println("a inside Instance Method "+a);
	}
	StaticBlock()
	{
		System.out.println("Inside constructor");
		System.out.println("a inside constructor "+a);
	}
	public static void main(String[] args) 
	{
		int a=100;
		System.out.println("Main Method :");
		StaticBlock ob = new StaticBlock();
		ob.instanceMethod();
		
		System.out.println("a inside method "+a);
		StaticBlock.print();
	}
}
