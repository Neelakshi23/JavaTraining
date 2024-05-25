class StackOverFlow 
{

	void add(int i){
		System.out.println(i);
		i++;
		add(i);

	}
	public static void main(String[] args) 
	{
		StackOverFlow t = new StackOverFlow();
		System.out.println("Start");
		t.add(1);
        
		System.out.println("End");
	}
}
