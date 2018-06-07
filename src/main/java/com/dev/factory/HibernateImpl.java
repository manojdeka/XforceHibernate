package com.dev.factory;

import com.dev.beans.UserInfo;
import com.dev.dao.UserInfoDAO;

public class HibernateImpl implements UserInfoDAO {

	
	public String toString()
	{
		return "HIBERNATE"; 
	}

	@Override
	public boolean CreateProfile(UserInfo user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserInfo SearchStudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean UpdatePassword(int id, String Opassword, String npass, String npass2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean DeleteUser(int id, String password) {
		// TODO Auto-generated method stub
		return false;
	}

}
