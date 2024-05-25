package p2;
import p1.*;
import java.util.Scanner;

public class DemoMain {
	
	public Scanner sc;
	public EmpData emd;
	public static void main(String[] args) {
		EmpData emd = new EmpData();
       DisplayEmpDetails ded = new DisplayEmpDetails();
       ReadEmpDetails red = new ReadEmpDetails();
       red.Read(emd);
	ded.display(emd);
	
	}

}


