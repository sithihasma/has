package com.niit.BEmodel;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Job  implements Serializable {
private static final long serialVersionUID = 190898412L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int JObId;
	private String Jobprofile;
	private String JobDesc;
	private String Qualification;
	private String Status;
	private Date PostDate;
	public int getJObId() {
		return JObId;
	}
	public void setJObId(int jObId) {
		JObId = jObId;
	}
	public String getJobProfile() {
		return Jobprofile;
	}
	public void setJobProfile(String jobProfile) {
		Jobprofile = jobProfile;
	}
	public String getJobDesc() {
		return JobDesc;
	}
	public void setJobDesc(String jobDesc) {
		JobDesc = jobDesc;
	}
	public String getQualification() {
		return Qualification;
	}
	public void setQualification(String qualification) {
		Qualification = qualification;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public Date getPostDate() {
		return PostDate;
	}
	public void setPostDate(Date postDate) {
		PostDate = postDate;
	}
	
	

}
