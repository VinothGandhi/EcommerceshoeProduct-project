package com.ecommerceshoe.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ecommerceshoe.daoimpl.AdminDaoImpl;
import com.ecommerceshoe.daoimpl.UserDaoImpl;
import com.ecommerceshoe.model.Admin;
import com.ecommerceshoe.model.Users;






/**
 * Servlet implementation class User
 */
@WebServlet("/User")
public class UserLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String email=req.getParameter("UserEmail");
		  String password=req.getParameter("Userpass");
		 
//		  Users user=new Users(null,password, null, email, null, 0);
		  Admin admin=new Admin(email,password);
			AdminDaoImpl admindao=new AdminDaoImpl();
			admin=admindao.validateAdmin(admin.getAdminEmail(),admin.getPassword());
		  UserDaoImpl userdao=new UserDaoImpl();
		  Users user=userdao.validateUser(email,password);
		 if(admin!=null) {
			 resp.sendRedirect("WelcomeAdmin.jsp");
		 }
		 
		 
		 else if(user!=null) {
			  HttpSession session=req.getSession();
			  System.out.println(user.getUserid());
			  session.setAttribute("CurrentUser",user );
			  
				resp.sendRedirect("showPro.jsp");
			}
			else {
			
				resp.sendRedirect("User.jsp");
			}
	}
	
	  
	  
	  
	  
	  
	 
		
	}


