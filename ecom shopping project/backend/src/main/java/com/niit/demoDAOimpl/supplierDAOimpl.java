package com.niit.demoDAOimpl;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.demoDAO.supplierDAO;
import com.niit.demomodel.supplier;

@Repository
public class supplierDAOimpl implements  supplierDAO {
	@Autowired
	private SessionFactory sessionFactory;
	 
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	
	public void persist(supplier s) {
		// TODO Auto-generated method stub
		Session f=sessionFactory.openSession();
		f.beginTransaction();
		f.save(s);
		f.getTransaction().commit();
		f.close();
		
	}

	
	public supplier getId(int sid) {
		// TODO Auto-generated method stub
		supplier s=(supplier)sessionFactory.openSession().get(supplier.class, sid);
		return s;
	}


	public boolean update(supplier s) {
		try
		{
			sessionFactory.getCurrentSession().update(s);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception arised"+e);
			return false;
		}
		// TODO Auto-generated method stub
		
	}

	
	public supplier findById(int sid) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<supplier> getAllsupplier() {
		// TODO Auto-generated method stub
		Session sf =sessionFactory.openSession();
		sf.beginTransaction();
		Query query = sf.createQuery("from supplier");
		List<supplier> list1=query.list();
		System.out.println(list1);
		sf.getTransaction().commit();
			return list1;
	}

}



