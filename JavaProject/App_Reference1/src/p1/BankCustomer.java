package p1;

public class BankCustomer {
	
	public long accNo;
	public String name;
	public Contact c = new Contact();
	public Account a = new Account();
	public void getBankCustomer()
	{
		
		System.out.println("***Bank Customer ****");
		System.out.println("AccNo is "+accNo);
		System.out.println("Nameis "+name);
	}

}
