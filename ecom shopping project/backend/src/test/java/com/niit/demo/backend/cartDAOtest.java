package com.niit.demo.backend;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.demoDAO.cartDAO;
import com.niit.demomodel.cart;

public class cartDAOtest {

static cartDAO cartDao;
	
	
	
	@SuppressWarnings("resource")
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext annotationConfigAppContext=new AnnotationConfigApplicationContext();
		annotationConfigAppContext.scan("com.niit");
		
		annotationConfigAppContext.refresh(); 
	    cartDao =(cartDAO)annotationConfigAppContext.getBean("cartDao");
	
		
	}
	
	@Test
	public void saveTest()
	{
	cart c=new cart();
	c.setCartid(1001);
	c.setPrice(2400);
	c.setProductid(1111);
	c.setQuantity(1);
	c.setStatus("NP");
	assertTrue("problem in creatin cartitem",cartDao.addToCart(c));

}

}
