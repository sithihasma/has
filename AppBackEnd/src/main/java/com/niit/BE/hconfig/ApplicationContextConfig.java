package com.niit.BE.hconfig;

import java.util.Properties;


import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.jboss.logging.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;



import com.niit.BEDao.ForumCommentsDao;
import com.niit.BEDao.ForumCommentsDaoImpl;
import com.niit.BEDao.ForumDAO;
import com.niit.BEDao.ForumDaoImpl;
import com.niit.BEDao.FriendDAO;
import com.niit.BEDao.FriendDaoimpl;
import com.niit.BEDao.JobDAO;
import com.niit.BEDao.JobDaoimpl;
import com.niit.BEDao.ProfilePictureDaoImpl;
import com.niit.BEDao.ProfilePictureUploadDAO;

import com.niit.BEDao.UserDao;
import com.niit.BEDao.UserDaoimpl;
import com.niit.BEmodel.Forum;
import com.niit.BEmodel.ForumComment;
import com.niit.BEmodel.Friend;
import com.niit.BEmodel.Job;
import com.niit.BEmodel.Profilepic;
import com.niit.BEmodel.UserDetail;



@Configuration
@ComponentScan("com.niit")
@EnableTransactionManagement
public class ApplicationContextConfig {
	public static Logger logger = Logger.getLogger("ApplicationContextConfig");

	public DataSource getOracleDataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		driverManagerDataSource.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		driverManagerDataSource.setUsername("system");
		driverManagerDataSource.setPassword("hasma");
		return driverManagerDataSource;
	}

	public Properties getHibernateProperties() {
		Properties properties = new Properties();
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
		properties.put("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
		return properties;
	}

	@Bean
	public SessionFactory getSessionFactory() {
		LocalSessionFactoryBuilder localSessionFactoryBuilder = new LocalSessionFactoryBuilder(getOracleDataSource());
		localSessionFactoryBuilder.addProperties(getHibernateProperties());
		
		localSessionFactoryBuilder.addAnnotatedClass(Forum.class);
		localSessionFactoryBuilder.addAnnotatedClass(ForumComment.class);
		localSessionFactoryBuilder.addAnnotatedClass(Friend.class);
		localSessionFactoryBuilder.addAnnotatedClass(Job.class);
		localSessionFactoryBuilder.addAnnotatedClass(UserDetail.class);
		localSessionFactoryBuilder.addAnnotatedClass(UserDetail.class);
		localSessionFactoryBuilder.addAnnotatedClass(Profilepic.class);


		System.out.println("SessionFactory Bean Created");
		return localSessionFactoryBuilder.buildSessionFactory();
	}

	@Bean
	public HibernateTransactionManager getHibernateTransactionManager(SessionFactory sessionFactory) {
		return new HibernateTransactionManager(sessionFactory);
	}

	@Bean
	public UserDao getUserDAO(SessionFactory sessionFactory) {
		System.out.println("User DAO object Created");
		return new UserDaoimpl(sessionFactory);
	}
	@Bean
	public ForumDAO getForumDAO(SessionFactory sessionFactory) {
		System.out.println("Forum DAO object Created");
		return new ForumDaoImpl(sessionFactory);
	}
	@Bean
	public JobDAO getJobsDAO(SessionFactory sessionFactory) {
		System.out.println("jobs DAO object Created");
		return new JobDaoimpl(sessionFactory);
	}@Bean
	public FriendDAO getFriendDAO(SessionFactory sessionFactory) {
		System.out.println("Friend DAO object Created");
		return new FriendDaoimpl(sessionFactory);
	}
	@Bean
	public ForumCommentsDao getForumCommentsDAO(SessionFactory sessionFactory) {
		System.out.println("ForumComments DAO object Created");
		return new ForumCommentsDaoImpl(sessionFactory);
	}
	
	@Bean
	public ProfilePictureUploadDAO getProfilePictureDAO(SessionFactory sessionFactory) {
		System.out.println("ProfilePicture DAO object Created");
		return new ProfilePictureDaoImpl(sessionFactory);
	}
}
