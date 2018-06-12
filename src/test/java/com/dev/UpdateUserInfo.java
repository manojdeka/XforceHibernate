package com.dev;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.dev.beans.UserInfo;
import com.dev.utils.HibernateUtils;

public class UpdateUserInfo {

	public static void main(String[] args) {
		//Configuration config= new Configuration().configure();
		// File file =new File("path");
		//config.configure(configFile);;
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session =factory.openSession();
		
		//begin//
		session.getTransaction().begin();
		
		UserInfo user =session.get(UserInfo.class, 2);
		user.setFirstname("mj");
		//end//
		session.getTransaction().commit();
		System.out.println(user);
		
		
		session.close();
		factory.close();
	}

}
