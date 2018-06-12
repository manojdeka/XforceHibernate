package com.dev.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dev.beans.UserInfo;
import com.dev.dao.UserInfoDAO;
import com.dev.utils.HibernateUtils;

public class HibernateImpl implements UserInfoDAO {

	
	
	SessionFactory factory = HibernateUtils.getSessionFactory();
	@Override
	public boolean CreateProfile(UserInfo user) {
		Session session =null;
		try {
			session = factory.openSession();
			session.getTransaction().begin();
			session.save(user);
			session.getTransaction().commit();
			return true;
		} catch (Exception e) {
			return false;
		}
		finally
		{
			if(session !=null)
			{
				session.close();
				
			}
		}
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
