package com.niit.demoDAOimpl;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.demoDAO.ordersDAO;
import com.niit.demomodel.orders;

@Repository
public class ordersDAOimpl implements ordersDAO {
	@Autowired
    private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
}

	
	public void save(orders odr) {
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.save(odr);
		s.getTransaction().commit();
		s.close();
		
		// TODO Auto-generated method stub
		
	}

	
	public orders getId(int odrid) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public boolean update(orders odr) {
		// TODO Auto-generated method stub
		try
		{
			sessionFactory.getCurrentSession().update(odr);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception arised"+e);
			return false;
		}
	}

	
	public boolean delete(orders o) {
		// TODO Auto-generated method stub
		try
		{
			sessionFactory.getCurrentSession().delete(o);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("exception arised"+e);
			return false;
		}
	}

	
	public List<orders> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public orders findById(int odr_id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
