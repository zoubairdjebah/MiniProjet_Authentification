package miniProjet.dao;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Session;

public class GenericDaoImpl<T> implements IGenericDao<T> {

	SessionFactory sf = SessionFactoryUtil.getInstance().getSessionFactory();
	Transaction tx = null;
	Session s;
	
	@Override
	public Long insert(T t) {
		
		try {
			s = sf.openSession();
			tx = s.beginTransaction();
			Long id = (Long) s.save(t);
			tx.commit();
			return id ;
		} catch (Exception e) {
			if(tx != null)
				tx.rollback();
			return null;
		}
	}

	@Override
	public boolean update(T t) {
		try {
			s = sf.openSession();
			tx = s.beginTransaction();
			s.update(t);
			tx.commit();
			return true ;
		} catch (Exception e) {
			if(tx != null)
				tx.rollback();
			return false;
		}
	}

	@Override
	public boolean delete(T t) {
		try {
			s = sf.openSession();
			tx = s.beginTransaction();
		    s.delete(t);
			tx.commit();
			return true ;
		} catch (Exception e) {
			if(tx != null)
				tx.rollback();
			return false;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> select(T t) {
		Class<T> clazz = (Class<T>) t.getClass();

		Field[] attributs = clazz.getDeclaredFields();

		String hql = "from " + clazz.getSimpleName() + " where 1=1 ";
		for (Field f : attributs) {
			String first = "" + f.getName().charAt(0);
			String nameGetter = "get" + f.getName().replaceFirst(first, first.toUpperCase());
			try {

				Method m = clazz.getDeclaredMethod(nameGetter);
				Object valeur = m.invoke(t, null);
				System.out.println(f.getName() + ": " + valeur);

				if (valeur != null && !"".equals(valeur)) {

					hql += " AND " + f.getName() + "='" + valeur + "'";
				}

			} catch (NoSuchMethodException | SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println(hql);
		Session s = sf.openSession();
		Query query = s.createQuery(hql);

		return query.list();
	}

	

}
