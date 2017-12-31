package com.niit.BEDao;

import java.util.List;

import com.niit.BEmodel.Forum;



public interface ForumDAO {
	public boolean addForum(Forum forum);
	public boolean updateForum(Forum forum);
	public boolean deleteForum(Forum forum);
	public Forum getForum(int forumId);
	public List<Forum> getAllForums();
}

