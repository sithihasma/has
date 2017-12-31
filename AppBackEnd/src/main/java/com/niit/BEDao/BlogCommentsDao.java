package com.niit.BEDao;

import java.util.List;

import com.niit.BEmodel.BlogComment;
public interface BlogCommentsDao {
	public boolean saveBlogComments(BlogComment blogComments);

	public boolean deleteBlogComments(BlogComment blogComments);

	public boolean updateBlogComments(BlogComment blogComments);

	public BlogComment getBlogComments(int blogCommentsId);

	public List<BlogComment> getAllBlogComments();
}
