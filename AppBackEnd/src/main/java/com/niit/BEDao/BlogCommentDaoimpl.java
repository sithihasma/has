package com.niit.BEDao;

import java.util.List;
import java.util.logging.Logger;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.BEmodel.BlogComment;

public class BlogCommentDaoimpl implements BlogCommentDAO {
	public static final Logger log = Logger.getLogger(UserDaoImpl.class.getName());
    @Autowired
	private SessionFactory sessionfactory;
    public BlogCommentDaoimpl (SessionFactory sessionfactory){
    	this.sessionfactory=sessionfactory;
    }
	public boolean save(BlogComment blogcomment) {
		try
		{
			sessionfactory.getCurrentSession().save(blogcomment);
			return true;
			}
		catch(HibernateException e){
			e.printStackTrace();
			return false;
			
		}
	}
	public int getMaxId() {
		String hql  ="select max(id) from BlogComment";
		Query query =sessionfactory.getCurrentSession().createQuery(hql);
		return (Integer)query.uniqueResult();
	}
	public List<BlogComment> getAllComments() {
		String hql="from BlogComment";
		Query query =sessionfactory.getCurrentSession().createQuery(hql);
		return query.list();
	}

}
