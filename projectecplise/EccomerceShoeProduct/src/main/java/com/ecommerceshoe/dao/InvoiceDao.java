package com.ecommerceshoe.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ecommerceshoe.interfaceDao.InvoiceDaoInterface;
import com.ecommerceshoe.model.Users;


public class InvoiceDao implements InvoiceDaoInterface {
	public ResultSet showBill(Users user) {
	
		String showQuery = "select u.name,u.mobile_no,u.email_id,u.address,o.products_id,o.quantity,o.price,o.order_date from users1 u join Orders_details o on u.user_id=o.user_id";
		
		Connection con = ConnectionUtil.getDbconnection(); 
		ResultSet rs=null;
		try {
			Statement stmt = con.createStatement();
			 rs = stmt.executeQuery(showQuery);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	

}
}
