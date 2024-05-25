import java.util.Scanner;

class DemoCon1 
{
	
	String name, mailId, city;
	long phNo;
	DemoCon1(String name, String b, String c, long d)
	{
		this.name=name;
		mailId=b;
	    city=c;
		phNo=d;
         System.out.println("DemoCon1 with Instance variable");
	}
	void getDemoCon1()
	{
        System.out.println("Name1 is :"+name);
		System.out.println("mailId1 is :"+mailId);
		System.out.println("city1 is :"+city);
		System.out.println("phNo1 is :"+phNo);
	}
	
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Enter your mailId");
		String mailId = sc.nextLine();
		System.out.println("Enter your city");
		String city = sc.nextLine();
		System.out.println("Enter your phNo");
		long phNo = sc.nextLong();
		DemoCon1 d = new DemoCon1(name, mailId, city, phNo);
		
		d.getDemoCon1();
	}
}
