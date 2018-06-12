package com.dev.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	private HibernateUtils() {
		
	}
	private static final SessionFactory SESSION_FACTORY =getFactory();
	private static SessionFactory getFactory() 
	{
		Configuration conf =new Configuration();
		conf.configure();
		
		return conf.buildSessionFactory();
	}
	public static SessionFactory getSessionFactory() {
		return SESSION_FACTORY;
	}
			
}
