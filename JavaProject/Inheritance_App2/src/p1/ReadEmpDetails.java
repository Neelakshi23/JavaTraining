package p1;

import java.util.Scanner;

public class ReadEmpDetails 
{
	public Scanner sc;
	public EmpData emd;




public void Read(EmpData emd)
{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter your Id");
	emd.id =sc.nextLine();
	System.out.println("Enter your Name");
	emd.name =sc.nextLine();
	System.out.println("Enter your Desg");
	emd.desg =sc.nextLine();
	System.out.println("Enter your MailId");
	emd.emc.mailId =sc.nextLine();
	System.out.println("Enter your PhNo");
	emd.emc.phNo =sc.nextLong();
	System.out.println("Enter your BasicSalary");
	emd.ems.bSal =sc.nextInt();
	emd.ems.totSal=(float)(emd.ems.bSal+emd.ems.bSal*0.75);
	sc.close();
}




}
