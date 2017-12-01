package com.niit.BEDao;

import java.util.List;
import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.BEmodel.Blog;
import com.niit.BEmodel.Forum;

@Repository("forumDao")
@Transactional
public class ForumDaoimpl implements ForumDAO {
public static final Logger log = Logger.getLogger(UserDaoImpl.class.getName());
	
	@Autowired
	private SessionFactory sessionfactory;
	
	
	public SessionFactory getSessionfactory() {
		return sessionfactory;
	}


	public boolean addForum(Forum forum) {
		try{
			sessionfactory.getCurrentSession().save(forum);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		    return false;
		}
	}


	public boolean updateForum(Forum forum) {
		try{
			sessionfactory.getCurrentSession().update(forum);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		    return false;
		}
	}


	public boolean deleteForum(Forum forum) {
		try{
			sessionfactory.getCurrentSession().delete(forum);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		    return false;
		}
	}


	public Forum getForum(int forumId) {
		Session session =sessionfactory.openSession();
		Forum forum =(Forum)session.get(Forum.class,forumId);
		session.close();
		return forum;
		
	}


	public List<Forum> getAllForum() {
		Session session =sessionfactory.openSession();
		@SuppressWarnings("unchecked")
		List<Forum> forumList=(List<Forum>)session.createQuery("from Forum");
		return forumList;
	}


	public boolean approveForum(Forum forum) {
		try{
			forum.setStatus("A");
			sessionfactory.getCurrentSession().update(forum);
			return true;
		}
		catch(Exception e)
		{
			log.info("Exception occured :::"+e);
		    return false;

			
		}
	}


	public boolean rejectForum(Forum forum) {
		try{
			forum.setStatus("N");
			sessionfactory.getCurrentSession().update(forum);
			return true;
		}
		catch(Exception e)
		{
			log.info("Exception occured :::"+e);
		    return false;

			
		}
	}


}
