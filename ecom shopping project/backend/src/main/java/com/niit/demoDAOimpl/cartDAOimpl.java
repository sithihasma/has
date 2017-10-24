package com.niit.demoDAOimpl;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.demoDAO.cartDAO;
import com.niit.demomodel.cart;

@Repository("cartDAOimpl")
public class cartDAOimpl implements cartDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
}
	public void save(cart Cart) {
		// TODO Auto-generated method stub
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.save(Cart);
		s.getTransaction().commit();
		s.close();
		
	}

	
	public cart getid(int cartid) {
		
		return (cart)sessionFactory.openSession().get(cart.class,cartid);
	}

	
	public boolean update(cart Cart) {
		
try
{
	sessionFactory.getCurrentSession().update(Cart);
	return true;
}
catch(Exception e)
{
	System.out.println("Exception arised"+e);
	return false;
}
		
		
	}

	
	public boolean delete(cart c) {
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
				
	}

	
	@SuppressWarnings("unchecked")
	public List<cart> getAll() {
		Session s=sessionFactory.openSession();
		List<cart> clist=s.createCriteria(cart.class).list();
		s.close();
		return clist;
	}


	public cart findById(int cartid) {
		return (cart)sessionFactory.openSession().get(cart.class,cartid);
	}
	
	public boolean addToCart(cart c) {
		// TODO Auto-generated method stub
		return false;
	}
 
}

