package p1;

public class DemoString1 {
	
	public static void main(String[] args) {
	String s1 = "nit";
	String s2 = new String("program");
	System.out.println("======s1======");
	System.out.println("data in s1 : "+s1.toString());
	int len1 = s1.length();
	System.out.println("length of s1 : "+len1);
	char ch1 = s1.charAt(1);
	System.out.println("char at index 1 : "+ch1);
	System.out.println("======s2======");
	System.out.println("data in s2 : "+s2.toString());
	int len2 = s2.length();
	System.out.println("length of s2 : "+len2);
	char ch2 = s2.charAt(4);
	System.out.println("char at index 4 : "+ch2);

	
	String s3 = new String("Neelakshi");
	System.out.println("Data in s3 is .."+s3.toString());
	System.out.println("Length of s3 is .."+s3.length());
	System.out.println("Char at index 5 .."+s3.charAt(5));
	}
	}


