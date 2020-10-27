package com.atmecs.hibernate.utilities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.atmecs.hibernate.entity.Profile;
import com.atmecs.hibernate.entity.User;

	public class HibernateUtility {
		

		public static Session getHibernateSession() {
			final SessionFactory factory = new Configuration().addAnnotatedClass(User.class).addAnnotatedClass(Profile.class)
			        .configure("hibernate.cfg.xml").buildSessionFactory();
			final Session session = factory.openSession();
		    return session;
		}
}
