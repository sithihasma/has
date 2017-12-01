package com.niit.Appbackend;

import static org.junit.Assert.*;


import java.util.logging.Logger;

import org.junit.BeforeClass;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.BEDao.UserDao;
import com.niit.BEDao.UserDaoImpl;
import com.niit.BEmodel.User;

public class UserTestCase {

	public static final Logger log = Logger.getLogger(UserDaoImpl.class.getName());
	static UserDao userDao;
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext annotationConfigAppContext=new AnnotationConfigApplicationContext();
		annotationConfigAppContext.scan("com.niit");
		
		annotationConfigAppContext.refresh(); 
	    userDao = (UserDao)annotationConfigAppContext.getBean("userDao");
		}
	

	@Test
	public void addBlogTest() {
		User user =new User();
		user.setUsername("Sithi");
		user.setFirstname("Hasma");
		user.setLastname("Shyrin");
		user.setPassword("shyl");
		user.setEmailId("sss@gmail.com");
		user.setIsOnline("N");
		user.setRole("Admin");
		
		assertTrue("Problm occure",userDao.addUser(user));
	}
     
}
