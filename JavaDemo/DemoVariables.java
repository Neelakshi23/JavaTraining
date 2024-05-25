	class DemoVariables 
	{

		static int a=10; //Class Variable or Static variable
		int b=20; //Instance Variable or object variable

		static void dis1(){//dis2() calling method
        //DemoVariables obj1 = new DemoVariables();
         		//obj1.dis2(); 
         
	    System.out.println("From dis1() Value of a is "+a);
		
		}

		void dis2(){//main() calling method

		//DemoVariables obj = new DemoVariables();
		dis1();
         System.out.println("From dis2() Value of a is "+a);
         System.out.println("From dis2() Value of b is "+b);
		}

		public static void main(String[] args) 
		{
			int c= 30; //Local Variables or Method variables
            System.out.println("Start of the program ");
			System.out.println("Value of a is "+a);
			System.out.println("Value of c is "+c);

			DemoVariables dv = new DemoVariables();
		
			 System.out.println("Value of b is "+dv.b);
             
		  //  dis1();
            dv.dis2();

           System.out.println("End of the program ");
		}
	}
