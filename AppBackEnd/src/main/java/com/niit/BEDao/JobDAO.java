package com.niit.BEDao;

import java.util.List;

import com.niit.BEmodel.Job;

public interface JobDAO {
	public boolean save(Job job);
	public boolean update(Job job);
	public boolean delete(Job job);
	public Job get(String id);
	public List<Job> list();

}
