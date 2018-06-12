package com.dev;


import com.dev.beans.UserInfo;
import com.dev.dao.UserInfoDAO;
import com.dev.factory.UserInfoDaoFactory;

public class UserOpertations {

	public static void main(String[] args) {
		
		UserInfo user =new UserInfo();
		user.setUser_id(12);
		user.setFirstname("blke");
		user.setLastname("ryer");
		user.setEmail("blaryder@gmail.com");
		user.setPassword("root");
		
		UserInfoDAO db = UserInfoDaoFactory.getDatabase();
		boolean res =db.CreateProfile(user);
		if (res)
		{
			System.out.println("success");
		}
		else
		{
			
		System.out.println("failed");
		}
		

	}

}
