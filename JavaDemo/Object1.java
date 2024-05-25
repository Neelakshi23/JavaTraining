class Object1 
{

	void meth1(){//main() method calling
     System.out.println("Meth1()");
	 System.out.println("Meth1() starting");
     meth3();//Method calling
	 System.out.println(67);
	}

	void meth2(){//meth3() method calling
    System.out.println("Meth2() ");
     meth4();//Method calling
	 System.out.println("neelakshi");
	}

	void meth3(){// meth1() method calling
    System.out.println("Meth3() ");
	meth2();//Method calling
	System.out.println(3+3);
	}
    void meth4(){//meth2() method calling
    System.out.println("Meth4() ");
	System.out.println(67+2);
	meth5();//Method calling
	}

	void meth5(){//meth4() Method calling
    System.out.println("Meth5() ");
	System.out.println(67+23);
	}

	public static void main(String[] args) 
	{
		System.out.println("Program Starting ");// starting
        Object1 obj=new Object1();// object creation
		obj.meth1();//Method calling
		System.out.println("Program ending ");
	}
}


//output:

//Program Starting
//Meth1() 
//Meth1() starting
//Meth3()
//Meth2() 
//Meth4()
//69
//Meth5()
//90
//neelakshi
//6
//67
//Program ending




