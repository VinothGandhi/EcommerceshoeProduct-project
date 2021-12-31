package com.ecommerceshoe.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ecommerceshoe.interfaceDao.UserDaoInterface;
import com.ecommerceshoe.model.Admin;
import com.ecommerceshoe.model.Product;
import com.ecommerceshoe.model.Users;

public class UserDao implements UserDaoInterface {

	public  void inserUser(Users user) {
		ConnectionUtil conUtil = new ConnectionUtil();
		String insertQuery = "insert into  users1(Name,password,mobile_no,email_id,Address,wallet) values(?,?,?,?,?,?)";
		Connection con = conUtil.getDbconnection();
		PreparedStatement pstmt = null;
		try {

			pstmt = con.prepareStatement(insertQuery);
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getPassword());
			pstmt.setLong(3, user.getMobileNo());
			pstmt.setString(4, user.getEmail());
			pstmt.setString(5, user.getAddress());
			pstmt.setDouble(6, user.getWallet());
			int i = pstmt.executeUpdate();
			System.out.println(i + "Value Inserted Successfully");

		} catch (SQLException e) {
			// catch the exception and get that message
			e.printStackTrace();
			System.out.println("Value not Setted in the query");
		}
	}

	public  Users validateUser(String email, String password) {
		String validateQuery = "select * from users1 where email_id ='"+email+"' and password= '"+password+"'";
		ConnectionUtil conUtil;
		Connection con = ConnectionUtil.getDbconnection();
		
		Statement stmt=null;
		Users user=null;
		try
		{
			stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(validateQuery);
			if (rs.next()) {
				// System.out.println(rs.getString(2)+" "+rs.getLong(3));

				user = new Users(rs.getString(2),password,rs.getLong(4),email,rs.getString(6),rs.getDouble(7));
				System.out.println(user);
			}

		} catch (SQLException e) {
			// T5ODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Statement error");
		}
		return user;
	}

	public int findUserID(Users user) {
		String findId = "select user_id from Users1 where email_id='"+user.getEmail()+"'";
		Connection con = ConnectionUtil.getDbconnection();
		Statement stmt=null;
		int id = 0;
		try {
		     stmt=con.createStatement();
		     ResultSet rs=stmt.executeQuery(findId);
		     if(rs.next())
		     {
		    	 id=rs.getInt(1);
		     }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return id;
	}
	public  Users findUser(String email) {
		String Query1="select  * from Users1 where email_id='"+email+"'";
		ConnectionUtil conUtil = new ConnectionUtil();
		Connection con = ConnectionUtil.getDbconnection();
		Statement stmt=null;
		Users user=null;
		try
		{
			stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(Query1);
			if (rs.next()) {
				// System.out.println(rs.getString(2)+" "+rs.getLong(3));

				user = new Users(rs.getString(2),rs.getString(3),rs.getLong(4),rs.getString(5),rs.getString(6),rs.getDouble(7));
				System.out.println(user);
			}

		} catch (SQLException e) {
			// T5ODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Statement error");
		}
		
		
		
		return user;
	
	}
	public Users findUserId(int id) {
		ConnectionUtil conUtil = new ConnectionUtil();
		Connection con = ConnectionUtil.getDbconnection();
		String Query="select * from Users1 where user_id='"+id+"'";
		Users user=null;
		Statement stmt;
		try {
			stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(Query);
			if(rs.next()) {
				user =new Users(rs.getString(2),rs.getString(3),rs.getLong(4),rs.getString(5),rs.getString(6),rs.getDouble(7));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	return user;
	}
	
	public   int updateuserWallet(Users user) {
		ConnectionUtil conUtil = new ConnectionUtil();
		Connection con = ConnectionUtil.getDbconnection();
		String Query="update users1 set wallet=? where email_id=?";
		String getWalletquery="select wallet from users1 where email_id=?";
		PreparedStatement pstmt=null;
		int i=0;
		try {
		  pstmt = con.prepareStatement(getWalletquery);
			pstmt.setString(1,user.getEmail());
	       ResultSet rs=pstmt.executeQuery();
	       double wallet=0;
	       if(rs.next()) {
	    	   wallet=rs.getDouble(1);
	       }
	       pstmt = con.prepareStatement(Query);
	       pstmt.setDouble(1,wallet+user.getWallet());
	       pstmt.setString(2,user.getEmail());
	        i=pstmt.executeUpdate();
	       System.out.println(i+"updated");
	       
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		return i;

	}
	
	public  int Walletupdate(double OrderPrices, Users user) {
		ConnectionUtil conUtil = new ConnectionUtil();
		Connection con = ConnectionUtil.getDbconnection();
		System.out.println(OrderPrices);
		String Query = "update users1 set wallet=wallet-? where email_id=?";
		String getWalletquery = "select wallet from users1 where email_id=?";
		PreparedStatement pstmt = null;
		int a = 0;
		try {
			pstmt = con.prepareStatement(getWalletquery);
			
			pstmt.setString(1, user.getEmail());
			ResultSet rs = pstmt.executeQuery();
			double wallet = 0;
			if (rs.next()) {
				wallet = rs.getDouble(1);
			}
			pstmt = con.prepareStatement(Query);
			pstmt.setDouble(1, OrderPrices);
			pstmt.setString(2, user.getEmail());
			a = pstmt.executeUpdate();
			System.out.println(a + "updated");

		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return a;

	}
}
