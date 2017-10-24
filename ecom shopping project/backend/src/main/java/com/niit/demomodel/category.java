package com.niit.demomodel;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="CATEGORY")

public class category implements Serializable {
private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="CAT_ID")
	private int catid;
	@Column(name="CAT_NAME")
	private int catname;
	public int getCatid() {
		return catid;
	}
	public void setCatid(int catid) {
		this.catid = catid;
	}
	public int getCatname() {
		return catname;
	}
	public void setCatname(int catname) {
		this.catname = catname;
	}


	

}



