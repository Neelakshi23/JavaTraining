package p1;


public class DayScholar extends Student
{
	public double transportFee;
	public double amount;
	
	public double examFee;
	public void displayDetails(double transportFee,String name,int studentId,double examFee) 
	{
		this.displayDetails("Hayan", 1, 8798.00);
		this.displayDetails("Haksh", 2, 10098.00);
		System.out.println("Inside DayScholar class");
		System.out.println("DayScholar [TransportFee=" + transportFee + ", name=" + name + ", studentId=" + studentId + ", examFee="
				+ examFee + "]");

	}
	public double payFee(double transportFee,double examFee)
	{
		this.transportFee=transportFee;
		this.examFee=examFee;
		 amount= transportFee+examFee;
		return amount;
	}

	

}
