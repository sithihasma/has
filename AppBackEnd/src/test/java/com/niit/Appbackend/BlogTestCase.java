package com.niit.Appbackend;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.BEDao.BlogDAO;
import com.niit.BEDao.UserDaoImpl;
import com.niit.BEmodel.Blog;


public class BlogTestCase {
	public static final Logger log = Logger.getLogger(UserDaoImpl.class.getName());
	static BlogDAO blogDao;
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext annotationConfigAppContext=new AnnotationConfigApplicationContext();
		annotationConfigAppContext.scan("com.niit");
		
		annotationConfigAppContext.refresh(); 
	    blogDao = (BlogDAO)annotationConfigAppContext.getBean("blogDao");
	
		
	}
	
	@Test
	public void addBlogTest() {
		Blog blog =new Blog();
		blog.setBlogName("core java");
		blog.setBlogContent("it is based on simple java concept");
		blog.setStatus("A");
		blog.setUserId(123);
		blog.setLikes(6);
		blog.setCreateDate(new java.util.Date());
		blog.setBlogId(1234);
		assertTrue("problems in inserting blog",blogDao.addBlog(blog));
	}
     @Ignore
     @Test
     public void getBlogTest(){
    	 Blog blog= blogDao.getBlog(2);
    	 assertNotEquals("Blog not found",blog);
    	 log.info("blog name:"+blog.getBlogName());
         log.info("blog content:"+blog.getBlogContent());
         
     }
     @Ignore
     @Test
     public void getAllBlogTest(){
    	List<Blog>blogList=(List<Blog>)blogDao.getAllBlogs();
    	assertNotNull("blog List not found",blogList.get(0));
    	for(Blog blog:blogList)
    	{
    		log.info("blog ID"+blog.getBlogId());
    		assertTrue("problem in deletion",blogDao.deleteBlog(blog));
    	}
     }
     @Ignore
     @Test
     public void deleteBlogTest(){
    	 Blog blog =(Blog)blogDao.getBlog(0);
    	 assertTrue("'Problem in deletion",blogDao.deleteBlog(blog));
    	 
     }
     @Test
     public void approveBLogTest(){
    	 Blog blog=(Blog)blogDao.getBlog(3);
    	 assertTrue("problem in approve",blogDao.approveBlog(blog));
    	 
     }
     
}
