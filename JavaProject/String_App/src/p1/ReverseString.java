package p1;
import java.util.Scanner;
public class ReverseString 
{
	public static void main(String[] args) {
	       Scanner s = new Scanner(System.in);
	       try(s;){
	    	   System.out.println("Enter the String:");
	    	   String str = s.nextLine();
	    	   int len = str.length();
	    	   int count=0;
	    	   System.out.println("=====String reverse=====");
	    	   for(int i=len-1;i>=0;i--)
	    	   {
	    		   char ch = str.charAt(i);
	    		   System.out.print(ch+" ");
	    	   }//end of loop
	    	   int j = len-1;
	    	   for(int i=0;i<=len-1;i++)
	    	   {
	    		   if(str.charAt(i) == str.charAt(j))
	    		   {
	    			   count++;
	    		   }
	    		   j--;
	    	   }//end of loop
	    	   if(count==len)
	    	   {
	    		   System.out.println("\nPalindrome String...");
	    	   }
	    	   else
	    	   {
	    		   System.out.println("\nNot Palindrome String...");
	    	   }
	       }//end of try
		}
	}

