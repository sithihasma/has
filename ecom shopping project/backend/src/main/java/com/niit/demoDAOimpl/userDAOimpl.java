package com.niit.demoDAOimpl;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.demoDAO.userDAO;
import com.niit.demomodel.user;

@Repository
public class userDAOimpl  implements userDAO{
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	 }

	
	public void persist(user u) {
		// TODO Auto-generated method stub
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.save(u);
		s.getTransaction().commit();
		s.close();
	}

	
	public user getId(int u_id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public boolean update(user u) {
		try
		{
			sessionFactory.getCurrentSession().update(u);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("exception arised"+e);
			return false;
		}

		// TODO Auto-generated method stub
		
	}

	
	public user findById(int u_id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<user> getAlluser() {
		// TODO Auto-generated method stub
		return null;
	}


	
	public boolean delete(user u) {
		// TODO Auto-generated method stub
		try
		{
			sessionFactory.getCurrentSession().delete(u);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("exception arised"+e);
			return false;
		}
		}

}

