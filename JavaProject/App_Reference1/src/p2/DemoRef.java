package p2;
import java.util.Scanner;
import p1.*;

public class DemoRef {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankCustomer bc = new BankCustomer();
		System.out.println("Enter the Acc-No ");
		bc.accNo = Long.parseLong(sc.nextLine());
		System.out.println("Enter the CustName ");
		bc.name = sc.nextLine();
		System.out.println(" Enter Mail Id");
		bc.c.mailId = sc.nextLine();
		System.out.println(" Enter PhoneNo");
		bc.c.phNo = Long.parseLong(sc.nextLine());
		System.out.println(" Enter AccType");
		bc.a.accType = sc.nextLine();
		System.out.println(" Enter Balance");
		bc.a.bal = sc.nextFloat();
		bc.getBankCustomer();
		bc.c.getContact();
		bc.a.getAccount();
		
		sc.close();
	}

}
