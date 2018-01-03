package com.niit.BEDao;

import java.util.List;

import com.niit.BEmodel.Job;



public interface JobDAO {
	public boolean saveJobs(Job jobs);

	public boolean deleteJobs(Job jobs);

	public boolean updateJobs(Job jobs);

	public Job getJobs(int jobId);

	public List<Job> getAllJobs();

	List<Job> ShowAllJobs();
}
