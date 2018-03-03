package miniProjet.dao;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {
	
	private static SessionFactoryUtil instance;
	private SessionFactory sessionFactory;
	
	public static SessionFactoryUtil getInstance() {
		if (instance == null) {
			instance = new SessionFactoryUtil();
		}
		return instance;
	}
	
	private SessionFactoryUtil() {
		Configuration cfg = new Configuration();
		try {
			cfg.configure("miniProjet/dao/config/hibernate.cfg.xml");
			sessionFactory = cfg.buildSessionFactory();
		} catch (HibernateException e) {			
			e.printStackTrace();
		}

	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
