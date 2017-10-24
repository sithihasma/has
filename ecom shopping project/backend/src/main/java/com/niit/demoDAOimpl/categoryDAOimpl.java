package com.niit.demoDAOimpl;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.demoDAO.categoryDAO;
import com.niit.demomodel.category;

@Repository
public class categoryDAOimpl implements categoryDAO{
	@Autowired
	private SessionFactory sessionFactory;
	 
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	
	public void save(category Cat) {
		// TODO Auto-generated method stub
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.save(Cat);
		s.getTransaction().commit();
		s.close();
		
		
	}

	
	public category getid(String c_id) {
category c=(category)sessionFactory.openSession().get(category.class, c_id);
		
		return c;
	
	}

	
	public boolean update(category Cat) {
		try
	{
		sessionFactory.getCurrentSession().update(Cat);
		return true;
	}
	catch(Exception e)
	{
		System.out.println("Exception arised"+e);
		return false;
	}
		// TODO Auto-generated method stub
		
	}

	
	public boolean delete(category c) {
		try
		{
			sessionFactory.getCurrentSession().delete(c);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("exception arised"+e);
			return false;
		}
		// TODO Auto-generated method stub
		
	}

	
	public List<category> getAllcategory() {
		Session sf =sessionFactory.openSession();
		sf.beginTransaction();
		Query query = sf.createQuery("from Category");
		List<category> list=query.list();
		System.out.println(list);
		sf.getTransaction().commit();
			return list;
	}

	public category findById(String c_id) {
		// TODO Auto-generated method stub
		return null;
	}

}


