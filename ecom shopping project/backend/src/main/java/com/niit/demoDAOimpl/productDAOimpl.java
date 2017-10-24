package com.niit.demoDAOimpl;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.demoDAO.productDAO;
import com.niit.demomodel.product;

@Repository

public class productDAOimpl  implements productDAO{
	@Autowired
	private SessionFactory sessionFactory;
	 
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	
	public void persist(product p) {
		// TODO Auto-generated method stub
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.save(p);
		s.getTransaction().commit();
		s.close();
		
	}


	public product getId(int productid) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public boolean update(product p) {
		try
		{
			sessionFactory.getCurrentSession().update(p);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception arised"+e);
			return false;
		}
		// TODO Auto-generated method stub
		
		
	}

	
	public product findById(int productid) {
		// TODO Auto-generated method stub
		return (product)sessionFactory.openSession().get(product.class,productid);
	}

	
	public List<product> getAllproduct() {
		// TODO Auto-generated method stub
		Session sf =sessionFactory.openSession();
		sf.beginTransaction();
		Query query = sf.createQuery("from product");
		List<product> list2=query.list();
		System.out.println(list2);
		System.out.println(list2);
		sf.getTransaction().commit();
			return list2;
	}


	public boolean delete(product p) {
		try
		{
			sessionFactory.getCurrentSession().delete(p);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("exception arised"+e);
			return false;
		}
			
	}

}

