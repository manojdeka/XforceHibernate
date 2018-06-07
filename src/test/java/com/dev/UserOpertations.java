package com.dev;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.dev.beans.UserInfo;

public class UserOpertations {

	public static void main(String[] args) {
Configuration config= new Configuration().configure();
SessionFactory factory = config.buildSessionFactory();
Session session =factory.openSession();
UserInfo user =new UserInfo();
user.setUser_id(10);
user.setFirstname("blake");
user.setLastname("ryder");
user.setEmail("blakeryder@gmail.com");
user.setPassword("root");
session.getTransaction().begin();
session.save(user);
session.getTransaction().commit();
session.close();
factory.close();

	}

}
