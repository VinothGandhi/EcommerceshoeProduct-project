package com.Ecommerce.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ecommerceshoe.dao.UserDao;
import com.ecommerceshoe.model.Users;




/**
 * Servlet implementation class User
 */
@WebServlet("/User")
public class User extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public User() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String email=req.getParameter("UserEmail");
		  String password=req.getParameter("Userpass");
//		  Users user=new Users(null,password, null, email, null, 0);
		  UserDao userdao=new UserDao();
		  Users user=userdao.validateUser(email,password);
		  if(user!=null) {
				resp.sendRedirect("newUser.jsp");
			}
			else {
				resp.sendRedirect("User.jsp");
			}
	}
	
	  
	  
	  
	  
	  
	 
		
	}


