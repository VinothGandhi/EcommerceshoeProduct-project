package com.ecommerceshoe.interfaceDao;

import java.sql.ResultSet;

import com.ecommerceshoe.model.Users;

public interface InvoiceDaoInterface {
	public ResultSet showBill(Users user);

}
