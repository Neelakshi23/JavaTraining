	import java.util.Scanner;

	class GreatestReturns 
	{
	 int getGreatest(int a , int b)
	   {
		 if(a==0 || b==0)
		   {
			 return -1;
		   }
		   if(a<0 || b<0)
		   {
			   return -2;
		   }
         if(a>b)
		   {
			 return a;
		   }
		   else
		   {
			   return b;
		   }
	   }

	  int getLeastNumber(int a, int b)
		{
           if(a==0 || b==0)
		   {
			 return -1;
		   }
		   if(a<0 || b<0)
		   {
			   return -2;
		   }
		   if(a<b)
		   {
			 return a;
		   }
		   else
		   {
			   return b;
		   }
		}
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a value");
			int a=sc.nextInt();
			System.out.println("Enter b value");
			int b=sc.nextInt();
			GreatestReturns g = new GreatestReturns();
			int greater= g.getGreatest(a,b);
			System.out.println("Greater value is "+greater);
			int smaller = g.getLeastNumber(a,b);
            System.out.println("SMaller value is "+smaller);

		}
	}