package p1;

public class Student 
{
	 public int studentId; 
	public String name;
	public double examFee;
	public void displayDetails(String name,int studentId,double examFee)
	{
		System.out.println("Inside student class");
		System.out.println("Student [name=" + name + ", studentId=" + studentId + ", examFee="
				+ examFee + "]");
	}
	
}
