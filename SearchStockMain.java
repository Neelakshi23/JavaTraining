package com.java.mphasis.InvetoryProject;

import java.sql.SQLException;
import java.util.Scanner;

public class SearchStockMain {

	public static void main(String[] args) {
		String stockId;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter StockId: ");
		stockId=sc.nextLine();
		StockDAO dao=new StockDAO();
		Stock stock;;
		try {
			stock = dao.searchStock(stockId);
			if(stock!=null)
			{
				System.out.println(stock);
			}
			else
			{
				System.out.println("*** RECORD NOT FOUND ***");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
