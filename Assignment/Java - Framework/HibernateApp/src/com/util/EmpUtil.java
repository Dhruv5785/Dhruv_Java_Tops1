package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmpUtil {

	public static Session createSession()
	{
		SessionFactory sf = new Configuration()
				.configure()
				.buildSessionFactory();
		Session session = sf.openSession();
		return session;
				
	}
	
}
