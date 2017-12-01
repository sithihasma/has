package com.niit.BEDao;

import java.util.List;


import java.util.logging.Logger;


import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.BEmodel.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
public static final Logger log = Logger.getLogger(UserDaoImpl.class.getName());
	
	@Autowired
	private SessionFactory sessionfactory;
	
	
	public SessionFactory getSessionfactory() {
		return sessionfactory;
	}


	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}
			
	
	@Transactional
	public boolean saveUser(User user) {
		log.info("****Starting save method in UserDaoImpl***");
		try {
			sessionfactory.getCurrentSession().save(user);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}	

}


	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		try
		{
			sessionfactory.getCurrentSession().save(user);
			return true;
			
		}
		catch(Exception e)
		{
			log.info("Exception Arised:::"+e);
			return false;
		}
		
	}


	public boolean updateOnlineStatus(String status, User user) {
		// TODO Auto-generated method stub
		try
		{
			user.setIsOnline(status);
			sessionfactory.getCurrentSession().save(user);
			return true;
			
		}
		catch(Exception e)
		{
			log.info("Exception Arised:::"+e);
			return false;
		}
	}
		
public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}
}
