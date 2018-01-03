package com.niit.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.BEDao.ForumDAO;
import com.niit.BEmodel.Forum;


public class ForumDaoTest {
	static ForumDAO forumDAO;
	@BeforeClass
	public static void initialize(){
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.scan("com.niit");
		annotationConfigApplicationContext.refresh();
		forumDAO=(ForumDAO) annotationConfigApplicationContext.getBean("forumDAO");
		}
	@Ignore
	@Test
	public void addForum() {
		Forum forum=new Forum();
		forum.setForumContents("forum");
		forum.setForumId(123);
		forum.setForumName("forum");
		forum.setStatus("offline");
		forum.setUserID(123);
		assertTrue("problem in adding CartItem",forumDAO.addForum(forum));
	}
	@Ignore
	@Test
	public void deleteForumTest()
	{
		Forum forum=(Forum)forumDAO.getForum(1);
		assertTrue("forum deleted",forumDAO.deleteForum(forum));
	}
	@Ignore
	@Test
	public void updateForumTest()
	{
		Forum forum=(Forum)forumDAO.getForum(2);
		forum.setForumContents("vanilla forum");
		forum.setForumName("vanilla name");
		assertTrue("forum is updated",forumDAO.updateForum(forum));
	}
	@Test
	public void getAllForumsTest()
	{
		List<Forum>forumList=(List<Forum>)forumDAO.getAllForums();
		assertNotNull("",forumList.get(0));
		for(Forum forum:forumList)
		{
			System.out.println("forum name="+forum.getForumName()+":::"+"forum Contente::"+forum.getForumContents());
					
		}
	}

}
