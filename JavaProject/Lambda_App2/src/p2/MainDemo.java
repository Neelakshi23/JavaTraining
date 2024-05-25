package p2;

import java.util.Scanner;

import p1.Access;
import p1.ITest;

public class MainDemo 
{
public static void main(String[] args) {

	       Scanner s = new Scanner(System.in);
	       System.out.println("Enter the value-1:");
	       int v1 = s.nextInt();
	       System.out.println("Enter the value-2:");
	       int v2 = s.nextInt();
	       if(v1==v2) {
	    	   System.out.println("Values are equal....");
	       }else {
	    	   System.out.println("-----Choice-----");
	    	   System.out.println("\t1.GreaterValue"
	    	   		+ "\n\t2.SmallerValue");
	    	   System.out.println("Enter the Choice:");
	    	   int choice = s.nextInt();
	    	   ITest ob = Access.getRef(choice);
	    	   if(ob==null) {
	    		   System.out.println("Invalid Choice....");
	    	   }else {
	    		   int res = ob.compareTo(v1, v2);
	    		   System.out.println("Result:"+res);
	    	   }
	       }
	       s.close();
		}
	}
