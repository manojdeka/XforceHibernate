package com.dev.beans;

import com.dev.dao.UserInfoDAO;
import com.dev.factory.UserInfoDaoFactory;

public class TestFactory {
	public static void main(String[] args) {
		UserInfoDAO ref = UserInfoDaoFactory.getDatabase();
		System.out.println(ref.toString());
		UserInfoDAO ref2 = UserInfoDaoFactory.getDatabase();
		System.out.println(ref.toString());
		
		System.out.println(ref.hashCode());
		System.out.println(ref2.hashCode());
		
	}

}
