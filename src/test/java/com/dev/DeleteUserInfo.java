package com.dev;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.dev.beans.UserInfo;

public class DeleteUserInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config= new Configuration().configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session =factory.openSession();
		
		
		session.getTransaction().begin();
		
		UserInfo user =session.get(UserInfo.class, 1);
		
		session.delete(user);
		
		session.getTransaction().commit();
		session.close();
		factory.close();
	}

}
