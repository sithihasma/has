package com.niit.demo.hconfigure;
import java.util.Properties;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.demoDAOimpl.cartDAOimpl;
import com.niit.demoDAOimpl.categoryDAOimpl;
import com.niit.demoDAOimpl.ordersDAOimpl;
import com.niit.demoDAOimpl.productDAOimpl;
import com.niit.demoDAOimpl.supplierDAOimpl;
import com.niit.demoDAOimpl.userDAOimpl;
import com.niit.demomodel.cart;
import com.niit.demomodel.category;
import com.niit.demomodel.orders;
import com.niit.demomodel.product;
import com.niit.demomodel.supplier;
import com.niit.demomodel.user;

@SuppressWarnings("unused")
@Configuration
@ComponentScan("com.niit.backend")
@EnableTransactionManagement
public class hibernateconfig {
    public static Logger logger=Logger.getLogger("hibernateconfig");
    @Autowired
    @Bean(name="dataSource")
    public DataSource getDataSource()
    {
    	 DriverManagerDataSource datasource=  new DriverManagerDataSource();
    	 datasource.setDriverClassName("org.h2.Driver");
    	 datasource.setUrl("jdbc:h2:~/test");
    	 datasource.setUsername("sa");
    	 datasource.setPassword("");
    	 return datasource;
    }
    private Properties getHibernateProperties(){
    	Properties properties=new Properties();
    	properties.put("Hibernate.show_sql","true");
    	properties.put("Hibernate.dialect","org.hibernate.dialect.H2Dialect");
    	properties.put("hibernate.hbm2ddl.auto","update");
		return properties;
    	
    }
    @Autowired
    @Bean(name="sessionFactory")
    public SessionFactory getSessionFactory(DataSource datasource){
    	LocalSessionFactoryBuilder sessionBulider= new LocalSessionFactoryBuilder(datasource);
    	sessionBulider.addProperties(getHibernateProperties());
    	sessionBulider.addAnnotatedClass(user.class);
    	sessionBulider.addAnnotatedClass(category.class);
    	sessionBulider.addAnnotatedClass(product.class);
    	sessionBulider.addAnnotatedClass(supplier.class);
    	sessionBulider.addAnnotatedClass(cart.class);
    	sessionBulider.addAnnotatedClass(orders.class);
		return sessionBulider.buildSessionFactory();
    }
    @Autowired
	   @Bean(name="cartDAOimpl")
	 public cartDAOimpl getcartDAO(SessionFactory sessionfactory)
	 {
		return new cartDAOimpl(); 
	 }
	 @Autowired
	   @Bean(name="categoryDAOimpl")
	 public categoryDAOimpl getcategoryDAO(SessionFactory sessionfactory)
	 {
		return new categoryDAOimpl(); 
	 }
	 @Autowired
	   @Bean(name="ordersDAOimpl")
	 public ordersDAOimpl getordersDAO(SessionFactory sessionfactory)
	 {
		return new ordersDAOimpl(); 
	 }
	 @Autowired
	   @Bean(name="productDAOimpl")
	 public productDAOimpl getproductDAO(SessionFactory sessionfactory)
	 {
		return new productDAOimpl(); 
	 }
	 @Autowired
	   @Bean(name="supplierDAOimpl")
	 public supplierDAOimpl getsupplierDAO(SessionFactory sessionfactory)
	 {
		return new supplierDAOimpl(); 
	 }
	 @Autowired
	   @Bean(name="userDAOimpl")
	 public userDAOimpl getuserDAO(SessionFactory sessionfactory)
	 {
		return new userDAOimpl(); 
	 }
	 @Autowired
	   @Bean(name="transactionManager")
	 public HibernateTransactionManager getTransactionManager(SessionFactory sessionfactory)
	 {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionfactory);
		return transactionManager;
	 }
}




