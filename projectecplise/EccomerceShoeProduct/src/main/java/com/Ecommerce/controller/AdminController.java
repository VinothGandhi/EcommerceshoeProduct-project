package com.Ecommerce.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ecommerceshoe.dao.AdminDao;
import com.ecommerceshoe.model.Admin;




/**
 * Servlet implementation class AdminController
 */
@WebServlet("/AdminController1")
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AdminController() {
        // TODO Auto-generated constructor stub
    }

 public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String email=req.getParameter("Email");
		String password=req.getParameter("pass");
		Admin admin=new Admin(email,password);
		AdminDao admindao=new AdminDao();
		admin=admindao.validateAdmin(admin.getAdminEmail(),admin.getPassword());
		if(admin!=null) {
			resp.sendRedirect("product.jsp");
		}
		else {
			resp.sendRedirect("index.jsp");
		}
	}

}
