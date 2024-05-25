package p1;


	public class Access 
	{
	   public static ITest ob=null;
	   public static ITest getRef(int choice)
	   {
		   switch(choice)
		   {
		   case 1:
			   ob = (int x,int y)->
			        {
				        if(x>y) return x;
				        else return y;
			        };
			   break;
		   case 2:
			   ob = (int x,int y)->
			        {
				        if(x<y) return x;
				        else return y;
			        };
			   break;
		   }//end of switch
		   return ob;
	   }//OuterClass static method
	}//OuterClass

