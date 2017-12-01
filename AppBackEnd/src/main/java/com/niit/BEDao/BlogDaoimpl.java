package com.niit.BEDao;
import java.util.List;

import java.util.logging.Logger;
import org.hibernate.Session;ss
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.niit.BEmodel.Blog;

@Repository("blogDao")
@Transactional
public class BlogDaoimpl implements BlogDAO {
public static final Logger log = Logger.getLogger(UserDaoImpl.class.getName());
    @Autowired
	private SessionFactory sessionfactory;

	public boolean addBlog(Blog blog) {
		try{
			sessionfactory.getCurrentSession().save(blog);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		    return false;
		}
	}

	public boolean updateBlog(Blog blog) {
		try{
			sessionfactory.getCurrentSession().update(blog);
			return true;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		    return false;
		}
	}

	public boolean deleteBlog(Blog blog) {
		try{
			sessionfactory.getCurrentSession().delete(blog);
			return true;
			
		}
		catch(Exception e)
		{
			log.info("Exception occured :::"+e);
		    return false;
		}
	}

	public Blog getBlog(int blogId) {
		Session session =sessionfactory.openSession();
		Blog blog =(Blog)session.get(Blog.class,blogId);
		session.close();
		return blog;
		
	}

	public List<Blog> getAllBlogs() {
		Session session =sessionfactory.openSession();
		@SuppressWarnings("unchecked")
		List<Blog> blogList=(List<Blog>)session.createQuery("from Blog");
		return blogList;
	}

	public boolean approveBlog(Blog blog) {
		try{
			blog.setStatus("A");
			sessionfactory.getCurrentSession().update(blog);
			return true;
		}
		catch(Exception e)
		{
			log.info("Exception occured :::"+e);
		    return false;

			
		}
		}

	public boolean rejectBlog(Blog blog) {
		try{
			blog.setStatus("N");
			sessionfactory.getCurrentSession().update(blog);
			return true;
		}
		catch(Exception e)
		{
			log.info("Exception occured :::"+e);
		    return false;

			
		}
	}
	

}
