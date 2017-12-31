package com.niit.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.niit.BEDao.ForumDAO;
import com.niit.BEmodel.Forum;


@RestController
public class ForumController {
	@Autowired
	ForumDAO forumDAO;
	
	@PostMapping(value="/insertForum")
	public ResponseEntity<String> insertForum(@RequestBody Forum forum)
	{
		forum.setCreateDate(new java.util.Date());
		if(forumDAO.addForum(forum))
			return new ResponseEntity<String>("Forum Added",HttpStatus.OK);
		else
			return new ResponseEntity<String>("Exception arised",HttpStatus.UNAUTHORIZED);
	}
	@RequestMapping(value="/getAllForums",method=RequestMethod.GET,headers="Accept=application/json")
	public List<Forum> getAllForums(){
		return forumDAO.getAllForums();
	}
	@GetMapping("/deleteForum/{forumId}")
	public ResponseEntity<String> deleteForum(@PathVariable("forumId") int forumId) {
		Forum tempforum = forumDAO.getForum(forumId);
		System.out.println("deletion in forum");
		if (forumDAO.deleteForum(tempforum)) 
		{			
			return new ResponseEntity<String>("forum deleted", HttpStatus.OK);
		} 
		else
		{
			return new ResponseEntity<String>("problem deleting forum", HttpStatus.UNAUTHORIZED);
		}
	}
	@PostMapping(value="/updateForum")
	public ResponseEntity<String> updateForum(@RequestBody Forum forum)
	{
		Forum tempForum=forumDAO.getForum(forum.getForumId());
		
		tempForum.setForumName(forum.getForumName());
		tempForum.setForumContents(forum.getForumContents());
		
		if(forumDAO.updateForum(tempForum))	
		{
			return new ResponseEntity<String>("forum Added",HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("problem ipdating forum",HttpStatus.UNAUTHORIZED);
		}
		
	}
}

