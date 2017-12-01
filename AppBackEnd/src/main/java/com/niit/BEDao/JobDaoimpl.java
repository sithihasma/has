package com.niit.BEDao;

import java.util.List;
import java.util.logging.Logger;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.BEmodel.Job;

public class JobDaoimpl implements JobDAO {
	public static final Logger log = Logger.getLogger(UserDaoImpl.class.getName());
    @Autowired
	private SessionFactory sessionfactory;
    public JobDaoimpl (SessionFactory sessionfactory){
    	this.sessionfactory=sessionfactory;
    }
	public boolean save(Job job) {
		try {
			sessionfactory.getCurrentSession().save(job);
			return true;
		} catch (HibernateException e) {
			
			e.printStackTrace();
			return false;
		}	

	}
	public boolean update(Job job) {
		try{
			sessionfactory.getCurrentSession().update(job);
			return true;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		    return false;
		}

	}
	public boolean delete(Job job) {
		try{
			sessionfactory.getCurrentSession().delete(job);
			return true;
			
		}
		catch(Exception e)
		{
			log.info("Exception occured :::"+e);
		    return false;
		}

	}
	public Job get(String id) {
		// TODO Auto-generated method stub
		return (Job) sessionfactory.openSession().get(Job.class, id);
	}
	public List<Job> list() {
		String hql ="from Job";
		Query query=sessionfactory.getCurrentSession().createQuery(hql);
		return query.list();
	}
	

}
