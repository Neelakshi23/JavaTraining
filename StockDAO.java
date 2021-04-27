package com.java.mphasis.InvetoryProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StockDAO {

	Connection con;
	PreparedStatement pst;
	
	public String generateStockId() throws SQLException
	{
		String cmd="select case when max(stockId) IS NULL then 'S000'"
					+"else max(stockId) end sid from stock";
		con=ConnectionHelper.getConnection();
		pst=con.prepareStatement(cmd);
		ResultSet rs=pst.executeQuery();
		rs.next();
		String stockId=rs.getString("sid");
		int sid=Integer.parseInt(stockId.substring(1));
		sid++;
		if(sid>=1 && sid<=9)
		{
			stockId="S00"+sid;
		}
		if(sid>=10 && sid<=99)
		{
			stockId="S0"+sid;
		}
		if(sid>=100 && sid<=999)
		{
			stockId="S"+sid;
		}
		return stockId;
	}
	
	public String addStock(Stock stock) throws SQLException
	{
		con=ConnectionHelper.getConnection();
		String cmd="insert into stock(stockId,itemName,price,quantityAvail)"
					+ "values(?,?,?,?)";
		String sid=generateStockId();
		pst=con.prepareStatement(cmd);
		pst.setString(1, sid);
		pst.setString(2, stock.getItemName());
		pst.setDouble(3, stock.getPrice());
		pst.setInt(4, stock.getQuantityAvail());
		pst.executeUpdate();
		return "*** STOCK ADDED SUCCESSFULLY ***";
	}
	
	public Stock searchStock(String stockId) throws SQLException
	{
		Stock stock=null;
		con=ConnectionHelper.getConnection();
		String cmd="select * from stock where stockId=?";
		pst=con.prepareStatement(cmd);
		pst.setString(1, stockId);
		ResultSet rs= pst.executeQuery();
		if(rs.next())
		{
			stock=new Stock();
			stock.setStockId(rs.getString("stockId"));
			stock.setItemName(rs.getString("itemName"));
			stock.setPrice(rs.getDouble("price"));
			stock.setQuantityAvail(rs.getInt("quantityAvail"));
		}
		return stock;
	}
	
	public String generateOrderId() throws SQLException
	{
		String cmd="select case when max(orderId) IS NULL then 'O000'"
					+"else max(orderId) end oid from orders";
		con=ConnectionHelper.getConnection();
		pst=con.prepareStatement(cmd);
		ResultSet rs=pst.executeQuery();
		rs.next();
		String orderId=rs.getString("oid");
		int oid=Integer.parseInt(orderId.substring(1));
		oid++;
		if(oid>=1 && oid<=9)
		{
			orderId="O00"+oid;
		}
		if(oid>=10 && oid<=99)
		{
			orderId="O0"+oid;
		}
		if(oid>=100 && oid<=999)
		{
			orderId="O"+oid;
		}
		return orderId;
	}
	
	public String placeOrder(String stockId,int qtyOrder) throws SQLException
	{
		Stock stock=searchStock(stockId);
		con=ConnectionHelper.getConnection();
		if(stock!=null)
		{
			double price=stock.getPrice();
			int quantityAvail=stock.getQuantityAvail();
			if(quantityAvail-qtyOrder>0)
			{
				double billAmount = qtyOrder*price;
				String cmd="update stock set quantityAvail=quantityAvail-?"
							+ "where stockId=?";
				pst=con.prepareStatement(cmd);
				pst.setInt(1, qtyOrder);
				pst.setString(2, stockId);
				pst.executeUpdate();
				String orderId=generateOrderId();
				cmd="insert into orders(orderId,stockId,qtyOrder,billAmount)"
						+ "values(?,?,?,?)";
				pst=con.prepareStatement(cmd);
				pst.setString(1, orderId);
				pst.setString(2, stockId);
				pst.setInt(3, qtyOrder);
				pst.setDouble(4, billAmount);
				pst.executeUpdate();
				cmd="update amount set gamt=gamt+?";
				pst=con.prepareStatement(cmd);
				pst.setDouble(1, billAmount);
				pst.executeUpdate();
				return "*** ORDER PLACED SUCCESSFULLY ***";
			}
			else
			{
				return "*** INSUFFICIENT QUANTITY ***";
			}	
		}
		else
		{
			return "*** INVALID STOCKID ***";
		}
	}
}
