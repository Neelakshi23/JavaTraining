package p1;
import java.util.Scanner;
public class StringVowel 
{
	public static void main(String[] args) {
	      Scanner s = new Scanner(System.in);
	      try(s;){
	    	  try {
	    		 System.out.println("Enter the Number of Strings:");
	    		 int n = Integer.parseInt(s.nextLine());
	    		 String str[] = new String[n];
	    		 System.out.println("Enter "+n+" Strings...");
	    		 for(int i=0;i<n;i++)
	    		 {
	    			 str[i] = new String(s.nextLine());
	    		 }//end of loop
	    		 System.out.println("====Display String-Objects====");
	    		 for(int i=0;i<n;i++)
	    		 {
	    			 System.out.println(str[i].toString());
	    		 }//end of loop
	    		 System.out.println("====Display String started with Vowel====");
	    		 for(int i=0;i<n;i++)
	    		 {
	    			 String s1 = str[i].toString();
	    			 char ch = s1.charAt(0);
	    			 switch(ch)
	    			 {
	    			   case 'a':
	        		   case 'A':
	        			   System.out.println(s1.toString());
	        			   break;
	        		   case 'e':
	        		   case 'E':
	        			   System.out.println(s1.toString());
	        			   break;
	        		   case 'i':
	        		   case 'I':
	        			   System.out.println(s1.toString());
	        			   break; 
	        		   case 'o':
	        		   case 'O':
	        			   System.out.println(s1.toString());
	        			   break;
	        		   case 'u':
	        		   case 'U':
	        			   System.out.println(s1.toString());
	        			   break;	   
	        
	    			 }//end of loop
	    		 }//end of loop
	    	  }catch(Exception e) {
	    		  System.out.println(e.toString());
	    	  }
	      }//end of try with resource
		}
}
