import java.util.Scanner;

class DemoPercentage
{
float percentage(int telugu, int hindi, int english, int science, int social, int maths)
   {
        float total = telugu+hindi+english+science+social+maths;
	    float percentage = total/6;
		return percentage;
   }
}
class DemoStudent1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Subjects");
		String subject = sc.nextLine();
		System.out.println("your Subjects are  : "+subject);
        System.out.println("Enter Telugu Marks");
		int telugu = sc.nextInt();
        System.out.println("Enter Hindi Marks");
		int hindi = sc.nextInt();
        System.out.println("Enter English Marks");
		int english = sc.nextInt();
        System.out.println("Enter Science Marks");
		int science = sc.nextInt();
        System.out.println("Enter Social Marks");
		int social = sc.nextInt();
        System.out.println("Enter Maths Marks");
		int maths = sc.nextInt();
      DemoPercentage dp = new DemoPercentage();
      float result = dp.percentage(telugu,hindi,english,science,social,maths);
	  System.out.println("Percentage = "+result);

	}
}
