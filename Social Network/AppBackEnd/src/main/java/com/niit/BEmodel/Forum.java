package com.niit.BEmodel;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Forum")
public class Forum implements Serializable  {
private static final long serialVersionUID = 190898412L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int forumId;
	private String forumName;
	private String forumContents;
	private int userID;
	private String status;
	private Date createDate;
	public int getForumId() {
		return forumId;
	}
	public void setForumId(int forumId) {
		this.forumId = forumId;
	}
	public String getForumName() {
		return forumName;
	}
	public void setForumName(String forumName) {
		this.forumName = forumName;
	}
	public String getForumContents() {
		return forumContents;
	}
	public void setForumContents(String forumContents) {
		this.forumContents = forumContents;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	

}
