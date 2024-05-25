package p1;

import p2.*;

public class StuData {

public String rollNo,name,branch;
public StuContact sc = new StuContact();
public StuAddress sa = new StuAddress();
public StuResult sr = new StuResult();


public void getStuData()
{
	System.out.println("***StuDAta***");	
	System.out.println("Rollno is : "+rollNo);
	System.out.println("Name is : "+name);
	System.out.println("Branch is : "+branch);
}
}
