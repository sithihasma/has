package com.niit.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.niit.BEDao.JobDAO;
import com.niit.BEmodel.Job;


@RestController
public class JobController {

	@Autowired
	JobDAO jobsDAO;
	
	@PostMapping(value="/insertJobs")
	public ResponseEntity<String> insertJobs(@RequestBody Job jobs)
	{
		jobs.setPostDate(new java.util.Date());
		if(jobsDAO.saveJobs(jobs))
			return new ResponseEntity<String>("JObs added",HttpStatus.OK);
		else
			return new ResponseEntity<String>("Exception arised",HttpStatus.UNAUTHORIZED);
	}
	@RequestMapping(value="/getAllJobs",method=RequestMethod.GET,headers="Accept=application/json")
	public List<Job> getAllJobs(){
		return jobsDAO.getAllJobs();
	}
	@DeleteMapping("/deleteJobs/{jobId}")
	public ResponseEntity<Job> deleteJobs(@PathVariable int jobId)
	{
		Job jobs=jobsDAO.getJobs(jobId);
		jobsDAO.deleteJobs(jobs);
		return new ResponseEntity<Job>(HttpStatus.OK);
	}
	@PostMapping(value="/updateJob")
	public ResponseEntity<String> updateJobs(@RequestBody Job jobs)
	{
		Job tempJobs=jobsDAO.getJobs(jobs.getJobId());
		
		tempJobs.setJobDesc(jobs.getJobDesc());
		tempJobs.setJobProfile(jobs.getJobProfile());
		
		if(jobsDAO.updateJobs(tempJobs))
		{
			return new ResponseEntity<String>("Blog Added",HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("problem ipdating blog",HttpStatus.UNAUTHORIZED);
		}
		
	}

	
}
