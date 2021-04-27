package com.java.mphasis.InvetoryProject;

import java.sql.SQLException;
import java.util.Scanner;

public class PlaceOrderMain {
	
	public static void main(String[] args) {
		
		String stockId;
		int qtyOrder;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter StockId: ");
		stockId=sc.nextLine();
		System.out.println("Enter Quantity to be ordered: ");
		qtyOrder=Integer.parseInt(sc.nextLine());
		try {
			System.out.println(new StockDAO().placeOrder(stockId, qtyOrder));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
