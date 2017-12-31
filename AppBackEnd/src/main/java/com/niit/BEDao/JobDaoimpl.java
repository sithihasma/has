package com.niit.BEDao;

import java.util.List;


import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.BEmodel.Job;

@Repository("jobsDAO")
public class JobDaoimpl implements JobDAO{

	@Autowired
	SessionFactory sessionFactory;
	public JobDaoimpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public boolean saveJobs(Job jobs) {
		try{
			sessionFactory.getCurrentSession().save(jobs);
			return true;
		}catch(Exception e)
		{
			System.out.println("exception arised"+e);
		}
		return false;
		
	}
	@Override
	public boolean deleteJobs(Job jobs) {
		try{
			sessionFactory.getCurrentSession().delete(jobs);
			return true;
		}catch(Exception e)
		{
			System.out.println("exception arised"+e);
		}
		return false;
		
	}
	@Override
	public boolean updateJobs(Job jobs) {
		try{
			sessionFactory.getCurrentSession().update(jobs);
			return true;
		}
		catch(Exception e){
			System.out.println("exception arised"+e);
		}
		return false;
	}
	@Override
	public Job getJobs(int jobId) {
		Session session = sessionFactory.openSession();
		Job jobs = (Job) session.get(Job.class, new Integer(jobId));
		return jobs;
	}
	@Override
	public List<Job> getAllJobs() {
		return sessionFactory.getCurrentSession().createQuery("from Jobs").list();
	}
	@Override
	public List<Job> ShowAllJobs() {
		// TODO Auto-generated method stub
		return null;
	}
	
}