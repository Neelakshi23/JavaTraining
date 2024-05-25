import java.util.Scanner;

class DemoCon 
{
	int a=10;
    int b;
	DemoCon(String name, long phoneNo, String address)
	{
        System.out.println(" your name"+name);
		System.out.println(" your PhNo"+phoneNo);
		System.out.println(" your address"+address);
	
	}
	 DemoCon(){
    b=20;
	  System.out.println("b is "+b);
	}

	void getDemoCon(){
     int c;
	  System.out.println("a is "+a);
     // System.out.println("c is "+c);
	}
	void getDemoCon(int d7){
     int n=d7;
	  System.out.println("a is "+a);
       System.out.println("d is "+n);
	}

	public static void main(String[] args) 
	{
		
        
        DemoCon d2 = new DemoCon();
		d2.getDemoCon();
		//int res=d2.getDemoCon(56);
        d2.getDemoCon(56);
		DemoCon d = new DemoCon("Akhil",7766757687l,"Tirupati");
		DemoCon d1 = new DemoCon("Neelakshi",77667687l,"Munagapaka");
	
        
}
}
