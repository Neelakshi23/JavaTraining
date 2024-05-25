package p3;
import p1.*;
import p1.StuData;
import p2.*;

import java.util.Scanner;


public class StudentMainClass {
	public static void main(String[] args) 
	{
		StuData sd = new StuData();
		//StuContact sc = new StuContact();
		/*
		 * StuAddress sa = new StuAddress(); StuResult sr = new StuResult();
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Student Data");
		System.out.println("Enter Student RollNo:");
		 sd.rollNo=s.nextLine();
		System.out.println("Enter Student branch");
		sd.branch=s.nextLine();
		
		System.out.println("Enter your Contact Details");
		System.out.println("Enter Student MailId");
		sd.sc.mailId=s.nextLine();
		System.out.println("Enter Student phno");
		sd.sc.phNo=s.nextLong();
		
		System.out.println("Enter Student Address");
		
		System.out.println("Enter Student HNo");
		sd.sa.hNo=s.nextLine();
		System.out.println("Enter Student Name");
		sd.sa.sName=s.nextLine();
		System.out.println("Enter Student City");
		sd.sa.city=s.nextLine();
		System.out.println("Enter Student pincode");
		sd.sa.pinCode=s.nextInt();
		
		System.out.println("Enter Student Results");
		int i=1;
		while(i<=6)
		{
		    System.out.println("Enter Student Sub: "+i);
			System.out.println("Enter Student Marks");
			int marks=s.nextInt();
			if(marks>0 && marks<=100)
			{
			sd.sr.total = sd.sr.total +marks;
			i++;
			continue;
			}
		}
		sd.sr.per = (sd.sr.total)/6;
		sd.getStuData();
		sd.sc.getStuContact();
		sd.sa.getStuAddress();
		sd.sr.getResult();
		//System.out.println("percentage is "+sr.total);
		
			
		s.close();
	}

}
