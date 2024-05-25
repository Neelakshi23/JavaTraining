import java.util.Scanner;

class DemoLoop3 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n Value");
		int n = sc.nextInt();
		int i=0;
		int sum =0;
		while(i<n)
		{
        
		 if(i%5!=0){
		 sum =sum+i;
         i++;
		 }
		  
		}	
		System.out.println("Sum is "+sum);


		
		}
}
