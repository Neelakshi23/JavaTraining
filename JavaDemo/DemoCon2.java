import java.util.Scanner;

class UserReg
{
    String name1, password, fName, lName, address1; 
	long phNo;
	String mailId1;
	UserReg(String name1, String password, String fName, String lName, String address1, long phNo, String mailId1)
	{
		this.name1 =name1;
		this.password = password;
		this.fName = fName;
		this.lName= lName;
		this.address1 = address1;
		this.phNo = phNo;
		this.mailId1 = mailId1;
    }
    void getUserDetails()
	{
	     System.out.println(" user name :"+name1);
		 System.out.println(" user password :"+password);
		 System.out.println(" user fName :"+fName);
		 System.out.println(" user LNme :"+lName);
		 System.out.println(" user Address :"+address1);
		 System.out.println(" user phno :"+phNo);
		 System.out.println(" user MailId :"+mailId1);
	}
	
	
}


class DemoCon2 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user name :");
		String n = sc.nextLine();
		System.out.println("Enter user password :");
		String p = sc.nextLine();
		System.out.println("Enter user FirstName :");
		String fn = sc.nextLine();
		System.out.println("Enter user Lastname :");
		String ln = sc.nextLine();
		System.out.println("Enter user Address :");
		String ad = sc.nextLine();
		System.out.println("Enter user PhNo :");
		long phNo = Long.parseLong(sc.nextLine());
		System.out.println("Enter user mailId :");
		String mailId = sc.nextLine();
		UserReg u = new UserReg(n,p, fn,ln, ad,phNo,mailId);
		//DemoCon2 d = new DemoCon2();
		u.getUserDetails();
		
	}
}
