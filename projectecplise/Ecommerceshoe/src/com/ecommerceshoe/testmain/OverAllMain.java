package com.ecommerceshoe.testmain;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.ecommerceshoe.dao.ConnectionUtil;
import com.ecommerceshoe.dao.UserDao;
import com.ecommerceshoe.model.Users;

public class OverAllMain {

	public static void main(String[] args) {
		
		
	//	UserDao userdao =new UserDao();
		Scanner sc=new Scanner(System.in);
		System.out.println("\n1.Createaccount\n2.login\nEnter your Choice");
		int choice=Integer.parseInt(sc.nextLine());
		Users user=null;
		switch(choice) {
		case 1:
			String  Name=null;
			String password=null;
			long mobileNo=0;
			String  email=null;
			String Address=null;
			do{
				System.out.println("enter the Username details");
				  Name=sc.nextLine();
				  if(Name.isEmpty()) 
				  {
					  System.out.println("name cant be empty");
				  }
				  if(!Name.matches("[a-zA-z0-9]{3,}")) 
				  {
					  System.out.println("name should be maximum 3 character");
				  }
			}
			while(!Name.matches("[a-zA-z0-9]{3,}"));
			
		do 
		{
		System.out.println("enter the Password");
		password=sc.nextLine();
		if(password.isEmpty())
		{
			  System.out.println("password cant be empty");
		}
		if(!password.matches("[a-zA-Z0-9@#!.&]{8,16}"))
		{
			System.out.println("password should be 8 character");
		}
		}
		while(!password.matches("[a-zA-Z0-9@#!.&]{8,16}"));
		
		String tempmobile=null;
		do 
		{
		System.out.println("enter the Mobileno");
        tempmobile=sc.nextLine();
        if(tempmobile.isEmpty()) 
        {
			  System.out.println("mobilenumber cant be empty");
		}
        if(!tempmobile.matches("[6-9][0-9]{9}"))
        {
        	System.out.println("Mobilenumber must be 10 digit");
        }
		}
		while(!tempmobile.matches("[6-9][0-9]{9}"));
		mobileNo=Long.parseLong(tempmobile);
		
		do
		{
        System.out.println("enter Email id");
          email=sc.nextLine();
          if(email.isEmpty())
          {
			  System.out.println("email cant be empty");
          }		
          if(!email.matches("[a-z][a-z0-9]+[@][a-z]+[.][a-z]+"))
          {
        	  System.out.println("email must be eg:vinoth33@gmail.com");
          }
		}
		while(!email.matches("[a-z][a-z0-9]+[@][a-z]+[.][a-z]+"));
		
		do 
		{
        System.out.println("enter the Address");
         Address=sc.nextLine();
         if( Address.isEmpty())
         {
			  System.out.println("Address cant be empty");
         }
		}
		while(Address.isEmpty());
        user =new Users( Name,password,mobileNo,email,Address);
        UserDao.inserUser(user);
		
		case 2:
			 user=new Users();
			 String  email_id=null;
			 do{
			 System.out.println("LOGIN");
			 do
			 {
			System.out.println("Enter the email");
		     email_id=sc.nextLine();
		     if(email_id.isEmpty())
		     {
				  System.out.println("email cant be empty");
			}
	          if(!email_id.matches("[a-z][a-z0-9]+[@][a-z]+[.][a-z]+"))
	          {
	        	  System.out.println("email must be eg:vinoth33@gmail.com");
	          }
			}
			 while(!email_id.matches("[a-z][a-z0-9]+[@][a-z]+[.][a-z]+"));
			 
			 do 
			 {
		    System.out.println("Enter the password");
		    password =sc.nextLine();
		    if(password.isEmpty())
		    {
				  System.out.println("password cant be empty");
			}
			if(!password.matches("[a-zA-Z0-9@#!.&]{8,16}"))
			{
				System.out.println("password should be 8 character");
			}
			}
			 while(!password.matches("[a-zA-Z0-9@#!.&]{8,16}"));
			 
			UserDao currentUser=new UserDao();
			user=currentUser.validateUser(email_id,password);
			if(user!=null)
			{
			System.out.println("Welcome "+user.getName());
			
			} else {
				System.out.println("invalid email or password ");
			}
	
			 }while(user==null);
		
		
		}
	
}
}