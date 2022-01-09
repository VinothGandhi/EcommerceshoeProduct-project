package com.ecommerceshoe.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ecommerceshoe.daoimpl.OrderDaoImpl;
import com.ecommerceshoe.daoimpl.UserDaoImpl;
import com.ecommerceshoe.model.Users;

/**
 * Servlet implementation class OrderCancelController
 */

public class OrderCancelController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public OrderCancelController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
HttpSession session=request.getSession();
		
		Users user=(Users)session.getAttribute("CurrentUser");
		int productid=Integer.parseInt(request.getParameter("pid"));
		double price=Double.parseDouble(request.getParameter("price"));
		OrderDaoImpl orderdaoimpl=new OrderDaoImpl(); 
		boolean b=orderdaoimpl.orderCancel(productid);
		if(b) {
			UserDaoImpl userdaoimpl=new UserDaoImpl();
			boolean b1=userdaoimpl.RefundWallet(user, price);
			if(b1) {
				HttpSession session1=request.getSession();
				session1.setAttribute("refund", true);
				response.sendRedirect("OrderCancel.jsp");
			}
		}
		
	}
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		

	}
	}
