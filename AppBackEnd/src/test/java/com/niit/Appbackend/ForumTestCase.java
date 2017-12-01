package com.niit.Appbackend;

import static org.junit.Assert.*;

import java.util.logging.Logger;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.BEDao.BlogDAO;
import com.niit.BEDao.ForumDAO;
import com.niit.BEDao.UserDaoImpl;
import com.niit.BEmodel.Blog;
import com.niit.BEmodel.Forum;

public class ForumTestCase {
	public static final Logger log = Logger.getLogger(UserDaoImpl.class.getName());
	static ForumDAO forumDao;
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext annotationConfigAppContext=new AnnotationConfigApplicationContext();
		annotationConfigAppContext.scan("com.niit");
		
		annotationConfigAppContext.refresh(); 
	    forumDao= (ForumDAO)annotationConfigAppContext.getBean("forumDao");
	
		
	}
	@Test
	public void addForumTest() {
		Forum forum =new Forum();
		forum.setForumName("Advanced Java");
		forum.setForumContents("it is based on Advance Java concept");
	    forum.setStatus("B");
		forum.setUserID(3);
		forum.setCreateDate(new java.util.Date());
		
		assertTrue("problems in inserting blog",forumDao.addForum(forum));
	}

}
