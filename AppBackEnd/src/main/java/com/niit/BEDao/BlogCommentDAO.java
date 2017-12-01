package com.niit.BEDao;

import java.util.List;

import com.niit.BEmodel.BlogComment;

public interface BlogCommentDAO {
	public boolean save(BlogComment blogcomment);
	public int getMaxId();
	public List<BlogComment>getAllComments();

}
