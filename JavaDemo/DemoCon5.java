import java.util.Scanner;

class BankCustomer
{
	long acctNo;
	String name, acctType, branch;float balance;
	void setAcctNo(long acctNo)
	{
		this.acctNo = AcctNo;
	}
	void setName(String name)
	{
		this.name = name;
	}
	void setAcctType(String AcctType)
	{
		this.acctType = AcctType;
	}
	void setBalance(float balance)
	{
		this.balance = balance;
	}
	void setBranch(String branch)
	{
		this.branch = branch;
	}
	String getAccNo()
	{
		return AcctNo;
	}
	String getName()
	{
		return name;
	}
	String getAcctType()
	{
		return AcctType;
	}
	String getBalance()
	{
		return balance;
	}
	String getBranch()
	{
		return branch;
	}
}

class DemoCon5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		BankCustomer ob = new BankCustomer();
		System.out.println("Enter Acct no");
		ob.setAccNo(sc.nextLong());
		System.out.println("Enter Cust Name ");
		ob.setName(sc.nextLine());
		System.out.println("Enter Balance ");
		ob.setBalance(sc.nextFloat());
		System.out.println("Enter AccType ");
		ob.setAccType(sc.nextLongLine());
		System.out.println("Enter branch ");
		ob.setBranch(sc.nextLine());
		System.out.println(" Cust Name is "+ob.getAccNO());
		System.out.println(" Acct no is "+ob.getName());
		System.out.println(" Balance is "+ob.getBalance());
		System.out.println(" AccType is "+ob.getAccType());
		System.out.println(" branch is "+ob.getBranch());
	}
}
