package p1;

@SuppressWarnings("serial")
public class Calculate extends Exception{
	
	public Calculate(String msg) {
		super(msg);
	}
	public void compareTo(int x, int y) throws Calculate {
	try {
		
			if(x==0 || y==0)
			{
				Calculate ob1 = new Calculate("Integers are Equal");
				throw ob1;
			}
			if(x<0 || y<0)
			{
				Calculate ob2 = new Calculate("Integers are Negative");
				throw ob2;
			}
			float z = (float)(x+y)/2;
			System.out.println("Average is : "+z);
	    }
	
	catch(Calculate ob)
	{
	//System.out.println(ob.toString());
	throw ob;
	}
	}
		
	}


