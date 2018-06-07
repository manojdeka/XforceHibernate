package com.dev.dao;

import com.dev.beans.UserInfo;

public interface UserInfoDAO {

	boolean  CreateProfile(UserInfo user);
	UserInfo SearchStudent(int id);
	boolean UpdatePassword(int id,String password,String npass, String npass2);
	boolean DeleteUser(int id,String password);
}
