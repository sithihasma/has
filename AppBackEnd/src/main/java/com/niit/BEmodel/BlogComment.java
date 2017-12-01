package com.niit.BEmodel;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity   // here the blogid &  userid  is foriegn key 
@Table
public class BlogComment  implements Serializable {
private static final long serialVersionUID = 190898412L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	private String Comment;
	private Date CommentDate;
	private String UserName;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getComment() {
		return Comment;
	}
	public void setComment(String comment) {
		Comment = comment;
	}
	public Date getCommentDate() {
		return CommentDate;
	}
	public void setCommentDate(Date commentDate) {
		CommentDate = commentDate;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}

}
