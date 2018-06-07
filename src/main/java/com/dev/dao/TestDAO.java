package com.dev.dao;

import java.util.Scanner;

//import javax.servlet.RequestDispatcher;




public class TestDAO {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("enter the regno");
	    String regno = sc.nextLine();
	    
	    System.out.println("enter the password");
	    String pass = sc.nextLine();
	  
	    System.out.println("enter new pass");
	    String pass1 = sc.nextLine();
	    System.out.println("enter new pass again");
	    String pass2 = sc.nextLine();
	    
	    com.dev.beans.UserInfo user = new com.dev.beans.UserInfo();
	   
	   user.setPassword(pass);
	    
	    UserInfoDAO db = new JDBCImpl();
	    
	    boolean st = db.UpdatePassword(Integer.parseInt(regno),pass,pass1,pass2);
	    
	    if(st)
	    {
	    	System.out.println("correct");
	    }
	    else {
	    	System.out.println("incorrect");
	    }
	    
	}

}
