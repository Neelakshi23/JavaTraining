package p2;
import p1.*;

import java.util.Scanner;
import p1.EmpData;
import p1.EmpContact;
import p1.EmpSalary;

public class EmpMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmpData ed = new EmpData();
		/*
		 * EmpContact ec = new EmpContact(); EmpSalary es = new EmpSalary();
		 */
		
		System.out.println("Enter the Emp-ID");
		ed.id = sc.nextLine();
		System.out.println("Enter the Emp_Name");
		ed.name=sc.nextLine();
		System.out.println("Enter the desgn");
		ed.desg = sc.nextLine();
		System.out.println("Enter the Emp-ph");
		ed.ec.phNo = Long.parseLong(sc.nextLine());
		System.out.println("Enter the EMp-mailID");
		ed.ec.mId=sc.nextLine();
		System.out.println("Enter the Salary");
		ed.es.sal = sc.nextInt();
		
		
		ed.getEmpData();
		ed.es.getEmpSalary();
		ed.ec.getEmpContact();
		ed.es.totaSal = ed.es.sal+(0.61F*ed.es.sal)+(0.93F*ed.es.sal);
		sc.close();
		
	}

}
