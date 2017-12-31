package com.niit.BEDao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.niit.BEmodel.Profilepic;

@Repository("profilePictureDAO")
public class ProfilePictureDaoImpl implements ProfilePictureUploadDAO {
	@Autowired
	SessionFactory sessionFactory;

	public ProfilePictureDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	public boolean save(Profilepic pp) {
		try 
		{
			sessionFactory.getCurrentSession().save(pp);
			return true;
		} catch (Exception e) 
		{
			System.out.println("exception arised" + e);
			return false;
		}
	}

	
	public Profilepic getProfilepic(String username) {
		Session session = sessionFactory.openSession();
		Profilepic profilePicture = (Profilepic) session.get(Profilepic.class, username);
		session.close();
		return profilePicture;
	}
}
